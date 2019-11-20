package sample;

import javafx.application.Application;
import sample.Play_Object.Enemy.*;
import sample.Play_Object.Tower.Abstract_Tower;
import sample.Play_Object.Tower.Machine_Gun_Tower;
import sample.Play_Object.Tower.Normal_Tower;
import sample.Play_Object.Tower.Sniper_Tower;

import java.util.ArrayList;

public class Game_Field  {
    protected ArrayList<Abstract_Enemy> Enemy_list = new ArrayList<>();
    protected ArrayList<Abstract_Tower> Tower_List = new ArrayList<>();
    protected Map Map_1=new Map();

    public Game_Field(){}

    public void Add_Enemy()
    {
        Enemy_list.add(new Normal_Enemy(Map_1.getStart_X(),Map_1.getStart_Y()));
        Enemy_list.add(new Smaller_Enemy(Map_1.getStart_X(),Map_1.getStart_Y()+80));
        Enemy_list.add(new Tanker_Enemy(Map_1.getStart_X(),Map_1.getStart_Y()+160));
        Enemy_list.add(new Boss_Enemy(Map_1.getStart_X(),Map_1.getStart_Y()+320));
    }

    public void Add_Tower() {
        Tower_List.add(new Normal_Tower(Map_1.getStart_X() + 80, 720 - 80));
        Tower_List.add(new Sniper_Tower(Map_1.getStart_X() + 80, 720 - 80));
        Tower_List.add(new Machine_Gun_Tower(Map_1.getStart_X(),Map_1.getStart_Y()));
    }
    public boolean Position_Tower(Abstract_Tower tower){
        double a = (double)tower.getPosX()/Config.UNIT_IMAGE;
        double b = (double)tower.getPosY()/Config.UNIT_IMAGE;

        int a_X = (int)Math.ceil(a)-1;
        int b_X = (int)Math.ceil(b)-1;

        char sign = Map_1.getMap(a_X,b_X);
        if(sign == 'T') {
            tower.setPosX(a_X*80);
            tower.setPosY(b_X*80);
            return true;
        }
            return false;
    }
    public ArrayList<Abstract_Tower> getTower_List() {
        return Tower_List;
    }

    public ArrayList<Abstract_Enemy> getEnemy_list() { return Enemy_list; }
}
