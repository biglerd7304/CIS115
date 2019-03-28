import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

public class M3HW_2_Bigler extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Triforce");
        Canvas canvas = new Drawing();
        canvas.setSize(400, 400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        g.CanvasRenderingContext2D.beginPath(200, 100)
        CanvasRenderingContext2D.lineTo(150, 150)
        CanvasRenderingContext2D.lineTo(250, 150)
        CanvasRenderingContext2D.closePath()

        g.CanvasRenderingContext2D.beginPath(150, 150)
        CanvasRenderingContext2D.lineTo(100, 200)
        CanvasRenderingContext2D.lineTo(200, 200)
        CanvasRenderingContext2D.closePath()

        g.CanvasRenderingContext2D.beginPath(250, 150)
        CanvasRenderingContext2D.lineTo(200, 200)
        CanvasRenderingContext2D.lineTo(300, 200)
        CanvasRenderingContext2D.closePath()

        g.setColor(Color.yellow);
    }
}