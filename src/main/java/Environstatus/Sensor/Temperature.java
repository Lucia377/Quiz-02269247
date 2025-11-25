package Environstatus.Sensor;

import java.awt;
public class Temperature extends Sensor {


    private String ward;

    public Temperature(String ward, double idealTem) {
        super(ward);
        this.ward = ward;
    }

    @Override
    public void update() {
//TODO
    }


    @Override
    public String getName() {
        return name;
    }

    public String checkSensors() {
        return name + " (" + info + ")";
    }
    public float getTemperature(int wardID){

    };

}