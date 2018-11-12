import java.util.ArrayList;
import java.util.Map;


public class Teacher {

    enum titles {
        TUTOR,
        LECTOR,
        SENIOR_LECTOR,
        PROFESSOR;
    }


    Map<Course, ArrayList<Student> > courseStudents;
    Map <Course, ArrayList <CourseFile> > courseFiles;

    public Teacher() {
    }

    public boolean deleteCourseFiles(Course course){
        return true;
    }

    public void addCourse(Course course){

    }

    public ArrayList <Course> getCourses(){
        return ArrayList<Course>;
    }

    public void addCourseFiles(Course course){

    }

    public void putMark(Course course, Student student, Integer score){

    }

    public void sendOrderSupport(String commands){

    }

    public ArrayList<Student> getCourseStudents(Course course){
        return ArrayList<Student>;
    }

    public Student getStudentInfo(Course course, String ID){
        return Student;
    }
}
