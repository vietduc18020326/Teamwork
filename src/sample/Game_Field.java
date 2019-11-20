package sample;

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
    private long index=0;
    private int [][] count_Tower = new int[20][20] ;
    public Game_Field(){}

    public void Add_Enemy()
    {
        if (getIndex()%100 == 0) {
            Enemy_list.add(new Normal_Enemy(Map_1.getStart_X(), Map_1.getStart_Y()));
            if (Enemy_list.size() % 4 == 0)
                Enemy_list.add(new Smaller_Enemy(Map_1.getStart_X(), Map_1.getStart_Y() ));
            if (Enemy_list.size() % 10 == 0)
                Enemy_list.add(new Tanker_Enemy(Map_1.getStart_X(), Map_1.getStart_Y()));
            if (Enemy_list.size() % 25 == 0)
                Enemy_list.add(new Boss_Enemy(Map_1.getStart_X(), Map_1.getStart_Y()));
            setIndex(1);

        }
        else setIndex(getIndex()+1);
    }

    public void Guide_Enemy(Abstract_Enemy enemy)
    {
        char sign = Map_1.getMap_enemy((int) (enemy.getPosX()/Config.UNIT_IMAGE) , (int) (enemy.getPosY()/Config.UNIT_IMAGE) );
        if (sign == 'N') enemy.setPosY(enemy.getPosY()-enemy.getSpeed());
        if (sign == 'S') enemy.setPosY(enemy.getPosY()+enemy.getSpeed());
        if (sign == 'E') enemy.setPosX(enemy.getPosX()+enemy.getSpeed());
        if (sign == 'W') enemy.setPosX(enemy.getPosX()-enemy.getSpeed());
    }

    public void Destroy_Enemy(int index)
    {
        if (Enemy_list.get(index).isDestroyed()) Enemy_list.remove(index);
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

        char sign = Map_1.getMap_tower(a_X,b_X);
        if(sign == 'T'&&count_Tower[a_X][b_X]==0) {
            tower.setPosX(a_X*80);
            tower.setPosY(b_X*80);
            count_Tower[a_X][b_X]++;
            return true;
        }
        return false;
    }

    public ArrayList<Abstract_Tower> getTower_List() { return Tower_List;}
    public ArrayList<Abstract_Enemy> getEnemy_list() { return Enemy_list; }

    public void setIndex(long index) { this.index = index; }
    public long getIndex() { return index; }
}
