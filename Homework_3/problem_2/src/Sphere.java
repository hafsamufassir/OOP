import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Sphere extends Shapes {
//    public Sphere(double volume, double area, double perimeter) {
//        super(volume, area, perimeter);
//    }

    public Sphere() {
        super();
    }

    public void computeVolume(double r){
        this.volume = 4/3 * PI * pow(r, 3);
    }

    public void computeArea(double r){
        this.area = 4 * PI * pow(r, 2);
    }

    public double getVolume(){
        return volume;
    }

    public double getArea(){
        return area;
    }
}
