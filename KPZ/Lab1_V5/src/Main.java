import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Kalyshka D.M.\n");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = in.nextInt();
        byte [][] mass = new byte[n][n];

        for(int i=0; i<n; i++) {
            for (int j = 0; j < n; j++){
                mass[i][j] = (byte)(Math.random()*100);
                System.out.printf("%4d", mass[i][j]);
            }
            System.out.println("");
        }

        System.out.println("\n////////////////////////////////\n");

        byte [][] mass1 = new byte[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mass1[j][i] = mass[i][j];
            }
        }
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                System.out.printf("%4d", mass1[i][j]);
            }
            System.out.println("");
        }

    }
}
