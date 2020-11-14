import java.util.List;

public class Knight extends Piece{
    public Knight(Spot spot,boolean isWhite, boolean isAlive){
        super(spot,isWhite,isAlive);
    }
    @Override
    List<Spot> getAllPossibleMoves() {
        return null;
    }
}
