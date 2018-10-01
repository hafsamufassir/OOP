import static java.lang.Math.*;

public abstract class Shapes {
    protected double volume;
    protected double area;
    protected double perimeter;

//    public Shapes(double volume, double area, double perimeter){
//        this.volume = volume;
//        this.area = area;
//        this.perimeter = perimeter;
//    }

    public Shapes(){

    }

    public void computeVolume(double h, double r){
        this.volume = PI * pow(r, 2) * h;
    }

    public void computeArea(double r, double h){
        this.area = 2 * PI * r * (h + r);
    }

    public void computePerimeter(double r, double h){
        this.perimeter = 2 * (PI * 2 * r + h);
    }

    public double getVolume(){
        return volume;
    }

    public double getArea(){
        return area;
    }

    public double getPerimeter(){
        return perimeter;
    }
}
