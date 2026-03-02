import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Map extends JPanel {
    private final int rows = 10;
    private final int cols = 10;
    private int cellSize = 50; // Pixels per square
    private final int[][] map = new int[rows][cols];
    private int hoverRow = -1;
    private int hoverCol = -1;
//    private int offsetX = 0; // ตำแหน่ง X เริ่มต้น
//    private int offsetY = 0; // ตำแหน่ง Y เริ่มต้น
//    private Point lastMousePt; // เก็บตำแหน่งเมาส์ล่าสุดที่คลิก
    public Map() {
        this.setBackground(Color.BLACK);
        generateRandomMap(); // เรียกใช้ฟังก์ชันสุ่มตอนสร้าง Object
        this.addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                // e.getWheelRotation() จะคืนค่า -1 (กลิ้งขึ้น/ซูมเข้า) หรือ 1 (กลิ้งลง/ซูมออก)
                if (e.getWheelRotation() < 0) {
                    // ซูมเข้า: เพิ่มขนาดช่อง (จำกัดไม่ให้ใหญ่เกินไป เช่น 150)
                    if (cellSize < 150) {
                        // ถ้า cellSize ไม่ได้เป็น static หรือ final คุณสามารถปรับค่าได้ที่นี่
                        // แต่ในโค้ดเดิมคุณตั้งเป็น final ไว้ ต้องเอา final ออกก่อนครับ
                        updateCellSize(5);
                    }
                } else {
                    // ซูมออก: ลดขนาดช่อง (จำกัดไม่ให้เล็กเกินไป เช่น 10)
                    if (cellSize > 10) {
                        updateCellSize(-5);
                    }
                }
            }
        });
        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
//                System.out.println(e.getX() + " " + e.getY());
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

    private void updateCellSize(int delta) {
        cellSize += delta;
        repaint(); // สำคัญมาก! เพื่อให้หน้าจอวาดใหม่ทันทีที่เปลี่ยนขนาด
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
        frame.setSize(1280, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}