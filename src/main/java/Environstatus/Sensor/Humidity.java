package Environstatus.Sensor;

public class Humidity extends Sensor {

    private String type ;

    public Humidity(String percen, String info) {
        super(percen);
        this.info = info;
    }

    @Override
    public void update() {
        // TOdo
    }



    @Override
    public int getInsideHumidity(); {
        return percen + " (" + info + ")";
    }

    public int getOutsideHumidity(); {
        return info;
    }
}