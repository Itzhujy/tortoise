import javax.swing.*;
import java.awt.*;
import java.io.File;

public class RaceTrack extends JFrame {
    private JPanel backgroundPanel;
    private JLabel turtleLabel;
    private JLabel rabbitLabel;
    private JLabel cheetahLabel;
    private int length;

    public RaceTrack(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public RaceTrack() {
        setTitle("Turtle vs Rabbit vs Cheetah");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image image = new ImageIcon("C:\\Users\\86134\\IdeaProjects\\tortoise\\src\\素材\\view.jpg").getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };

        turtleLabel = new JLabel(new ImageIcon("C:\\Users\\86134\\IdeaProjects\\tortoise\\src\\素材\\乌龟.png"));
        rabbitLabel = new JLabel(new ImageIcon("C:\\Users\\86134\\IdeaProjects\\tortoise\\src\\素材\\兔子.png"));
        cheetahLabel = new JLabel(new ImageIcon("C:\\Users\\86134\\IdeaProjects\\tortoise\\src\\素材\\豹子.png"));

        backgroundPanel.setLayout(null);
        backgroundPanel.add(turtleLabel);
        backgroundPanel.add(rabbitLabel);
        backgroundPanel.add(cheetahLabel);

        add(backgroundPanel);

        setVisible(true);
    }

    public void updateAnimalPosition(int turtlePosition, int rabbitPosition, int cheetahPosition) {
        turtleLabel.setBounds(turtlePosition, 0, 100, 100);
        rabbitLabel.setBounds(rabbitPosition, 100, 100, 100);
        cheetahLabel.setBounds(cheetahPosition, 200, 100, 100);
        repaint();
    }
}


