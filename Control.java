import javax.swing.JButton;
import javax.swing.JPanel;

public class Control extends JPanel {

    JButton button1;
    JButton button2;
    JButton button3;

    public Control(Model model) {
        button1 = new JButton("PLUS");
        button1.setActionCommand("+");
        button1.addActionListener(model);

        button2 = new JButton("MINUS");
        button2.setActionCommand("-");
        button2.addActionListener(model);

        button3 = new JButton("RESET");
        button3.setActionCommand("RST");
        button3.addActionListener(model);

        this.add(button1);
        this.add(button2);
        this.add(button3);

    }

}
