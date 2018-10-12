public class Employee extends Person {

    @Override
    public String getName(){
        System.out.println("Employee Name: " + name);
        return name;
    }
}
