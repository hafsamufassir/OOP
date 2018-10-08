public class Manager extends Employee {
    
    private Vector <Employee> team = new Vector <Employee>();
    private double bonus;
    
    public Manager(){
        super();
        bonus = 0;
    }
    
    public Manager(String name, int age, double salary, int year, String insuranceNumber, double bonus) {
        super(name, age, salary, year, insuranceNumber);
        this.bonus = bonus;
    }
    
    public void addEmployee(Employee e) {
        team.add(e);
    }
    
    public boolean equals(Object obj) {
        Manager m = (Manager)obj;
        return (super.equals(m) && this.team.equals(m.team) && this.bonus == m.bonus);
    }
    
    public String toString() {
        return super.toString();
    }
}
