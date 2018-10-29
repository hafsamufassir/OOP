public class Person {
    private String name;

    public Person(){
        this.name = "unknown";
    }

    public Person(String name) {
        this.name = name;
    }

    public String toString(){
        return "Name: " + this.name;
    }

    public boolean equals(Object obj) {
        if(obj instanceof Person) {
            Person p = (Person) obj;

            return (this.name.equals(p.name));
        }

        return false;
    }
}