package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label labelSensor;

    @FXML
    private TextField sensorValue;

    @FXML
    private Label sensorStatus;

    @FXML
    private Label sensorStatus1;

    public void statusReport() {
        sensorStatus.setText("Status OK");
    }

   @Override
    public void initialize(URL url, ResourceBundle rb) {
        //sensorStatus.setVisible(true);
        //sensorStatus1.setVisible(false);
       final int[] num = {0};
       Thread thread = new Thread(() -> {
           sensorStatus.setText("Waiting for data...");
           for (int i=0; i<5; i++){
               //sensorStatus.setText("Waiting for data...");
               sensorValue.setText(String.valueOf(i));
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               num[0] =1;
               sensorStatus.setText("Waiting for data ..."+i);
           }
           //sensorStatus.setText("Status OK");
           //sensorStatus.setVisible(false);
           //sensorStatus1.setVisible(true);
           //Thread.getState();
           sensorStatus.setText("Status OK");
           //statusReport();
       });
       thread.start();
       //sensorStatus.setText("Status OK");
       //statusReport();
       /*Platform.runLater(() -> {
           //Update UI here
           try {
               Thread.sleep(2000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           sensorStatus.setText("Status OK");
       });*/
   }
}
