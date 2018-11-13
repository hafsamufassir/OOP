import java.io.*;
import java.lang.management.BufferPoolMXBean;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Vector<Student> students = new Vector<Student>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("scores.txt"));
            String line = br.readLine();

            while (line != null){
                String[] data = line.split(" ");
                students.add(new Student(data[0], data[1], Integer.parseInt(data[2])));

                line = br.readLine();
            }
            br.close();
        }
        catch (FileNotFoundException fe){
            fe.printStackTrace();
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }

        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("grades.txt"));
            int index = 0;
            for(Student s : students){
                bw.write(String.format("%d) %s", ++index, s.toString()));
                bw.newLine();
            }
            bw.close();
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
