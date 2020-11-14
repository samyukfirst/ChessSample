import java.util.List;

public class King extends Piece{
    int move=1;

    public King(Spot spot,boolean isWhite, boolean isAlive){
        super(spot,isWhite,isAlive);
    }
    @Override
    List<Spot> getAllPossibleMoves() {
        return null;
    }
}
