import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Vector;

public class Instructor implements Serializable {
    private String firstName;
    private String lastName;
    private String department;
    private String email;

    public Instructor(String _firstName, String _lastName, String _department, String _email){
        firstName = _firstName;
        lastName = _lastName;
        department = _department;
        email = _email;
    }

    public void setFirstName(String _firstName){
        firstName = _firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String _lastName){
        lastName = _lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setDepartment(String _department){
        department = _department;
    }

    public String getDepartment(){
        return department;
    }

    public void setEmail(String _email){
        email = _email;
    }

    public String getEmail(){
        return email;
    }

    public void save(Vector<Instructor> v){
        try {
            FileOutputStream f = new FileOutputStream("instructors.out");
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(v);
            o.close();
            f.close();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }

    @Override
    public String toString(){
        return firstName + " " + lastName;
    }


    @Override
    public boolean equals(Object obj){
        if(obj != null && this.getClass() == obj.getClass()){
            Instructor temp = (Instructor) obj;
            return temp.firstName.equals(firstName) && temp.lastName.equals(lastName);
        }
        return false;
    }
}