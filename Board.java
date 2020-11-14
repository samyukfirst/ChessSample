import java.util.List;

public class Board {
    List<Spot> listOfSpots;
    List<Piece> listOfPieces;
    public Board(List<Spot> listOfSpots, List<Piece> listOfPieces){
        this.listOfSpots=listOfSpots;
        this.listOfPieces=listOfPieces;
    }
}
