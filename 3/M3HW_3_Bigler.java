import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

public class M3HW_3_Bigler extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("H E L O");
        Canvas canvas = new Drawing();
        canvas.setSize(400, 400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        g.CanvasRenderingContext2D.beginPath(100, 100)
        CanvasRenderingContext2D.lineTo(100, 50)
        CanvasRenderingContext2D.lineTo(100, 150)
        CanvasRenderingContext2D.lineTo(100, 100)
        CanvasRenderingContext2D.lineTo(150, 50)
        CanvasRenderingContext2D.lineTo(150, 150)
        CanvasRenderingContext2D.lineTo(150, 100)
        CanvasRenderingContext2D.closePath()

        g.CanvasRenderingContext2D.beginPath(200, 100)
        CanvasRenderingContext2D.lineTo(200, 50)
        CanvasRenderingContext2D.lineTo(250, 50)
        CanvasRenderingContext2D.lineTo(200, 50)
        CanvasRenderingContext2D.lineTo(200, 150)
        CanvasRenderingContext2D.lineTo(250, 150)
        CanvasRenderingContext2D.lineTo(200, 150)
        CanvasRenderingContext2D.lineTo(200, 100)
        CanvasRenderingContext2D.lineTo(250, 100)
        CanvasRenderingContext2D.lineTo(200, 100)
        CanvasRenderingContext2D.closePath()

        g.CanvasRenderingContext2D.beginPath(300, 100)
        CanvasRenderingContext2D.lineTo(300, 150)
        CanvasRenderingContext2D.lineTo(350, 150)
        CanvasRenderingContext2D.lineTo(300, 150)
        CanvasRenderingContext2D.lineTo(300, 100)
        CanvasRenderingContext2D.closePath()

        g.CanvasRenderingContext2D.beginPath(100, 200)
        CanvasRenderingContext2D.lineTo(100, 250)
        CanvasRenderingContext2D.lineTo(150, 250)
        CanvasRenderingContext2D.lineTo(150, 200)
        CanvasRenderingContext2D.lineTo(100, 200)
        CanvasRenderingContext2D.closePath()


    }
}