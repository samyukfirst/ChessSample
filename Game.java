public class Game {
    Player whitePlayer;
    Player blackPlayer;
    Board board;

    public Game(Player whitePlayer, Player blackPlayer, Board board) {
        this.whitePlayer = whitePlayer;
        this.blackPlayer = blackPlayer;
        this.board = board;
    }

    public String getWinner(){
        return "";
    }

}
