package Java_Visual_progs;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class QueueVisualizer1 extends JFrame {
    private JTextField inputField;
    private JButton enqueueButton, dequeueButton, enqueueFrontButton, dequeueBackButton;
    private JPanel queuePanel, displayPanel;
    private JComboBox<String> queueTypeSelector;
    private DefaultListModel<String> listModel;
    private JList<String> queueList;

    private Deque<String> deque = new LinkedList<>(); // Use LinkedList.java for Deque implementation
    private ArrayList<String> simpleQueue = new ArrayList<>(); // Use ArrayList for Simple Queue
    private CircularQueue circularQueue; // Existing implementation remains

    public QueueVisualizer1() {
        circularQueue = new CircularQueue(20); // Example size, adjust as needed
        createUI();
        setQueueActions();
    }

    private void createUI() {
        setTitle("DSAs.Q.Queue Visualizer");
        setSize(1920, 1080);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        inputField = new JTextField();
        enqueueButton = new JButton("Enqueue");
        dequeueButton = new JButton("Dequeue");
        enqueueFrontButton = new JButton("Enqueue Front");
        dequeueBackButton = new JButton("Dequeue Back");
        queuePanel = new JPanel(new BorderLayout());
        displayPanel = new JPanel();
        queueTypeSelector = new JComboBox<>(new String[]{"Simple DSAs.Q.Queue", "Deque", "Circular DSAs.Q.Queue"});

        JPanel topPanel = new JPanel(new GridLayout(1, 5));
        topPanel.add(inputField);
        topPanel.add(enqueueButton);
        topPanel.add(dequeueButton);
        topPanel.add(enqueueFrontButton);
        topPanel.add(dequeueBackButton);

        queuePanel.add(new JScrollPane(displayPanel), BorderLayout.CENTER);
        queuePanel.add(queueTypeSelector, BorderLayout.NORTH);

        add(topPanel, BorderLayout.NORTH);
        add(queuePanel, BorderLayout.CENTER);

        // Initially disable front/back operations
        enqueueFrontButton.setEnabled(false);
        dequeueBackButton.setEnabled(false);
    }

    private void setQueueActions() {
        enqueueButton.addActionListener(e -> {
            String item = inputField.getText();
            if (!item.isEmpty()) {
                switch (queueTypeSelector.getSelectedItem().toString()) {
                    case "Simple DSAs.Q.Queue":
                        simpleQueue.add(item);
                        break;
                    case "Deque":
                        deque.addLast(item);
                        break;
                    case "Circular DSAs.Q.Queue":
                        circularQueue.enqueue(item);
                        break;
                }
                updateQueueDisplay();
                inputField.setText("");
            }
        });

        dequeueButton.addActionListener(e -> {
            switch (queueTypeSelector.getSelectedItem().toString()) {
                case "Simple DSAs.Q.Queue":
                    if (!simpleQueue.isEmpty()) {
                        simpleQueue.remove(0);
                    }
                    break;
                case "Deque":
                    if (!deque.isEmpty()) {
                        deque.removeFirst();
                    }
                    break;
                case "Circular DSAs.Q.Queue":
                    circularQueue.dequeue();
                    break;
            }
            updateQueueDisplay();
        });

        enqueueFrontButton.addActionListener(e -> {
            String item = inputField.getText();
            if (!item.isEmpty() && "Deque".equals(queueTypeSelector.getSelectedItem().toString())) {
                deque.addFirst(item);
                updateQueueDisplay();
                inputField.setText("");
            }
        });

        dequeueBackButton.addActionListener(e -> {
            if (!deque.isEmpty() && "Deque".equals(queueTypeSelector.getSelectedItem().toString())) {
                deque.removeLast();
                updateQueueDisplay();
            }
        });

        queueTypeSelector.addActionListener(e -> {
            boolean isDeque = "Deque".equals(queueTypeSelector.getSelectedItem().toString());
            enqueueFrontButton.setEnabled(isDeque);
            dequeueBackButton.setEnabled(isDeque);
        });
    }

    private void updateQueueDisplay() {
        displayPanel.removeAll();
        displayPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10)); // Horizontal layout with spacing

        switch (queueTypeSelector.getSelectedItem().toString()) {
            case "Simple DSAs.Q.Queue":
                for (String item : simpleQueue) {
                    displayPanel.add(createBox(item));
                }
                break;
            case "Deque":
                for (String item : deque) {
                    displayPanel.add(createBox(item));
                }
                break;
            case "Circular DSAs.Q.Queue":
                updateCircularQueueDisplay();
                break;
        }

        displayPanel.revalidate();
        displayPanel.repaint();
    }

    private void updateCircularQueueDisplay() {
        displayPanel.removeAll();
        displayPanel.setLayout(null); // Absolute positioning for circular layout

        int radius = Math.min(displayPanel.getWidth(), displayPanel.getHeight()) / 3;
        int centerX = displayPanel.getWidth() / 2;
        int centerY = displayPanel.getHeight() / 2;

        int numItems = circularQueue.count;
        double angleStep = 2 * Math.PI / numItems;
        double currentAngle = 0;

        for (int i = 0; i < numItems; i++) {
            int itemIndex = (circularQueue.head + i) % circularQueue.items.length;
            String item = circularQueue.items[itemIndex];
            if (item != null) {
                JPanel itemPanel = createBox(item);
                int x = (int) (centerX + radius * Math.cos(currentAngle)) - itemPanel.getWidth() / 2;
                int y = (int) (centerY + radius * Math.sin(currentAngle)) - itemPanel.getHeight() / 2;
                itemPanel.setBounds(x, y, itemPanel.getWidth(), itemPanel.getHeight());
                displayPanel.add(itemPanel);
                currentAngle += angleStep;
            }
        }

        displayPanel.revalidate();
        displayPanel.repaint();
    }


    private JPanel createBox(String content) {
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setColor(Color.WHITE);
                g2d.fill(new Rectangle2D.Double(0, 0, getWidth(), getHeight()));
                g2d.setColor(Color.BLACK);
                g2d.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
                g2d.drawString(content, getWidth() / 4, getHeight() / 2 + 5);
            }
        };
        panel.setPreferredSize(new Dimension(100, 50)); // Consistent size for readability
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            QueueVisualizer1 ex = new QueueVisualizer1();
            ex.setVisible(true);
        });
    }
}


class CircularQueue {
    public String[] items;
    public int head = 0;
    private int tail = 0;
    public int count = 0;

    public CircularQueue(int size) {
        items = new String[size];
    }

    public void enqueue(String item) {
        if (count < items.length) {
            items[tail] = item;
            tail = (tail + 1) % items.length;
            count++;
        } else {
            // Handle full queue (e.g., throw an exception or print a message)
        }
    }

    public void dequeue() {
        if (count > 0) {
            items[head] = null;
            head = (head + 1) % items.length;
            count--;
        }
    }

    public String[] getItems() {
        String[] result = new String[count];
        int j = 0;  // Index for result array
        for (int i = head; i < items.length; i++) {
            if (items[i] != null) {
                result[j] = items[i];
                j++;
            }
        }
        for (int i = 0; i < head; i++) {
            if (items[i] != null) {
                result[j] = items[i];
                j++;
            }
        }
        return result;
    }
}
