import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventDemo extends JFrame 
{
    private JLabel label;

    public MouseEventDemo() 
    {
        setTitle("Mouse Events Demo");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        label = new JLabel("Move or Click Mouse Inside Window", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setForeground(Color.BLUE);

        add(label, BorderLayout.CENTER);

        // Mouse click events
        addMouseListener(new MouseAdapter() 
        {
            public void mouseClicked(MouseEvent e) 
            {
                label.setText("Mouse Clicked at: " + e.getX() + ", " + e.getY());
            }

            public void mousePressed(MouseEvent e) 
            {
                label.setText("Mouse Pressed");
            }

            public void mouseReleased(MouseEvent e) 
            {
                label.setText("Mouse Released");
            }

            public void mouseEntered(MouseEvent e) 
            {
                label.setText("Mouse Entered Window");
            }

            public void mouseExited(MouseEvent e) 
            {
                label.setText("Mouse Exited Window");
            }
        });

        // Mouse movement events
        addMouseMotionListener(new MouseMotionAdapter() 
        {
            public void mouseMoved(MouseEvent e) 
            {
                label.setText("Mouse Moving...");
            }

            public void mouseDragged(MouseEvent e) 
            {
                label.setText("Mouse Dragging...");
            }
        });

        setLocationRelativeTo(null); // Center window
        setVisible(true);
    }

    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new MouseEventDemo();
            }
        });
    }
}
