import java.awt.TextField;

public class View extends TextField implements MyModelListener{

    private final Model model;
    
    public View(Model model){
        super(10);
        this.model = model;
        this.model.addListener(this);
        this.update();
    }
    
    public void update() {
        this.setText(String.valueOf(model.getCounter()));
    }
    
}
