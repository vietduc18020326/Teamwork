package sample.Play_Object.Enemy;

import javafx.scene.image.Image;

public interface Enemy {

    long getHealth();
    long getArmor();
    double getSpeed();
    long getReward();
    boolean isDestroyed();
}
