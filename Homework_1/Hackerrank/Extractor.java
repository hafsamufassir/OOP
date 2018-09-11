import java.util.Scanner;
import java.util.regex.*;

public class Extractor{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
            
            //Write your code here
            boolean matchFound = false;
            Pattern p = Pattern.compile("<(.+)>([^<]+)</(.+)>");
            Matcher m = p.matcher(line);

            while(m.find()){
                System.out.println(m.group(2));
                matchFound = true;
            }
            
            testCases--;
        }
    }
}

// boolean matchFound = false;
//             Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
//             Matcher m = r.matcher(line);

//             while (m.find()) {
//                 System.out.println(m.group(2));
//                 matchFound = true;
//             }
//             if ( ! matchFound) {
//                 System.out.println("None");

// import java.util.Scanner;

// public class Extractor{
//     public static void main(String[] args){
//         int n = 0;
//     Scanner sc = new Scanner(System.in);
//     //System.out.print("Введите свой текст: ");
//     String self = sc.nextLine();
//     //String self = getString();//как-нибудь получаем строку
    
//     // for (char ch : self.toCharArray()) {
//     //     if ( !Character.isLetterOrDigit(ch) ) {
//     //         n++;
//     //         removeChar(self, ch);
//     //     }
//     // }

//     String result = self.replaceAll("<(.+)>|</(.+)>", "");//регулярным выражением заменяем буквы(\\w) и цифры(\\d) на пустую строку, то есть удаляем.


//     //System.out.println("Количество других символов: " + n);
//     System.out.println(result);

//     }
// }