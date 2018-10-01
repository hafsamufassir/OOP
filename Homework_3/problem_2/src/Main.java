public class Main {

    public static void main(String[] args) {
//	Shapes shape = new Shapes();
	Cylinder cylinder = new Cylinder();
	Sphere sphere = new Sphere();
	Cube cube = new Cube();

	cylinder.computePerimeter(2, 4);
	System.out.println(cylinder.getPerimeter());

	sphere.computeVolume(5, 3);
	System.out.println(sphere.getVolume());

	cube.computeArea(2);
	System.out.println(cube.getArea());
    }
}
