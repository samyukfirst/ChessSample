import java.util.List;

public class Pawn extends Piece{
    int move=1;
    public Pawn(Spot spot,boolean isWhite, boolean isAlive){
        super(spot,isWhite,isAlive);
    }
    @Override
    List<Spot> getAllPossibleMoves() {
        return null;
    }
}
