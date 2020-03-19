package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class startUpController implements Initializable {

    @FXML
    private AnchorPane anchorPaneParent01;

    @FXML
    private TextArea processDisp01;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //anchorPaneParent01.setDisable(false);
        //processDisp01.setDisable(false);
        for (int i=0; i<2; i++){
               //sensorStatus.setText("Waiting for data...");
               //sensorValue.setText(String.valueOf(i));
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               //sensorStatus.setText("Waiting for data ..."+i);
        }
        //setPrevStage(prevStage);
        /*try {
            switch2Scene1();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }


    Stage prevStage;

    public void setPrevStage(Stage stage){
         this.prevStage = stage;
    }
        public void gotoCreateCategory(ActionEvent event) throws IOException {
       Stage stage = new Stage();
       stage.setTitle("Shop Management");
       Pane myPane = null;
       myPane = FXMLLoader.load(getClass().getResource("sample.fxml"));
       Scene scene = new Scene(myPane);
       stage.setScene(scene);

       prevStage.close();

       stage.show();
        }
    public void switch2Scene1() throws IOException {
        Parent scene1Parent = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Stage stage = new Stage();
        Scene scene1 = new Scene(scene1Parent);
        System.out.println("Switching scenes");
        //Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene1);
        //Stage window = new Stage();
        //window.setScene(scene1);
        //Stage window = (Stage) scene1.getWindow();
        //window.show();
        stage.show();
    }

}
