package Environstatus.Controller;
import java.awt;
public class AirPurfier extends Controller {

    private String info;

    public AirPurfier(String name, String info) {
        super(name);
        this.info = info;
    }

    @Override
    public void update() {
        // TODO
    }


    @Override
    public String getDisplayText() {
        return name + " (" + info + ")";
    }

    public String getInfo() {
        return info;
    }
}