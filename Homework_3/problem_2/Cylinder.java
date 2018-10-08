import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Cylinder extends Shapes {
//    public Cylinder(double volume, double area, double perimeter) {
//        super(volume, area, perimeter);
//    }
    
    private double h;
    private double r;
    
    public Cylinder(){
        this.r = r;
        this.h = h;
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
