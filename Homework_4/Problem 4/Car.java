public class Car implements Moveable {
    private double x;
    private double y;
    private double distance;
    private String brand;

    public Car(double _x, double _y, String _brand){
        x = _x;
        y = _y;
        brand = _brand;
    }
    public void setBrand(String _brand){
        brand = _brand;
    }

    public String getBrand(){
        return brand;
    }

    public void setDistance(double _distance){
        distance = _distance;
    }

    public double getDistance(){
        return distance;
    }

    @Override
    public void moveTo(int _x, int _y){
        distance += Math.sqrt(Math.pow(_x - x, 2) + Math.pow(_y - y, 2));
        x = _x;
        y = _y;
    }

    @Override
    public String toString(){
        return "The distance travelled by " + getBrand() + ": " + getDistance();
    }



}