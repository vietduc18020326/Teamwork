package sample;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Game_Stage {

    public void gameStage(Scene scene, Stage stage){
        ImageView background = new ImageView(new Image("file:src/imageStage/Gamemenu.png"));
        background.setFitWidth(1280);
        background.setFitHeight(720);
        ImageView imageView = new ImageView(new Image("file:src/imageStage/1.png"));
        Button button = new Button("",imageView);
        button.setLayoutX(500);
        button.setLayoutY(280);
        button.setOnAction((ActionEvent e)->{
            stage.setScene(scene);
        });
        Pane layout = new Pane();
        layout.getChildren().addAll(background,button);
        Scene scene1 = new Scene(layout,1280,720);
        stage.setScene(scene1);
    }

}
