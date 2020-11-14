import java.util.List;

public abstract class Piece {
    Spot spot;
    boolean isWhite=true;
    boolean isAlive=true;

    public Piece(Spot spot, boolean isWhite, boolean isAlive) {
        this.spot=spot;
        this.isWhite=isWhite;
        this.isAlive=isAlive;
    }

    abstract List<Spot> getAllPossibleMoves();

    Spot getPiecePosition(){
        return spot;
    }
}
