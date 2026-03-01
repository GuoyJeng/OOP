import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Map extends JPanel {
    private final int rows = 10;
    private final int cols = 10;
    private final int cellSize = 50; // Pixels per square
    private final int[][] map = new int[rows][cols];
    private int hoverRow = -1;
    private int hoverCol = -1;
    public Map() {
        this.setBackground(Color.BLACK);
        generateRandomMap(); // เรียกใช้ฟังก์ชันสุ่มตอนสร้าง Object
        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                Point cell = getGridPoint(e.getX(), e.getY());
                int row = cell.y;
                int col = cell.x;

                if (row >= 0 && row < rows && col >= 0 && col < cols) {
                    if (hoverRow != row || hoverCol != col) {
                        hoverRow = row;
                        hoverCol = col;
                        repaint();
                    }
                } else {
                    if (hoverRow != -1) {
                        hoverRow = -1;
                        hoverCol = -1;
                        repaint();
                    }
                }
            }
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
            }
        });
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                Point cell = getGridPoint(e.getX(), e.getY());
                int row = cell.y;
                int col = cell.x;

                if (row >= 0 && row < rows && col >= 0 && col < cols) {
                    int cellValue = map[row][col];

                    if (cellValue == 0) {
                        System.out.println("คลิกช่องนี้สีเขียว (ค่าคือ 0)");
                    } else if (cellValue == 1) {
                        System.out.println("คลิกช่องนี้สีน้ำเงิน (ค่าคือ 1)");
                    }
                }
            }
        });
    }

    private Point getGridPoint(int mouseX, int mouseY) {
        int startX = (getWidth() - (cols * cellSize)) / 2;
        int startY = (getHeight() - (rows * cellSize)) / 2;
        int row = (mouseY - startY) / cellSize;
        int relativeX = mouseX - startX;
        int col;

        if (row >= 0 && row < rows && row % 2 == 0) {
            // แถวคู่ ภาพถูกเลื่อนไปทางซ้าย cellSize/2 ดังนั้นต้องบวกคืนก่อนคำนวณ index
            col = (relativeX + (cellSize / 2)) / cellSize;
        } else {
            col = relativeX / cellSize;
        }
        return new Point(col, row);
    }

    private void generateRandomMap() {
        Random rand = new Random();
        double obstacleChance = 0.2; // กำหนดโอกาสพื้นที่
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // ถ้าสุ่มได้ค่าน้อยกว่าค่า obstacleChance ให้เป็น 1 นอกนั้นเป็น 0
                if (rand.nextDouble() < obstacleChance) {
                    map[i][j] = 1;
                } else {
                    map[i][j] = 0;
                }
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int startX = (getWidth() - (cols * cellSize)) / 2;
        int startY = (getHeight() - (rows * cellSize)) / 2;
        Graphics2D g2d = (Graphics2D) g;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int x = startX + j * cellSize;
                int y = startY + i * cellSize;
                int drawX = x;
                int drawW = cellSize;

                // คำนวณค่า x และ ค่า width เพราะจะไม่ให้มันคำนวณครึ่งช่อง
                if (i % 2 == 0) {
                    if (j == 0) {
                        drawW = cellSize / 2;
                    } else {
                        drawX = x - cellSize / 2;
                    }
                }

                if (j == 0 && i % 2 == 0) {
                    g2d.setColor(Color.black);
                    continue;
                }

                //สุ่มตำแหน่งพื้นที่เล่น
                if (map[i][j] == 1) {
                    g2d.setColor(Color.BLUE);
                } else {
                    g2d.setColor(Color.GREEN);
                }
                g2d.fillRect(drawX, y, drawW, cellSize);

                //เช็คว่าเมาส์อยู่ในตำแหน่งเดียวกับช่องสีเปลาส
                if (i == hoverRow && j == hoverCol) {
                    g2d.setColor(Color.WHITE);
                } else {
                    g2d.setColor(Color.black);
                }
                g2d.setStroke(new BasicStroke(2));
                g2d.drawRect(drawX, y, drawW, cellSize);
            }
        }
    }
    public static void main() {
        JFrame frame = new JFrame("Test Map");
        frame.add(new Map(), BorderLayout.CENTER);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}