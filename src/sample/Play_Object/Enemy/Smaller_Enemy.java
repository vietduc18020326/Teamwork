package sample.Play_Object.Enemy;

import javafx.scene.image.Image;
import sample.Config;

public final class Smaller_Enemy extends Abstract_Enemy{
    public Smaller_Enemy(double posX, double posY)
    {
        super(posX, posY);
        setSize(Config.SMALLER_ENEMY_SIZE);
        setImage(Config.SMALLER_ENEMY_IMAGE);
        setHealth(Config.SMALLER_ENEMY_HEALTH);
        setArmor(Config.SMALLER_ENEMY_ARMOR);
        setSpeed(Config.SMALLER_ENEMY_SPEED);
        setReward(Config.SMALLER_ENEMY_REWARD);
    }
}
