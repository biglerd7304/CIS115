import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

public class M3HW_1_Bigler extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Circle and Square");
        Canvas canvas = new Drawing();
        canvas.setSize(400, 400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        g.drawOval(100, 10, 50, 50);
        g.drawRect(100, 100, 100, 100);
    }
}