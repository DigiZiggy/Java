package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Raam extends Application {

    public static GraphicsContext gc;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Toa rekonstruktsioon.");
        Scene scene=new Scene(root, 780, 650);
        primaryStage.setScene(scene);
        primaryStage.show();
        scene.setOnKeyPressed(
                new EventHandler<KeyEvent>()
                {
                    public void handle(KeyEvent e) {
                        String code = e.getCode().toString();
                        System.out.println(code);
                        if (code.equals("ENTER")) {
                            Controller.drawText();
                            //   Controller.drawShapes(gc);
                        }
                    }
                });
    }


    public static void main(String[] args) {
        launch(args);
    }
}
