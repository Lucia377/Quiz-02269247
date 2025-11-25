package Environstatus;

public class WarningAlert(settings) {
    this.settings = settings;   //

    setSize(400, 300);
    setBackground(Color.RED);
    setLayout(new GridLayout(1,1));


public class WarningAlert {
    public static void alertATemperature(String ward){
        System.out.println("Vistors walking in "+ward);
    }
    public static void alertATemperature(String ward){
        System.out.println("Vistors walking out of "+ward);
    }
}