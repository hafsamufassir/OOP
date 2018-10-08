public class Employee extends Person {
    
    protected double salary;
    protected int year;
    protected String insuranceNumber;

    public Employee(){
        super();
        this.salary = 0;
        this.year = 0;
        this.insuranceNumber = "unknown";
    }
    
    public Employee(String name, int age, double salary, int year, String insuranceNumber) {
        super(name, age);
        this.salary = salary;
        this.year = year;
        this.insuranceNumber = insuranceNumber;
    }

//    public String getName(){
//        return name;
//    }
//
//    public double getSalary(){
//        return salary;
//    }
//
//    public int getYear(){
//        return year;
//    }
//
//    public String getInsuranceNumber(){
//        return insuranceNumber;
//    }

    public String toString(){
        return "Name: " + this.name + ", salary:" + this.salary + ", year of start: " + this.year + ", Insurance Number: " + this.insuranceNumber;
    }

    public boolean equals(Object obj) {
        Employee e = (Employee)obj;
        
        return (super.equals(e) && this.salary == e.salary && this.year == e.year && this.insuranceNumber.equals(e.insuranceNumber));
    }

}
