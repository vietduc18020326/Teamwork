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


import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Main extends Application {
    Pane layout = new Pane();
    Scene scene,scene1;
    private int a = 0;
    private int PosX , PosY;
    private boolean test_click = false;
    private Button button1 , button2 , button3;

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException, InterruptedException {

        Game_Field game_field= new Game_Field();
        game_field.Add_Tower();
        game_field.Add_Enemy();

        create_Button(game_field);

        List<Abstract_Tower> towers = new ArrayList<Abstract_Tower>();
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
                if(a==1){
                    Abstract_Tower tower = new Normal_Tower(PosX,PosY);
                    if(game_field.Position_Tower(tower)) {
                        towers.add(tower);
                    }
                    a=0;
                }
                if(a==2){
                    Abstract_Tower tower = new Sniper_Tower(PosX,PosY);
                    if(game_field.Position_Tower(tower)) {
                        towers.add(tower);
                    }
                    a=0;
                }
                if(a==3){
                    Abstract_Tower tower = new Machine_Gun_Tower(PosX,PosY);
                    if(game_field.Position_Tower(tower)){
                        towers.add(tower);
                    }
                    a=0;
                }
            }
        });
        //Canvas,layout
        Canvas canvas = new Canvas(1280, 720);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        layout.getChildren().add(canvas);
        layout.getChildren().addAll(button1,button2,button3);
        Scene scene = new Scene(layout,1280,720);
        primaryStage.setScene(scene);
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
            for(Abstract_Tower t : towers)  gc.drawImage(t.getImage(),t.getPosX(),t.getPosY(),80,80);
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
            a=1;
        });

        ImageView imageView2 = new ImageView(game_field.getTower_List().get(1).getImage());
        imageView2.setFitHeight(70);
        imageView2.setFitWidth(70);
        button2 = new Button("",imageView2);
        button2.setLayoutY(640);
        button2.setLayoutX(80*2);
        button2.setOnAction((ActionEvent e)->{
            a=2;
        });

        ImageView imageView3 = new ImageView(game_field.getTower_List().get(2).getImage());
        imageView3.setFitWidth(70);
        imageView3.setFitHeight(70);
        button3 = new Button("",imageView3);
        button3.setLayoutY(640);
        button3.setLayoutX(80*3);
        button3.setOnAction((ActionEvent e)->{
            a=3;
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
