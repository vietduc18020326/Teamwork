package sample.Play_Object.Tower;

import javafx.scene.image.Image;
import sample.Play_Object.Abstract_Play_Object;

public abstract class Abstract_Tower extends Abstract_Play_Object implements Tower{
    private double range;
    private long speed;
    private long price;

    protected Abstract_Tower(double posX, double posY)
    {
        super(posX,posY);
    }

    @Override
    public double getRange() { return range; }

    public void setRange(double range) { this.range = range; }

    @Override
    public long getSpeed() { return speed; }

    public void setSpeed(long speed) { this.speed = speed; }

    @Override
    public long getPrice() { return price; }

    public void setPrice(long price) { this.price = price; }

}
