package sample;

public class Game {
    private Board board;
    private GameStatus gameStatus;
    private int value1 = 0;
    private int value2 = 0;

    public Game() {
        board = new Board();
        gameStatus = GameStatus.READY;
    }

    public Board getBoard() {
        return board;
    }
    public int getValue1() {
        return value1;
    }
    public void setValue1(int value1) {
        int h = value1%4;
        int v = value1/4;
        this.value1 = getBoard().getTile(h, v);
    }
    public int getValue2() {
        return value2;
    }
    public void setValue2(int value2) {
        int h = value2%4;
        int v = value2/4;
        this.value2 = getBoard().getTile(h, v);
    }

    public boolean evaluate(){
        if (value1 == value2){
            board.showTiles(value1);
            value1 = 0;
            value2 = 0;
            return true;
        }else{
            value1 = 0;
            value2 = 0;
        }
        return false;
    }
}