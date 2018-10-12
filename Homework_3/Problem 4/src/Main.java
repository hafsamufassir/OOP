public class Main {

    public static void main(String[] args) {
        Student studentObject = new Student();
        Employee employeeObject = new Employee();

        Person ref = studentObject;

        String temp = ref.getName();
        System.out.println(temp);

        ref = employeeObject;

        //String temp = ref.getName();
        System.out.println(temp);

        printInformation(studentObject);
        printInformation(employeeObject);
    }

    public static void printInformation(Person p){
        p.getName();
    }
}
