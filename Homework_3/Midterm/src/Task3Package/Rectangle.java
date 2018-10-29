package Task3Package;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(){
        super();
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getArea(){
        return (length * width);
    }

    public double getPerimeter(){
        return (2 * (length + width));
    }

    @Override
    public String toString(){
        return ("Area of rectangle is" + getArea() + ", Perimeter of rectangle is" + getPerimeter());
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Rectangle){
            Rectangle c = (Rectangle)obj;
            return(obj.equals(c) && r == c.r);
        }
        return false;
    }
}
