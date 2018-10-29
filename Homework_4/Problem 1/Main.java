public class Main {

    public static void main(String[] args) {

        Cylinder cyl = new Cylinder();
        cyl.setParametres(5, 4);
        System.out.println("Surface area of cylinder: " + cyl.getSurfaceArea());
        System.out.println("Volume of cylinder: " + cyl.getVolume());

        Cube cube = new Cube();
        cube.setParametres(3);
        System.out.println("Surface area of cube: " + cube.getSurfaceArea());
        System.out.println("Volume of cube: " + cube.getVolume());

        Sphere sph = new Sphere();
        sph.setParametres(5);
        System.out.println("Surface area of sphere: " + sph.getSurfaceArea());
        System.out.println("Volume of sphere: " + sph.getVolume());
    }
}
