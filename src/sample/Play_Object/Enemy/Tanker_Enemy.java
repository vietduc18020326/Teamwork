package sample.Play_Object.Enemy;

import javafx.scene.image.Image;
import sample.Config;

public final class Tanker_Enemy extends Abstract_Enemy{
    public Tanker_Enemy(double posX, double posY)
    {
        super(posX, posY);
        setSize(Config.TANKER_ENEMY_SIZE);
        setImage(Config.TANKER_ENEMY_IMAGE);
        setHealth(Config.TANKER_ENEMY_HEALTH);
        setArmor(Config.TANKER_ENEMY_ARMOR);
        setSpeed(Config.TANKER_ENEMY_SPEED);
        setReward(Config.TANKER_ENEMY_REWARD);
    }
}
