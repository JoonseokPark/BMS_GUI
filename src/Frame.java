import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Frame extends JFrame {
    final Color background = new Color(28, 29, 73);
    final Color bordernorm = new Color(51, 255, 163);
    final Color borderwatchout = new Color(197, 90, 17);
    final Color bordercaution = new Color(255, 0, 0);
    final Color letterColor = new Color(221, 220, 220);
    final Color letterWatchout = new Color(255, 192, 0);
    final Color letterCaution = borderwatchout;
    Image cautionYellow = Toolkit.getDefaultToolkit().getImage("C:\\Users\\JSPARK\\IntellijProject\\GuiTest\\src\\caution_yellow.png");
    Image cautionRed = Toolkit.getDefaultToolkit().getImage("C:\\Users\\JSPARK\\IntellijProject\\GuiTest\\src\\caution_red.png");

    public void paint(Graphics g) {
        getContentPane().setBackground(background);
    }

    public Frame() {
    }
}

class MainFrame extends Frame {
    int perTemp = 270;
    double temp = 30;

    public MainFrame() {
        JLabel temp = new JLabel("<html><body style='text-align:center;'>Temp<br />36.5ºC</body></html>");
//        setUndecorated(true);
//        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 30, 30));
        temp.setFont(new Font("clear gothic", Font.PLAIN, 30));
        temp.setForeground(new Color(231, 230, 230));
        setSize(1020, 600);
        setLocation(220, 300);
        setTitle("");
//        add(temp);
        setLayout(new FlowLayout());


        JButton bt = new JButton("Button");
//        add(bt);
//        bt.addActionListener(this);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(bordernorm);
        g.fillArc(50, 80, 220, 220, 90, perTemp);
        g.fillArc(400, 80, 220, 220, 90, 358);
        g.fillOval(750, 80, 220, 220);
        g.setColor(bordercaution);
        g.fillArc(225, 300, 220, 220, 90, 5);
        g.setColor(borderwatchout);
        g.fillArc(575, 300, 220, 220, 90, 100);
        g.setColor(background);
        g.fillOval(50 + 6, 80 + 6, 220 - 12, 220 - 12);
        g.fillOval(400 + 6, 80 + 6, 220 - 12, 220 - 12);
        g.fillOval(750 + 6, 80 + 6, 220 - 12, 220 - 12);
        g.fillOval(225 + 6, 300 + 6, 220 - 12, 220 - 12);
        g.fillOval(575 + 6, 300 + 6, 220 - 12, 220 - 12);
        g.setColor(letterColor);
        g.setFont(new Font("franklin gothic book", Font.PLAIN, 45));
        g.drawString("Temp",110 , 180);
        g.drawString(Double.toString(temp) + "ºC",100 , 235);
        g.drawString("Battery",445 , 180);
        g.drawString("99%",470 , 235);
        g.drawString("Life",825 , 180);
        g.drawString("100%",805 , 235);
        g.setColor(letterCaution);
        g.drawString("Voltage",270, 400);
        g.drawString("2.72V",285 , 455);
        g.setColor(letterWatchout);
        g.drawString("Current",620 , 400);
        g.drawString("0.31A",635 , 455);
        g.drawImage(cautionYellow, 670, 460, this);
        g.drawImage(cautionRed, 315, 460, this);
    }

    public void sleep(int sec) {
        try {
            TimeUnit.SECONDS.sleep(sec);
        } catch(Exception e) {
            System.out.println(e);
        }
        perTemp = 300;
        temp = 33.7;
        SwingUtilities.updateComponentTreeUI(this);
    }
}
