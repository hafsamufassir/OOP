public class Transcript {

    String courseName;
    double GPA;
    Integer score;
    char grade;

    Transcript(){

    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Transcript{" +
                "courseName='" + courseName + '\'' +
                ", GPA=" + GPA +
                ", score=" + score +
                ", grade=" + grade +
                '}';
    }
}
