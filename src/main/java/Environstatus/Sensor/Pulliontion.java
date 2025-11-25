package Environstatus.Sensor;

public class Pulliontion extends Sensor {

    private String polluLevel;
    private double fieldStrengthTesla;
    public Pullition(String level, String info) {
        super(level);
        this.info = info;
    }

    @Override
    public void update() {
      //todo
    }


    @Override
    public String getDisplayText() {
        return level + " (" + info + ")";
    }

    public float getPollution();
        return info;//pollutionlevel
    }
}