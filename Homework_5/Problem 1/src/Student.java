import java.io.FileReader;
import java.util.GregorianCalendar;

enum Grades {
    A,
    B,
    C,
    D,
    F;
}

public class Student implements Comparable{

    private String firstName;
    private String secondName;
    private int grade;
    private static int bestGrade;

    public Student(){
        firstName = "not declared yet";
        secondName = "not declared yet";
        grade = 0;
    }

    public Student(String firstName, String lastName, int grade){
        this.firstName = firstName;
        this.secondName = secondName;
        this.grade = grade;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getSecondName(){
        return secondName;
    }

    public int getGrade(){
        return grade;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null && this.getClass() == obj.getClass()){
            Student studentObj = (Student)obj;
            return (this.firstName.equals(studentObj.firstName) && this.secondName.equals(studentObj.secondName) &&
                    this.grade == studentObj.grade);
        }
        return false;
    }

    @Override
    public int compareTo(Object obj){
        Student studentObj = (Student)obj;
        if(this.grade > studentObj.grade) return 1;
        else if(this.grade < studentObj.grade) return -1;
        return 0;
    }

    @Override
    public String toString(){
        Grades currentGrade = null;

        if(bestGrade - 10 <= grade){
            currentGrade = Grades.A;
        }
        else if(bestGrade - 20 <= grade){
            currentGrade = Grades.B;
        }
        else if(bestGrade - 30 <= grade){
            currentGrade = Grades.C;
        }
        else if(bestGrade - 40 <= grade){
            currentGrade = Grades.D;
        }
        else {
            currentGrade = Grades.F;
        }

        return (firstName + " " + secondName + " - " + " ' " + currentGrade + " ' ");
    }

}
