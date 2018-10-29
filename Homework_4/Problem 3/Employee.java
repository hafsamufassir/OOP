import java.util.Date;

public class Employee extends Person implements Comparable{
    protected double salary;
    protected Date hireDate;
    protected String insuranceNumber;

    public Employee(){
        super();
        this.salary = 0;
        this.insuranceNumber = "unknown";
    }

    public Employee(String name, double salary, Date hireDate, String insuranceNumber){
        super(name);
        this.salary = salary;
        this.insuranceNumber = insuranceNumber;

    }

    public String toString(){
        return "Name: " + super.toString() + ", salary:" + this.salary + ", year of start: " + ", Insurance Number: " + this.insuranceNumber;
    }

    public boolean equals(Object obj){
        if(obj instanceof Employee){
            Employee e = (Employee)obj;

            return (super.equals(e) && this.salary == e.salary &&
                    this.insuranceNumber.equals(e.insuranceNumber));
        }
        return false;
    }

    public int compareTo(Object o){
        Employee e = (Employee)o;
        int res;
        if(e.salary > this.salary){
            res = -1;
        }else{
            if(e.salary == this.salary){
                res = 0;
            }else{
                res = 1;
            }
        }
        return res;
    }

    /*public Object compare(Employee employee1, Employee employee2)
    {
        // Construct an instance of an object of type Class

        return object;
    }*/

}
