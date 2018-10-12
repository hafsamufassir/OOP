public class Student extends Person {

    @Override
    public String getName(){
        name = "Hafsa";
        System.out.println("Student name: " + name);
        return name;
    }

}
