public class Sphere implements Shapes {

    public double r;
    public double area;
    public double volume;

    Sphere(){ }

    public void setParametres(double r){
        this.r = r;
        //volume = 4 * Math.PI * Math.pow(r, 3);
    }

    /*public void setArea(double r){
        this.r = r;
        area = 4 * Math.PI * Math.pow(r, 2);
    }*/


    public double getVolume(){
        return 4 * Math.PI * Math.pow(r, 3);
    }

    public double getSurfaceArea(){
        return 4 * Math.PI * Math.pow(r, 2);
    }
}
