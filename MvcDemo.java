import java.awt.GridLayout;
import javax.swing.JFrame;

public class MvcDemo extends JFrame {

    public static void main(String[] args) {
        MvcDemo mvc = new MvcDemo();
        mvc.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mvc.setLayout(new GridLayout(2,1));

        Model model = new Model();

        View view = new View(model);
        Control control = new Control(model);
        
        mvc.add(view);
        mvc.add(control);

        mvc.pack();
        mvc.setVisible(true);
    }
}
