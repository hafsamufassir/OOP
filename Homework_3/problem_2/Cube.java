import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Cube extends Shapes {
    private double a;
    
    public Cube(double a) {
        this.a = a;
    }

    public void computeVolume(double a){
        this.volume = pow(a, 3);
    }

    public void computeArea(double a){
        this.volume = 6 * pow(a, 2);
    }

    public double getVolume(){
        return volume;
    }

    public double getArea(){
        return area;
    }

}
