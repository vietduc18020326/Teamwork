package sample;

import sample.Play_Object.Enemy.Abstract_Enemy;

public class Game_Control {
    public static void Guide_Enemy(Abstract_Enemy enemy , char sign)
    {
        if (sign == 'N') enemy.setPosY(enemy.getPosY()-enemy.getSpeed());
        if (sign == 'S') enemy.setPosY(enemy.getPosY()+enemy.getSpeed());
        if (sign == 'E') enemy.setPosX(enemy.getPosX()+enemy.getSpeed());
        if (sign == 'W') enemy.setPosY(enemy.getPosY()+enemy.getSpeed());
    }
}
