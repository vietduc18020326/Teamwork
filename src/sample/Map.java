package sample;

public class Map {
    private final double Start_X=0;
    private final double Start_Y=0;
    private final double End_X=0;
    private final double End_Y=0;
    private final char map_file[][] = { {'O','O' ,'O' ,'O' ,'O', 'O', 'O', 'O' ,'O', 'O', 'O' ,'O' ,'O' ,'O' ,'O' ,'O'},
                                        {'O' ,'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O' ,'O', 'O', 'O', 'O', 'O', 'O', 'O'},
                                        {'O', 'O', 'O', 'T' ,'E' ,'E', 'E', 'E', 'E', 'E', 'S', 'T', 'O', 'O', 'O', 'O'},
                                        {'O', 'O', 'O', 'O', 'N', 'T', 'O' ,'T' ,'O' ,'T' ,'S', 'O', 'O' ,'T' ,'O' ,'O'},
                                        {'E' ,'E', 'S', 'T', 'N', 'W', 'T', 'O', 'S' ,'W' ,'W', 'O', 'T' ,'E', 'E' ,'E'},
                                        {'O' ,'O' ,'S', 'T', 'T', 'N', 'O', 'O' ,'S', 'T', 'O', 'T' ,'O', 'N', 'O' ,'O'},
                                        {'O', 'T' ,'E' ,'E' ,'E' ,'N' ,'O' ,'T' ,'E' ,'E' ,'E' ,'E' ,'E' ,'N' ,'T', 'O'},
                                        {'O' ,'O' ,'O' ,'T' ,'O' ,'T' ,'O' ,'O' ,'O' ,'O' ,'T' ,'T' ,'O' ,'O' ,'O' ,'O'},
                                        {'O' ,'O' ,'O' ,'O' ,'O' ,'O' ,'O' ,'O' ,'O', 'O' ,'O' ,'O' ,'O' ,'O' ,'O' ,'O'} };

    public Map(){ };
    public char getMap(int i,int j) { return map_file[j][i]; }

    public double getStart_X() { return Start_X; }
    public double getStart_Y() { return Start_Y; }
    public double getEnd_X() { return End_X; }
    public double getEnd_Y() { return End_Y; }
}
