import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student {

    Transcript transcript;
    Course course = new Course();
    Integer studyYear;
    String specialty;

    private Map<Course, Teacher> courses = new HashMap<Course, Teacher>();

    public void setCourse(Course course, Teacher teacher){

    }

    public Map<Course, Teacher> getCourses(){
        return Map<Course, Teacher>; //Dauren
    }

    public ArrayList<CourseFile> getCourseFiles(Course course){
        return ArrayList<CourseFile>; //Dauren
    }

    public Teacher getCourseTeacherInfo(Course course){
        return Teacher; //info
    }


    public void setTranscript(Transcript transcript){
        this.transcript = transcript;
    }

    public Transcript getTranscript(){
        return transcript;
    }

}
