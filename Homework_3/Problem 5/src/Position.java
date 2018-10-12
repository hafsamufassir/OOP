public class Position {

    private int x;
    private int y;

    public Position (int _x, int _y){
        if(_x > 0 && _x < 9 && _y > 0 && _y < 9){
            x = _x;
            y = _y;
        }
        else System.out.println("Invalid input. Either X or Y is out of range.");
    }

    public void setX(int _x){
        this.x = _x;
    }

    public int getX() {
        return x;
    }

    public void setY(int _y){
        this.y = _y;
    }

    public int getY(){
        return y;
    }
}
