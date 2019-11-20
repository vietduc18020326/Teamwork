package sample.Play_Object.Tower;

import sample.Config;

public final class Sniper_Tower extends Abstract_Tower{
    public Sniper_Tower(double posX, double posY)
    {
        super(posX, posY);
        setSize(Config.SNIPER_TOWER_SIZE);
        setImage(Config.SNIPER_TOWER_IMAGE);
        setRange(Config.SNIPER_TOWER_RANGE);
        setSpeed(Config.SNIPER_TOWER_SPEED);
        setPrice(Config.SNIPER_TOWER_PRICE);
    }


}
