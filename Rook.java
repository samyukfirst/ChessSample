import java.util.List;

public class Rook extends Piece{
    public Rook(Spot spot,boolean isWhite, boolean isAlive){
        super(spot,isWhite,isAlive);
    }
    @Override
    List<Spot> getAllPossibleMoves() {
        return null;
    }
}
