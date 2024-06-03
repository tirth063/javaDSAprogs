import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

public class QueueVisualizer1 extends JFrame {

    private JTextField inputField;
    private JButton enqueueButton, dequeueButton, enqueueFrontButton, dequeueBackButton;
    private JPanel queuePanel, displayPanel;
    private JComboBox<String> queueTypeSelector;


    private final Deque<String> deque = new LinkedList<>(); // Use LinkedList.java for Deque implementation
    private final ArrayList<String> simpleQueue = new ArrayList<>(); // Use ArrayList for Simple Queue
    private final CircularQueue circularQueue; // Existing implementation remains

    public QueueVisualizer1() {
        circularQueue = new CircularQueue(); // Example size, adjust as needed
        createUI();
        setQueueActions();
    }

    private void createUI() {
        setTitle("DSAs.Q.Queue Visualizer");
        setSize(1920, 1080);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Input field and buttons
        inputField = new JTextField();
        enqueueButton = new JButton("Enqueue");
        dequeueButton = new JButton("Dequeue");
        enqueueFrontButton = new JButton("Enqueue Front");
        dequeueBackButton = new JButton("Dequeue Back");

        // Queue panel with selector and display
        queuePanel = new JPanel(new BorderLayout());
        queueTypeSelector = new JComboBox<>(new String[]{"Simple DSAs.Q.Queue", "Deque", "Circular DSAs.Q.Queue"});
        displayPanel = new JPanel();
        queuePanel.add(new JScrollPane(displayPanel), BorderLayout.CENTER);
        queuePanel.add(queueTypeSelector, BorderLayout.NORTH);

        // Top panel for input and buttons
        JPanel topPanel = new JPanel(new GridLayout(1, 5));
        topPanel.add(inputField);
        topPanel.add(enqueueButton);
        topPanel.add(dequeueButton);
        topPanel.add(enqueueFrontButton);
        topPanel.add(dequeueBackButton);

        // Add panels to main frame
        add(topPanel, BorderLayout.NORTH);
        add(queuePanel, BorderLayout.CENTER);

        // Initially disable front/back operations for Deque
        enqueueFrontButton.setEnabled(false);
        dequeueBackButton.setEnabled(false);
    }

    private void setQueueActions() {
        enqueueButton.addActionListener(e -> {
            String item = inputField.getText();
            if (!item.isEmpty()) {
                switch (Objects.requireNonNull(queueTypeSelector.getSelectedItem()).toString()) {
                    case "Simple DSAs.Q.Queue":
                        simpleQueue.add(item);
                        break;
                    case "Deque":
                        deque.addLast(item);
                        break;
                    case "Circular DSAs.Q.Queue":
                        circularQueue.enQueue(Integer.parseInt(item));
                        break;
                }
                updateQueueDisplay();
                inputField.setText("");
            }
        });

        dequeueButton.addActionListener(e -> {
            switch (Objects.requireNonNull(queueTypeSelector.getSelectedItem()).toString()) {
                case "Simple DSAs.Q.Queue":
                    if (!simpleQueue.isEmpty()) {
                        simpleQueue.removeFirst();
                    }
                    break;
                case "Deque":
                    if (!deque.isEmpty()) {
                        deque.removeFirst();
                    }
                    break;
                case "Circular DSAs.Q.Queue":
                    circularQueue.deQueue();
                    break;
            }
            updateQueueDisplay();
        });

        enqueueFrontButton.addActionListener(e -> {
            String item = inputField.getText();
            if (!item.isEmpty() && "Deque".equals(Objects.requireNonNull(queueTypeSelector.getSelectedItem()).toString())) {
                deque.addFirst(item);
                updateQueueDisplay();
                inputField.setText("");
            }
        });

        dequeueBackButton.addActionListener(e -> {
            if (!deque.isEmpty() && "Deque".equals(Objects.requireNonNull(queueTypeSelector.getSelectedItem()).toString())) {
                deque.removeLast();
                updateQueueDisplay();
            }
        });

        queueTypeSelector.addActionListener(e -> {
            boolean isDeque = "Deque".equals(Objects.requireNonNull(queueTypeSelector.getSelectedItem()).toString());
            enqueueFrontButton.setEnabled(isDeque);
            dequeueBackButton.setEnabled(isDeque);
        });
    }

    private void updateQueueDisplay() {
        displayPanel.removeAll();
        displayPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10)); // Horizontal layout with spacing

        switch (Objects.requireNonNull(queueTypeSelector.getSelectedItem()).toString()) {
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

        // Calculate dimensions and center coordinates
        int radius = Math.min(displayPanel.getWidth(), displayPanel.getHeight()) / 3;
        int centerX = displayPanel.getWidth() / 2;
        int centerY = displayPanel.getHeight() / 2;

        // Get elements and calculate angle step for even spacing
        int numItems = circularQueue.getSize();
        double angleStep = 2 * Math.PI / (numItems > 0 ? numItems : 1); // Avoid division by zero
        double currentAngle = 0;

        for (int i = 0; i < numItems; i++) {
            int itemIndex = (circularQueue.getFront() + i) % circularQueue.getQ().length;
            int item = circularQueue.getQ()[itemIndex];
            JPanel itemPanel = createBox(String.valueOf(item));

            // Calculate precise x and y coordinates for centered placement on circle
            int x = (int) (centerX + radius * Math.cos(currentAngle)) - itemPanel.getWidth() / 2;
            int y = (int) (centerY + radius * Math.sin(currentAngle)) - itemPanel.getHeight() / 2;

            itemPanel.setBounds(x, y, itemPanel.getWidth(), itemPanel.getHeight());
            displayPanel.add(itemPanel);
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
    private int[] q;
    private int f = -1;
    private int r = -1;

    public CircularQueue() {
        q = new int[20];
    }

    public boolean isFull() {
        return ((f == 0 && r == q.length - 1) || (f == r + 1));
    }

    public boolean isEmpty() {
        return f == -1;
    }

    public void enQueue(int val) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (f == -1) f = 0;
            r = (r + 1) % q.length;
            q[r] = val;
        }
    }

    public void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            if (f == r) {
                f = r = -1;
            } else {
                System.out.println(q[f] + "Is Deleted");
                f = (f + 1) % q.length;
            }
        }
    }

    public void printq() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = f; i != r; i = (i + 1) % q.length) {
            System.out.println(q[i] + " ");
        }
        System.out.println(q[r]);
    }

    public int getSize() {
        if (isEmpty()) {
            return 0;
        } else if (r >= f) {
            return r - f + 1;
        } else {
            return q.length - f + r + 1;
        }
    }

    public int[] getQ() {
        return q;
    }

    public int getFront() {
        return f;
    }

    public int getRear() {
        return r;
    }

/*    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue();
        cq.enQueue(10);
        cq.enQueue(20);
        cq.enQueue(30);
        cq.enQueue(40);
        cq.enQueue(50);
        cq.enQueue(60);
        cq.printq();
        System.out.println();
        cq.deQueue();
        cq.deQueue();
        cq.printq();
    }*/
}
