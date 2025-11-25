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
        // 写这类对象每次刷新时要做什么（如果不需要可留空）
    }

    @Override
    public void draw(Graphics g) {
        // 例如画一个蓝色方块，写上名字 + info
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