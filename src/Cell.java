/**
 * Created by Admin on 2017-08-25.
 */
public class Cell {
    private int countOfMinesArround;
    private boolean isMine;



    public Cell(int countOfMinesArround) {
        this.countOfMinesArround = countOfMinesArround;
        this.isMine = false;
    }

    public int getCountOfMinesArround() {
        return countOfMinesArround;
    }


    public void setCountOfMinesArround(int countOfMinesArround) {
        this.countOfMinesArround = countOfMinesArround;
    }

    public boolean isMine() {
        return isMine;
    }

    public void setMine(boolean mine) {
        isMine = mine;
    }
}
