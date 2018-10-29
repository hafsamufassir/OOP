package Task3Package;

public class Circle extends Shape {

    public double r;

    public Circle(){
        super();
    }

    public Circle(double r){
        this.r = r;
    }

    public Circle(double r, String color, boolean filled){
        this.r = r;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius(){
        return r;
    }

    public void setRadius(double r){
        this.r = r;
    }

    public double getArea(){
        return (Math.PI * Math.pow(r, 2));
    }

    public double getPerimeter(){
        return (2 * Math.PI * r);
    }

    @Override
    public String toString(){
        return ("Area of circle is" + getArea() + ", Perimeter or circle is" + getPerimeter());
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Circle){
            Circle c = (Circle)obj;
            return(obj.equals(c) && r == c.r);
        }
        return false;
    }


}
