import java.util.List;

public class Bishop extends Piece{
    public Bishop(Spot spot,boolean isWhite, boolean isAlive){
        super(spot,isWhite,isAlive);
    }
    @Override
    List<Spot> getAllPossibleMoves() {
        return null;
    }
}
