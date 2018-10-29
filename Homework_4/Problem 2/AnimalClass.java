public abstract class AnimalClass implements AnimalInterface {

    public double b; //Abstract class can contain non-final variables

    public abstract void sayHi();

    public void sayHello(){
        System.out.println("Hello!");
    } // Abstract class can have non-abstract methods

    //Abstract class can have final, non-final, static and non-static variables.

}
