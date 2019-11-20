package sample.Play_Object.Enemy;

import javafx.scene.image.Image;
import sample.Config;

public final class Normal_Enemy extends Abstract_Enemy {

    public Normal_Enemy(double posX, double posY)
    {
        super(posX, posY);
        setSize(Config.NORMAL_ENEMY_SIZE);
        setImage(Config.NORMAL_ENEMY_IMAGE);
        setHealth(Config.NORMAL_ENEMY_HEALTH);
        setArmor(Config.NORMAL_ENEMY_ARMOR);
        setSpeed(Config.NORMAL_ENEMY_SPEED);
        setReward(Config.NORMAL_ENEMY_REWARD);
    }
}
