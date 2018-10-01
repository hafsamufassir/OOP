public class Person {
    protected String name;

    public Person(){

    }

    public String toString(){
        return "Name: " + this.name;
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
