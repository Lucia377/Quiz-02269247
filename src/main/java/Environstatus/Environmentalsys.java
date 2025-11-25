package Environstatus;

import Environstatus.Sensor.Humidity;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GraphicsConfiguration;
import java.util.ArrayList;

public class Environmentalsys {
    public TemperatureFeed getTempFeed();
    public HumidityFeed getHumidityFeed();
    public PollutionFeed getPollutionFeed();

    public void turnHeatingOn(int wardID, boolean on); // turn on=true, turn off=false
    public void turnDehumudifierOn(boolean on); // on=true off=false
    public void turnAirPurifierOn(boolean on); // on=true off=false
    public boolean isHeatingOn(int wardID);
    public boolean isDehumudifierOn();
    public boolean isAirPurifierOn()
    public String getUltrasoundScannerStatus();
    public String getCTScannerStatus()


    public static void main(String[] args) {
        GraphicsConfiguration gc = null;

        // 1. 创建 JFrame
        JFrame frame = new JFrame(gc);
        frame.setTitle("Simba's World - Wildlife Reserve");
        JLabel textLabel = new JLabel("My Initial Text");
        textLabel.setText("<html>First line<br>Second line</html>");



        Temperature NorthWard = new Temperature("North Ward", 23, "degrees centigrade");
        //Temperature CentralWard = new Temperature("Central Ward", 22, "degrees centigrade");
        //Temperature SouthWard = new Temperature("Soyth Ward", 20, "degrees centigrade");

        ArrayList<Sensor> objects = new ArrayList<>();
        objects.add(Temperature);
        objects.add(Humidity);
        objects.add(Pulliontion);

        ArrayList<Controller> objects = new ArrayList<>();
        objects.add(AirPurfier);
        objects.add(Dehumidifier);
        objects.add(Heater);



        MapCanvas canvas = new MapCanvas(objects);
        frame.add(canvas);
        panel.add(canvas):

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        panel.setBackground(Color.RED);




        // simulate every 30 seconds
        runSimulation(canvas, ward, percen, monitor1);
    }
    private static void runSimulation(MapCanvas canvas,
                                      Temperature ward,
                                      Humidity percen,
                                      Pulliontion level) {

        while (true) {

            geoff.updateValue();
            simba.updateValue();
            monitor1.updateValue();

            Timer timer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.repaint();
                }
            });
            timer.start();

            checkoutput(Tempureture,Humidity,Pulliontion);


            try {
                Thread.console(3000);
            } catch (InterruptedException e) {

            }
        }
    }

}