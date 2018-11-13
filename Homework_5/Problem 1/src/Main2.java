import java.io.*;
import java.util.Collections;
import java.util.Vector;

public class Main2 {
    public static void main(String[] args){
        Vector<Student> students = new Vector<Student>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("scores.txt"));
            String line = br.readLine();

            while(line != null){
                String[] data = line.split(" ");
                students.add(new Student(data[0], data[1], Integer.parseInt(data[2])));

                line = br.readLine();
            }
            br.close();

        } catch (FileNotFoundException fe){
            fe.printStackTrace();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("grades.txt", true));

            bw.newLine();
            bw.write(String.format("Average - %d", (students.lastElement().getSumOfGrades()) / students.size()));
            bw.newLine();
            bw.append(String.format("Maximum - %d", Collections.max(students).getGrade()));
            bw.newLine();
            bw.append(String.format("Minimum - %d", Collections.min(students).getGrade()));
            bw.close();


        } catch (IOException ioe){
            ioe.printStackTrace();
        }

    }
}