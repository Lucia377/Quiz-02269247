package Environstatus.Sensor;


public abstract class Sensor {


    public Sensor(Double value) {
    }
    public Sensor(String name){

    }

    public void update() {
        // if need subclass could override
    }

    public Double getValue() {
        // subclass override; could get back value
        return getValue();
    }

    public String getName() {
        return name;
    }
