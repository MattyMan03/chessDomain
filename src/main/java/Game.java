import java.util.ArrayList;

public class Game {
    private Board gameBoard;
    private ArrayList<String> moveList;
    public Game() {
        gameBoard = new Board();
        moveList = new ArrayList<>();
    }
    public Game(String fenStr) {

    }

    public int doMove(String move) {
        // if move legal
         // do move
         // return 1;
        // else
         return 0;
    }
}
