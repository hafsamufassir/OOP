public class Plane implements Flyable{
    private double x;
    private double y;
    private double z;
    private double distance;
    private String name;

    public Plane(double _x, double _y, double _z, String _name){
        x = _x;
        y = _y;
        z = _z;
        name = _name;
    }

    public void setName(String _name){
        name = _name;
    }

    public String getName(){
        return name;
    }

    public void setDistance(double _distance){
        distance = _distance;
    }

    public double getDistance(){
        return distance;
    }

    public double getHeight(){
        return z;
    }

    @Override
    public void moveTo(int _x, int _y){
        distance += Math.sqrt(Math.pow(_x - x, 2) + Math.pow(_y - y, 2));
        x = _x;
        y = _y;
    }

    @Override
    public void flyTo(int _z){
        z = _z;
    }

    @Override
    public String toString(){
        return "The distance travelled by " + getName() + ": " + getDistance() + "\nThe height of fly: " + getHeight();
    }



}