public class Rook extends Piece {

    public Rook(Position pos){
        super(pos);
    }

    @Override
    public boolean isLegalMove(Position a, Position b){

        int ax = a.getX();
        int ay = a.getY();
        int bx = b.getX();
        int by = b.getY();

        return (ax == bx || ay == by);
    }
}