package Environstatus.Controller;

public class Heater extends Controller {
    private String info;

    public Heater(String name, String info) {
        super(name);
        this.info = info;
    }

    @Override
    public void update() {
        ward.currentTemp = ward.tempSensor.read();

        if (ward.currentTemp < ward.targetTemp - 0.5) ward.heater.turnOn();
        else if (ward.currentTemp > ward.targetTemp + 0.5) ward.heater.turnOff();
    }


    @Override
    public String getDisplayText() {
        return name + " (" + info + ")";
    }

    public String getName() {
        return info;
    }
}