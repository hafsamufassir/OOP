public class King extends Piece {

    public King(Position pos){
        super(pos);
    }

    @Override
    public boolean isLegalMove(Position a, Position b){
        int ax = a.getX();
        int ay = a.getY();
        int bx = b.getX();
        int by = b.getY();

        return (Math.abs(ax - bx) <= 1 && Math.abs(ay - by) <= 1);
    }
}
