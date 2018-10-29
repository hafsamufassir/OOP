package Task3Package;

public class Square extends Rectangle {
    private double side;

    public Square(){
        super();
    }

    public Square(double side){
        this.side = side;
    }

    public Square(double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide(){
        return side;
    }

    public void setSide(double side){
        this.side = side;
    }

    public void setWidth(double side){
        super.setWidth(side);;
    }

    public void setLength(double side){
        this.length = side;
    }

    public String toString(){
        return "The side of square is " + getWidth() + ", color is" + getColor();
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Square){
            Square c = (Square) obj;
            return(obj.equals(c) && side == c.side);
        }
        return false;
    }
}
