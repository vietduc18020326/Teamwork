package sample;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sample.Play_Object.Tower.Abstract_Tower;

public class Game_Stage {
    private Scene scene1,scene2;

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

        ImageView quit = new ImageView(new Image("file:src/imageStage/quit.png"));
        Button button_quit = new Button("",quit);
        button_quit.setLayoutX(500);
        button_quit.setLayoutY(480);
        quit.setFitWidth(270);
        button_quit.setOnAction((ActionEvent e)->{
            stage.close();
        });

        ImageView Menu = new ImageView(new Image("file:src/imageStage/3.png"));
        Button button_menu = new Button("",Menu);
        button_menu.setLayoutX(500);
        button_menu.setLayoutY(380);
        Menu.setFitWidth(270);
        Menu.setFitHeight(50);
        button_menu.setOnAction((ActionEvent e)->{
            CreateMenu(stage);
            stage.setScene(scene2);
        });

        Pane layout = new Pane();
        layout.getChildren().addAll(background,button,button_quit,button_menu);
        scene1 = new Scene(layout,1280,720);
        stage.setScene(scene1);
    }

    public void CreateMenu(Stage stage){
        ImageView background_menu = new ImageView(new Image("file:src/imageStage/53.png"));
        background_menu.setFitWidth(1280);
        background_menu.setFitHeight(720);

        Button button = new Button("Back");
        button.setOnAction((ActionEvent e)->{
            stage.setScene(scene1);
        });

        Pane layout = new Pane();
        layout.getChildren().addAll(background_menu,button);
        scene2 = new Scene(layout,1280,720);
    }
}
