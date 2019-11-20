package sample.Play_Object.Tower;

import javafx.scene.image.Image;
import sample.Config;

public final class Normal_Tower extends Abstract_Tower{
    public Normal_Tower(double posX, double posY)
    {
        super(posX, posY);
        setSize(Config.NORMAL_TOWER_SIZE);
        setImage(Config.NORMAL_TOWER_IMAGE);
        setRange(Config.NORMAL_TOWER_RANGE);
        setSpeed(Config.NORMAL_TOWER_SPEED);
        setPrice(Config.NORMAL_TOWER_PRICE);
    }


}
