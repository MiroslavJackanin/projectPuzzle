package sample;

public class Game {
    private Board board;
    private GameStatus gameStatus;

    public Game() {
        board = new Board();
        gameStatus = GameStatus.READY;
    }


}