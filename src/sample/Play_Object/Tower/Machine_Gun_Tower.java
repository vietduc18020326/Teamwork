package sample.Play_Object.Tower;

import javafx.scene.image.Image;
import sample.Config;

public final class Machine_Gun_Tower extends Abstract_Tower{

    public Machine_Gun_Tower(double posX, double posY)
    {
        super(posX, posY);
        setSize(Config.MACHINE_GUN_TOWER_SIZE);
        setImage(Config.MACHINE_GUN_TOWER_IMAGE);
        setRange(Config.MACHINE_GUN_TOWER_RANGE);
        setSpeed(Config.MACHINE_GUN_TOWER_SPEED);
        setPrice(Config.MACHINE_GUN_TOWER_PRICE);
    }

}
