package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
    private double x,y;
    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("startUp.fxml"));
        primaryStage.setTitle("CDR Planner");
        //primaryStage.setScene(new Scene(root));

        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Pane myPane = (Pane)myLoader.load();
        //startUpController controller = (startUpController) myLoader.getController();
        Controller controller = (Controller) myLoader.getController();
        controller.setPrevStage(primaryStage);
        Scene myScene = new Scene(myPane);
        primaryStage.setScene(myScene);

        primaryStage.initStyle(StageStyle.UNDECORATED);
        //root.setOnMousePressed(event -> {
          myPane.setOnMousePressed(event -> {
            x = event.getSceneX();
            y = event.getSceneY();
        });
        ///root.setOnMouseDragged(event -> {
           myPane.setOnMouseDragged(event -> {
            primaryStage.setX(event.getScreenX() -x);
            primaryStage.setY(event.getScreenY() -y);
        });
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
