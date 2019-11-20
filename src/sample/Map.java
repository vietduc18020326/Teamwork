package sample;

public class Map {
    private final double Start_X=0;
    private final double Start_Y=320;
    private final char map_enemy[][] = { {'O','O' ,'O' ,'O' ,'O', 'O', 'O', 'O' ,'O', 'O', 'O' ,'O' ,'O' ,'O' ,'O' ,'O'},
                                        {'O' ,'O', 'O', 'E', 'E', 'E', 'E', 'E', 'E' ,'E', 'S', 'O', 'O', 'O', 'O', 'O'},
                                        {'O', 'O', 'O', 'N' ,'O' ,'O', 'O', 'O', 'O', 'O', 'S', 'O', 'O', 'O', 'O', 'O'},
                                        {'O', 'O', 'O', 'N', 'W', 'W', 'O' ,'O' ,'O' ,'O' ,'S', 'O', 'O' ,'E' ,'E' ,'E'},
                                        {'E' ,'E', 'S', 'O', 'O', 'N', 'O', 'S', 'W' ,'W' ,'W', 'O', 'O' ,'N', 'O' ,'O'},
                                        {'O' ,'O' ,'S', 'O', 'O', 'N', 'O', 'S' ,'O', 'O', 'O', 'O' ,'O', 'N', 'O' ,'O'},
                                        {'O', 'O' ,'E' ,'E' ,'E' ,'N' ,'O' ,'E' ,'E' ,'E' ,'E' ,'E' ,'E' ,'N' ,'O', 'O'},
                                        {'O' ,'O' ,'O' ,'O' ,'O' ,'O' ,'O' ,'O' ,'O' ,'O' ,'O' ,'O' ,'O' ,'O' ,'O' ,'O'},
                                        {'O' ,'O' ,'O' ,'O' ,'O' ,'O' ,'O' ,'O' ,'O', 'O' ,'O' ,'O' ,'O' ,'O' ,'O' ,'O'} };
    private final char map_tower[][] = { {'O','O' ,'O' ,'O' ,'O', 'O', 'O', 'O' ,'O', 'O', 'O' ,'O' ,'O' ,'O' ,'O' ,'O'},
                                         {'O' ,'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O' ,'O', 'O', 'O', 'O', 'O', 'O', 'O'},
                                         {'O', 'O', 'O', 'T' ,'E' ,'E', 'E', 'E', 'E', 'E', 'S', 'T', 'O', 'O', 'O', 'O'},
                                         {'O', 'O', 'O', 'O', 'N', 'T', 'O' ,'T' ,'O' ,'T' ,'S', 'O', 'O' ,'T' ,'O' ,'O'},
                                         {'E' ,'E', 'S', 'T', 'N', 'W', 'T', 'O', 'S' ,'W' ,'W', 'O', 'T' ,'E', 'E' ,'E'},
                                         {'O' ,'O' ,'S', 'T', 'T', 'N', 'O', 'O' ,'S', 'T', 'O', 'T' ,'O', 'N', 'O' ,'O'},
                                         {'O', 'T' ,'E' ,'E' ,'E' ,'N' ,'O' ,'T' ,'E' ,'E' ,'E' ,'E' ,'E' ,'N' ,'T', 'O'},
                                         {'O' ,'O' ,'O' ,'T' ,'O' ,'T' ,'O' ,'O' ,'O' ,'O' ,'T' ,'T' ,'O' ,'O' ,'O' ,'O'},
                                         {'O' ,'O' ,'O' ,'O' ,'O' ,'O' ,'O' ,'O' ,'O', 'O' ,'O' ,'O' ,'O' ,'O' ,'O' ,'O'} };

    public Map(){ };

    public char getMap_enemy(int i,int j) { return map_enemy[j][i]; }

    public char getMap_tower(int i, int j) { return map_tower[j][i]; }

    public double getStart_X() { return Start_X; }
    public double getStart_Y() { return Start_Y; }
}
