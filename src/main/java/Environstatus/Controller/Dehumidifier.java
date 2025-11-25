package Environstatus.Controller;

import java.awt.Color;
import java.awt.Graphics;

public class Dehumidifier extends Controller {

    //
    private String  ;
    private double fieldStrengthTesla;

    public Dehumidifier(String name, String info) {
        super(name);
        this.info = info;
    }

    @Override
    public void update() {
        // todo
    }

    @Override
    public void draw(Graphics g) {

        g.setColor(Color.BLUE);
        int x = 200;
        int y = 150;
        int size = 10;
        g.drawRect(x - size, y - size, 2 * size, 2 * size);
        g.drawString(getDisplayText(), x + 5, y - 5);
    }

    @Override
    public String getDisplayText() {
        return name + " (" + info + ")";
    }

    public String getInfo() {
        return info;
    }
}