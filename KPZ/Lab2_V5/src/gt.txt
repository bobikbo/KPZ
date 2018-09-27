import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {

        System.out.println("Kalyshka D.M.");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of the word: ");
        int len = in.nextInt();
        System.out.print("Enter a new string: ");
        String str2 = in.next();

        String [] str1 = {
                "a   ab  abc      abcd abcd    abc       ab a ",
                "abcd abc  ab    a a  ab abc   abcd",
                "a ab abc abcd"
        };

        System.out.println("\n");
        for(int i=0; i<str1.length; i++)System.out.println(str1[i]);
        System.out.println("\n////////////////////////////////////////\n");


        //////////////////////////////////
        for(int z=0; z<str1.length; z++) {
            String[] mass = new String[str1[z].length()];
            for (int i = 0; i < str1[z].length(); i++) mass[i] = "";

            int word = 0;
            char[] chars = str1[z].toCharArray();

            for (int i = 0; i < str1[z].length(); ) {
                while (i < str1[z].length() && chars[i] != ' ') {
                    mass[word] += chars[i];
                    i++;
                }
                word++;
                while (i < str1[z].length() && chars[i] == ' ') i++;
            }

            for (int i = 0; i < word; i++) {
                if (mass[i].length() == len) mass[i] = str2;
            }

            int word1 = 0;
            for (int i = 0; i < str1[z].length(); ) {
                while (i < str1[z].length() && chars[i] != ' ') {
                    mass[word] += chars[i];
                    i++;
                }
                System.out.print(mass[word1]);
                word1++;
                while (i < str1[z].length() && chars[i] == ' ') {
                    i++;
                    System.out.print(' ');
                }
            }
            System.out.println("");
        }
    }
}
