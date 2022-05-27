import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Model implements ActionListener {

    private int counter;

    private List<MyModelListener> listOfListener;

    public Model() {
        counter = 0;
        listOfListener = new ArrayList<>();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if ("RST".equals(ae.getActionCommand())) {
            counter = 0;
        } else {
            if ("+".equals(ae.getActionCommand())) {
                counter++;
            } else {
                counter--;
            }
        }
        informListener();
    }

    public void addListener(MyModelListener listener) {
        listOfListener.add(listener);
    }

    private void informListener() {
        for (MyModelListener mml : listOfListener) {
            mml.update();
        }
    }

    public int getCounter() {
        return this.counter;
    }

}
