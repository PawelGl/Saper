import java.util.Random;

/**
 * Created by Admin on 2017-08-25.
 */
public class Map {
    private Cell[][]tabCells;
    private int xValue;
    private int yValue;
    public Map(int x,int y) {
        tabCells = new Cell[x][y];
        for (int i = 0; i <x ; i++) {
            for (int j = 0; j <y ; j++) {
                tabCells[i][j]=new Cell(0);

            }

        }
        xValue=x;
        yValue=y;
    }


   public  void printMap() {
        int count =0;
       System.out.println("  0 1 2 3 4 5 6 7 8 9");

        for (int i = 0; i < tabCells.length; i++) {
            System.out.print(count++ +" ");
            for (int i1 = 0; i1 < tabCells[i].length; i1++) {

                System.out.print(tabCells[i][i1].getCountOfMinesArround() + " ");
            }

            System.out.println();
        }
    }

    void randMineCells(){
        Random random = new Random();
        int x1=random.nextInt(10);
        int x2=random.nextInt(10);

    }

    public Cell[][] getTabCells() {
        return tabCells;
    }

    public void setTabCells(Cell[][] tabCells) {
        this.tabCells = tabCells;
    }

    public int getxValue() {
        return xValue;
    }

    public void setxValue(int xValue) {
        this.xValue = xValue;
    }

    public int getyValue() {
        return yValue;
    }

    public void setyValue(int yValue) {
        this.yValue = yValue;
    }
}
