public class Queen extends Piece {

    public Queen(Position pos){
        super(pos);
    }

    @Override
    public boolean isLegalMove(Position a, Position b){

        int ax = a.getX();
        int ay = a.getY();
        int bx = b.getX();
        int by = b.getY();

        return (ax + ay == bx + by || ax - ay == bx - by || ax == bx || ay == by);
    }
}