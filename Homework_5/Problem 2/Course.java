import java.io.*;
import java.util.Vector;

public class Course implements Serializable {
    private String courseTitle;
    private Instructor instructor;
    private Textbook textbook;

    public Course(String _courseTitle, Instructor _instructor, Textbook _textbook){
        courseTitle = _courseTitle;
        instructor = new Instructor(_instructor.getFirstName(), _instructor.getLastName(), _instructor.getDepartment(), _instructor.getEmail());
        textbook = new Textbook(_textbook.getISBN(), _textbook.getAuthor(), _textbook.getTitle());
    }

    public void setCourseTitle(String _courseTitle){
        courseTitle = _courseTitle;
    }

    public String getCourseTitle(){
        return courseTitle;
    }

    public void save(Vector<Course> v){
        try {
            FileOutputStream f = new FileOutputStream("courses.out");
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(v);
            o.close();
            f.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    @Override
    public String toString(){
        return courseTitle;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null && this.getClass() == obj.getClass()){
            Course temp = (Course) obj;
            return temp.courseTitle.equals(courseTitle) && temp.instructor.equals(instructor) && temp.textbook.equals(textbook);
        }
        return false;
    }
}