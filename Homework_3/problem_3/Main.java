public class Main {

    static void checkPersonClass() {
        
        Person Musta = new Person("Musta", 18);
        Person empty = new Person();
        
        System.out.println(Musta.toString());
        System.out.println(empty.toString());
        System.out.println();
        
    }
    
    static void checkEmployeeClass() {
        
        Employee Musta = new Employee("Musta", 18, 12015.65, 3, "178207");
        Employee empty = new Employee();
        
        System.out.println(Musta.toString());
        System.out.println(empty.toString());
        System.out.println("Musta equals Empty is " + Musta.equals(empty));
        System.out.println("Musta equals Musta is " + Musta.equals(roma));
        System.out.println();
    }
    
    static void checkManagerClass() {
        
        Manager Musta = new Manager("Musta", 18, 12015, 3, "178207289", 1400);
        Manager empty = new Manager();
        
        roma.addEmployee(new Employee("Munta", 10, 1000, 1, "178207223"));
        roma.addEmployee(new Employee("Munni", 8, 15120, 6, "178207428"));
        
        System.out.println(Musta.toString());
        System.out.println(empty.toString());
        System.out.println("Musta equals Empty is " + Musta.equals(empty));
        System.out.println("Musta equals Musta is " + Musta.equals(roma));
        System.out.println();
    }
    
    public static void main(String args[]) {
        checkPersonClass();
        checkEmployeeClass();
        checkManagerClass();
    }
}
