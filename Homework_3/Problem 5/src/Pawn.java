public class Pawn extends Piece {
    public Pawn(Position pos){
        super(pos);
    }
    @Override
    public boolean isLegalMove(Position a, Position b){

        if(a.getY() == 8) {
            return false;
        }
        int ax = a.getX();
        int ay = a.getY();
        int bx = b.getX();
        int by = b.getY();

        return (Math.abs(ax - bx) <= 1 && by - ay == 1 || ax == bx && bx - ay == 2);
    }
}