package Java_Visual_progs;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.awt.geom.Ellipse2D;

public class QueueVisualizer extends JFrame {
    private JTextField inputField;
    private JButton enqueueButton, dequeueButton, enqueueFrontButton, dequeueBackButton;
    private JPanel queuePanel, displayPanel;
    private JComboBox<String> queueTypeSelector;
    private DefaultListModel<String> listModel;
    private JList<String> queueList;

    private SimpleQueue simpleQueue = new SimpleQueue();
    private Deque<String> deque = new ArrayDeque<>();
    private CircularQueue circularQueue = new CircularQueue(5); // Example size

    public QueueVisualizer() {
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
        queueTypeSelector = new JComboBox<>(new String[]{"SimpleQueue", "Deque", "CircularQueue"});

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
                    case "SimpleQueue":
                        simpleQueue.enqueue(item);
                        break;
                    case "Deque":
                        deque.addLast(item);
                        break;
                    case "CircularQueue":
                        circularQueue.enqueue(item);
                        break;
                }
                updateQueueDisplay();
                inputField.setText("");
            }
        });

        dequeueButton.addActionListener(e -> {
            switch (queueTypeSelector.getSelectedItem().toString()) {
                case "SimpleQueue":
                    simpleQueue.dequeue();
                    break;
                case "Deque":
                    if (!deque.isEmpty()) {
                        deque.removeFirst();
                    }
                    break;
                case "CircularQueue":
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
        displayPanel.setLayout(new GridLayout(0, 1)); // Simple vertical layout for simplicity

        switch (queueTypeSelector.getSelectedItem().toString()) {
            case "SimpleQueue":
                for (String item : simpleQueue.getItems()) {
                    displayPanel.add(createBox(item));
                }
                break;
            case "Deque":
                for (String item : deque) {
                    displayPanel.add(createBox(item));
                }
                break;
            case "CircularQueue":
                updateCircularQueueDisplay();
                break;
        }
        displayPanel.revalidate();
        displayPanel.repaint();
    }

    private void updateCircularQueueDisplay() {
        displayPanel.removeAll();
        displayPanel.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);

        int radius = Math.min(displayPanel.getWidth(), displayPanel.getHeight()) / 3;
        int centerX = displayPanel.getWidth() / 2;
        int centerY = displayPanel.getHeight() / 2;

        String[] items = circularQueue.getItems();
        double angleStep = 2 * Math.PI / items.length;
        double currentAngle = 0;

        for (String item : items) {
            JPanel itemPanel = createBox(item);
            int x = (int) (centerX + radius * Math.cos(currentAngle));
            int y = (int) (centerY + radius * Math.sin(currentAngle));
            constraints.gridx = 0;
            constraints.gridy = 0;
            constraints.anchor = GridBagConstraints.CENTER;
            displayPanel.add(itemPanel, constraints);
            currentAngle += angleStep;
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
                Ellipse2D.Double circle = new Ellipse2D.Double(0, 0, getWidth(), getHeight());
                g2d.setColor(Color.WHITE);
                g2d.fill(circle);
                g2d.setColor(Color.BLACK);
                g2d.draw(circle);
                g2d.drawString(content, getWidth() / 4, getHeight() / 2 + 5);
            }
        };
        panel.setPreferredSize(new Dimension(60, 60));
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            QueueVisualizer ex = new QueueVisualizer();
            ex.setVisible(true);
        });
    }
}

// SimpleQueue and CircularQueue classes remain unchanged
class SimpleQueue {
    private Deque<String> queue = new ArrayDeque<>();

    public void enqueue(String item) {
        queue.addLast(item);
    }

    public void dequeue() {
        if (!queue.isEmpty()) {
            queue.removeFirst();
        }
    }

    public String[] getItems() {
        return queue.toArray(new String[0]);
    }
}

class CircularQueue1 {
    private String[] items;
    private int head = 0;
    private int tail = 0;
    private int count = 0;



    public CircularQueue1(int size) {
        items = new String[size];
    }

    public void enqueue(String item) {
        if (count < items.length) {
            items[tail] = item;
            tail = (tail + 1) % items.length;
            count++;
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
        for (int i = 0; i < count; i++) {
            result[i] = items[(head + i) % items.length];
        }
        return result;
    }
}
