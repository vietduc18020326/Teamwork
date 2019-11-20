package sample.Play_Object.Enemy;

import javafx.scene.image.Image;
import sample.Config;

public final class Boss_Enemy extends Abstract_Enemy
{
       public Boss_Enemy(double posX, double posY)
        {
            super(posX, posY);
            setSize(Config.BOSS_ENEMY_SIZE);
            setImage(Config.BOSS_ENEMY_IMAGE);
            setHealth(Config.BOSS_ENEMY_HEALTH);
            setArmor(Config.BOSS_ENEMY_ARMOR);
            setSpeed(Config.BOSS_ENEMY_SPEED);
            setReward(Config.BOSS_ENEMY_REWARD);
        }
    }

