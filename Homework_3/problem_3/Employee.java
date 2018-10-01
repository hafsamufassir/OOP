public class Employee extends Person {
    protected String name;
    protected double salary;
    protected int year;
    protected String insuranceNumber;

    public Employee(){
        super();
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public int getYear(){
        return year;
    }

    public String getInsuranceNumber(){
        return insuranceNumber;
    }

    public String toString(){
        return "Name: " + this.name + ", salary:" + this.salary + ", year of start: " + this.year + ", Insurance Number: " + this.insuranceNumber;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!Person.class.isAssignableFrom(obj.getClass())) {
            return false;
        }
        return true;
    }

}
