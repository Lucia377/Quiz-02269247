package Environstatus.Controller;

public abstract class Controller {


    protected String name;

    public Controller(String name) {
        this.name = name;
    }

    public void update() {

    }

    public String getDisplayText() {
        return name;
    }

    public String getName() {
        return name;
    }
