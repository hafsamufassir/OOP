public class Main {

    public static void main(String[] args){
        Car c = new Car(0, 0, "Camaro");
        c.moveTo(3, 4);
        c.moveTo(6, 8);
        System.out.println(c);

        Plane p = new Plane(0,0,0,"Astana");
        p.moveTo(3,4);
        p.flyTo(70);
        System.out.println(p);
    }
}
