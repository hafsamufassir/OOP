public abstract class Piece {

    private Position pos;

    public Piece(Position _pos){
        this.pos = _pos;
    }

    public abstract boolean isLegalMove(Position a, Position b);
}
