package sample.Play_Object.Enemy;

import javafx.scene.image.Image;
import sample.Play_Object.Abstract_Play_Object;

public abstract class Abstract_Enemy extends Abstract_Play_Object implements Enemy{
    private Image image;
    private long health;
    private long armor;
    private double speed;
    private long reward;

    protected Abstract_Enemy(double posX, double posY) {
        super(posX, posY);
    }

    @Override
    public long getHealth() { return health; }
    public void setHealth(long health) { this.health = health; }

    @Override
    public long getArmor() { return armor; }
    public void setArmor(long armor) { this.armor = armor; }

    @Override
    public double getSpeed() { return speed; }
    public void setSpeed(double speed) { this.speed = speed; }

    @Override
    public long getReward() { return reward; }
    public void setReward(long reward) { this.reward = reward; }


    //public boolean isDestroyed() {}


}
