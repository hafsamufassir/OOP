public class Cube implements Shapes {

    public double a;
    public double area;
    public double volume;

    Cube(){ }

    public void setParametres(double a){
        this.a = a;
        //volume = 6 * Math.pow(a, 2);
    }

    /*public void setArea(double a){
        this.a = a;
        area = Math.pow(a, 3);
    }*/

    public double getVolume(){
        return 6 * Math.pow(a, 2);
    }

    public double getSurfaceArea(){
        return Math.pow(a, 3);
    }
}
