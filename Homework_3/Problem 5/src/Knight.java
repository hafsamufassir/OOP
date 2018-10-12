public class Knight extends Piece{

    public Knight(Position pos){
        super(pos);
    }

    @Override
    public boolean isLegalMove(Position a, Position b){

        int ax = a.getX();
        int ay = a.getY();
        int bx = b.getX();
        int by = b.getY();

        return (Math.abs(ax - bx) * Math.abs(ay - by) == 2);
    }
}
