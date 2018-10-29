package Task3Package;

public class Tester {
    public static void main(String[] args) {

        Circle cirlce = new Circle();
        Square square = new Square();
        Rectangle rect = new Rectangle();

        System.out.println(cirlce.getRadius());

        square.setSide(12);
        System.out.println(square.getSide());

        rect.setLength(5);
        rect.setWidth(3);
        System.out.println(rect.getArea());

    }
}
