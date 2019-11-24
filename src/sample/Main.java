package sample;

import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;
import sample.Play_Object.Tower.Abstract_Tower;
import sample.Play_Object.Tower.Machine_Gun_Tower;
import sample.Play_Object.Tower.Normal_Tower;
import sample.Play_Object.Tower.Sniper_Tower;
import sample.Game_Stage.*;


import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Main extends Application {
    Pane layout = new Pane();
    Scene scene,scene1;
    private int PosX , PosY;
    private Abstract_Tower select_tower;
    private boolean test_click = true;
    private Button button1 , button2 , button3;

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException, InterruptedException {
        Game_Stage game_stage = new Game_Stage();

        Game_Field game_field= new Game_Field();
        game_field.Add_Tower();
        game_field.Add_Enemy();

        create_Button(game_field);

        layout.getChildren().add(new ImageView(Config.BACKGROUND_IMAGE));

        layout.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                PosX = (int)e.getX();
                PosY = (int)e.getY();
            }
        });
        layout.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                if(test_click) {
                    select_tower.setPosX(PosX);
                    select_tower.setPosY(PosY);
                    if (game_field.Position_Tower(select_tower)) {
                        game_field.Add_TowerField(select_tower);
                    }
                    test_click = false;
                }
            }
        });
        //Canvas,layout
        Canvas canvas = new Canvas(1280, 720);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        layout.getChildren().add(canvas);
        layout.getChildren().addAll(button1,button2,button3);
        Scene scene = new Scene(layout,1280,720);

        game_stage.gameStage(scene,primaryStage);
        primaryStage.show();

        // delay time and run game
        Timeline draw = new Timeline();
        draw.setCycleCount(Timeline.INDEFINITE);

        KeyFrame keyFrame = new KeyFrame(Duration.seconds(0.01),(ActionEvent e)->
        {

            gc.clearRect(0,0,1280,720);
            gc.save();
            game_field.Add_Enemy();
            for(int i= 0 ; i<game_field.getEnemy_list().size() ; i++) {
                gc.drawImage(game_field.getEnemy_list().get(i).getImage(),
                        game_field.getEnemy_list().get(i).getPosX(),
                        game_field.getEnemy_list().get(i).getPosY(),
                        Config.UNIT_IMAGE,
                        Config.UNIT_IMAGE);
                game_field.Guide_Enemy(game_field.Enemy_list.get(i));
                game_field.Destroy_Enemy(i);
            }
            //for(Abstract_Tower t : towers)  gc.drawImage(t.getImage(),t.getPosX(),t.getPosY(),80,80);
            for(int i=3 ;i<game_field.getTower_List().size();i++){
                gc.drawImage(game_field.getTower_List().get(i).getImage(),game_field.getTower_List().get(i).getPosX(),game_field.getTower_List().get(i).getPosY(),80,80);
            }
            gc.restore();

        });
        draw.getKeyFrames().add(keyFrame);
        draw.play();

    }
    public void create_Button(Game_Field game_field){
        ImageView imageView1 = new ImageView(game_field.getTower_List().get(0).getImage());
        imageView1.setFitWidth(70);
        imageView1.setFitHeight(70);
        button1 = new Button("",imageView1);
        button1.setLayoutX(80);
        button1.setLayoutY(640);
        button1.setOnAction((ActionEvent e)->{
            select_tower = new Normal_Tower(0,0);
            test_click = true;
        });

        ImageView imageView2 = new ImageView(game_field.getTower_List().get(1).getImage());
        imageView2.setFitHeight(70);
        imageView2.setFitWidth(70);
        button2 = new Button("",imageView2);
        button2.setLayoutY(640);
        button2.setLayoutX(80*2);
        button2.setOnAction((ActionEvent e)->{
            select_tower = new Sniper_Tower(0,0);
            test_click = true;
        });

        ImageView imageView3 = new ImageView(game_field.getTower_List().get(2).getImage());
        imageView3.setFitWidth(70);
        imageView3.setFitHeight(70);
        button3 = new Button("",imageView3);
        button3.setLayoutY(640);
        button3.setLayoutX(80*3);
        button3.setOnAction((ActionEvent e)->{
            select_tower = new Machine_Gun_Tower(0,0);
            test_click = true;
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
