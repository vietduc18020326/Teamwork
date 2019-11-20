package sample;

import javafx.scene.image.Image;

public final class Config {
    //unit
    public static final double UNIT_IMAGE=80;


    //region Image
    public static final Image BOSS_ENEMY_IMAGE=new Image("file:src/image/Boss_enemy.png");
    public static final Image NORMAL_ENEMY_IMAGE=new Image("file:src/image/Normal_enemy.png");
    public static final Image SMALLER_ENEMY_IMAGE=new Image("file:src/image/Smaller_enemy.png");
    public static final Image TANKER_ENEMY_IMAGE=new Image("file:src/image/Tanker_enemy.png");
    public static final Image NORMAL_TOWER_IMAGE=new Image("file:src/image/Normal_tower.png");
    public static final Image MACHINE_GUN_TOWER_IMAGE=new Image("file:src/image/Normal_enemy.png");
    public static final Image SNIPER_TOWER_IMAGE=new Image("file:src/image/Boss_enemy.png");
    public static final Image BACKGROUND_IMAGE=new Image("file:src/image/Background.png");

    //region Bullet
    public static final long NORMAL_BULLET_TTL = 30;
    public static final long NORMAL_BULLET_STRENGTH = 30;
    public static final double NORMAL_BULLET_SPEED = 0.3;

    public static final long MACHINE_GUN_BULLET_TTL = 15;
    public static final long MACHINE_GUN_BULLET_STRENGTH = 20;
    public static final double MACHINE_GUN_BULLET_SPEED = 0.4;

    public static final long SNIPER_BULLET_TTL = 60;
    public static final long SNIPER_BULLET_STRENGTH = 120;
    public static final double SNIPER_BULLET_SPEED = 0.5;
    //endregion

    //region Tower

    public static final double NORMAL_TOWER_SIZE = 80;
    public static final long NORMAL_TOWER_SPEED = 30;
    public static final double NORMAL_TOWER_RANGE = 5.0;
    public static final long NORMAL_TOWER_PRICE = 1 ;

    public static final double MACHINE_GUN_TOWER_SIZE = 80;
    public static final long MACHINE_GUN_TOWER_SPEED = 5;
    public static final double MACHINE_GUN_TOWER_RANGE = 4.0;
    public static final long MACHINE_GUN_TOWER_PRICE = 1 ;

    public static final double SNIPER_TOWER_SIZE = 80;
    public static final long SNIPER_TOWER_SPEED = 60;
    public static final double SNIPER_TOWER_RANGE = 8.0;
    public static final long SNIPER_TOWER_PRICE = 1 ;
    //endregion

    //region Enemy
    public static final double NORMAL_ENEMY_SIZE = 80;
    public static final long NORMAL_ENEMY_HEALTH = 100;
    public static final long NORMAL_ENEMY_ARMOR = 3;
    public static final double NORMAL_ENEMY_SPEED = 1;
    public static final long NORMAL_ENEMY_REWARD = 1;

    public static final double SMALLER_ENEMY_SIZE = 80;
    public static final long SMALLER_ENEMY_HEALTH = 50;
    public static final long SMALLER_ENEMY_ARMOR = 0;
    public static final double SMALLER_ENEMY_SPEED = 0.4;
    public static final long SMALLER_ENEMY_REWARD = 2;

    public static final double TANKER_ENEMY_SIZE = 80;
    public static final long TANKER_ENEMY_HEALTH = 300;
    public static final long TANKER_ENEMY_ARMOR = 5;
    public static final double TANKER_ENEMY_SPEED = 0.2;
    public static final long TANKER_ENEMY_REWARD = 3;

    public static final double BOSS_ENEMY_SIZE = 80;
    public static final long BOSS_ENEMY_HEALTH = 500;
    public static final long BOSS_ENEMY_ARMOR = 8;
    public static final double BOSS_ENEMY_SPEED = 0.3;
    public static final long BOSS_ENEMY_REWARD = 10;
    //endregion

    private Config() {
    }


}
