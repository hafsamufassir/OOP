public class Cylinder implements Shapes{

    public double r;
    public double h;
    public double area;
    public double volume;

    Cylinder(){ }

    public void setParametres(double r, double h){
        this.r = r;
        this.h = h;
        //volume = Math.PI * Math.pow(r, 2) * h;
    }

    /*public void setArea(double r, double h){
        this.r = r;
        this.h = h;
        //area = 2 * Math.PI * h * r + 2 * Math.PI * Math.pow(r, 2);
    }*/

    public double getVolume(){
        return Math.PI * Math.pow(r, 2) * h;
    }

    public double getSurfaceArea(){
        return 2 * Math.PI * h * r + 2 * Math.PI * Math.pow(r, 2);
    }
}
