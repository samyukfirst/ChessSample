import java.util.ArrayList;
import java.util.List;

public class ChessMain {
    public static void main(String[] args){
        /*
        1.While creating the spot, reserve it for every piece
        2.Create the piece, place the piece on the spot
        3.Push force test
         */

        List<Spot> listOfSpots=createListOfSpots();
        List<Piece> listOfWhitePieces=createListOfPieces(true,0,1,0,7,listOfSpots);
        List<Piece> listOfBlackPieces=createListOfPieces(false,6,7,0,7,listOfSpots);
        for(Spot spot:listOfSpots){
            System.out.println(spot.getPiece());
            System.out.println(spot.getX()+","+spot.getY());
        }
    }

    public static List<Spot> createListOfSpots(){
        List<Spot> listOfSpots=new ArrayList<Spot>();
        for(int x=0;x<8;x++){
            for(int y=0;y<8;y++){
                Spot spot=new Spot(x,y);
                listOfSpots.add(spot);
            }
        }
        return listOfSpots;
    }

    public static List<Piece> createListOfPieces(boolean isWhite,int xStart,int xEnd,int yStart,int yEnd,List<Spot> listOfSpots){
        List<Piece> listOfPieces=new ArrayList<Piece>();
        //rook,knight,bishop,queen,king,bishop,knight,rook
        for(int x=0;x<8;x++){
            for(int y=0;y<8;y++){
                Spot spot=listOfSpots.get(x*8+y);
                //For Rook
                if(spot.getX()==0 && spot.getY()==0 || spot.getX()==7 && spot.getY()==0 || spot.getX()==0 && spot.getY()==7 || spot.getX()==7 && spot.getY()==7){
                    Piece piece=new Rook(spot,isWhite,true);
                    spot.setPiece(piece);
                    listOfPieces.add(piece);
                }
                //For knight
                if(spot.getX()==0 && spot.getY()==1 || spot.getX()==7 && spot.getY()==1 || spot.getX()==0 && spot.getY()==6 || spot.getX()==7 && spot.getY()==6){
                    Piece piece=new Knight(spot,isWhite,true);
                    spot.setPiece(piece);
                    listOfPieces.add(piece);
                }
                //For Bishop
                if(spot.getX()==0 && spot.getY()==2 || spot.getX()==7 && spot.getY()==2 || spot.getX()==0 && spot.getY()==5 || spot.getX()==7 && spot.getY()==5){
                    Piece piece=new Bishop(spot,isWhite,true);
                    spot.setPiece(piece);
                    listOfPieces.add(piece);
                }
                //For King
                if(spot.getX()==0 && spot.getY()==3 || spot.getX()==7 && spot.getY()==3){
                    Piece piece=new King(spot,isWhite,true);
                    spot.setPiece(piece);
                    listOfPieces.add(piece);
                }
                //For Queen
                if(spot.getX()==0 && spot.getY()==4 || spot.getX()==7 && spot.getY()==4){
                    Piece piece=new Queen(spot,isWhite,true);
                    spot.setPiece(piece);
                    listOfPieces.add(piece);
                }
                //For Pawn
                if(spot.getX()==1 || spot.getX()==6){
                    Piece piece=new Pawn(spot,isWhite,true);
                    spot.setPiece(piece);
                    listOfPieces.add(piece);
                }
            }
        }
        return listOfPieces;
    }
}
