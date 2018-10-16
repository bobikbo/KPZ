import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void cout(Notebook [] mass){
        String ramka = "+";
        for(int i=0; i<118; i++)ramka += "-";
        ramka += "+";
        System.out.println(ramka);
        for(int i=0; i<mass.length && mass[i] != null; i++) {
            String info = "|" + (i+1) + ") " + mass[i].toString();
            for(int j=info.length(); j<119; j++)info += " ";
            info += "|";
            System.out.println(info);
            System.out.println(ramka);
        }
    }

    public static void coutSurname(Notebook [] mass, char symbol){
        int res = 0;
        for(int i=0; i<mass.length && mass[i] != null; i++){
            char c = mass[i].surname.charAt(0);
            c = Character.toUpperCase(c);
            if(c == symbol){res++;break;}
        }
        System.out.println("Users whose surname begins with the character: " + symbol);
        if(res > 0){
            String ramka = "+";
            for(int i=0; i<118; i++)ramka += "-";
            ramka += "+";
            System.out.println(ramka);
            res = 0;
            for(int i=0; i<mass.length && mass[i] != null; i++) {
                char c = mass[i].surname.charAt(0);
                c = Character.toUpperCase(c);
                if(c == symbol) {
                    String info = "|" + (res + 1) + ") " + mass[i].toString();
                    for (int j = info.length(); j < 119; j++) info += " ";
                    info += "|";
                    System.out.println(info);
                    System.out.println(ramka);
                    res++;
                }
            }
            System.out.println("");
        }
        else{
            System.out.println("There are no such users!\n");
        }
    }

    public static void coutNumber(Notebook [] mass){
        int res = 0;
        for(int i=0; i<mass.length && mass[i] != null; i++){
            if(mass[i].phone.length() > 0){res++;break;}
        }
        if(res > 0){
            String ramka = "+";
            for(int i=0; i<118; i++)ramka += "-";
            ramka += "+";
            System.out.println(ramka);
            res = 0;
            for(int i=0; i<mass.length && mass[i] != null; i++) {
                if(mass[i].phone.length() > 0) {
                    String info = "|" + (res + 1) + ") " + mass[i].toString();
                    for (int j = info.length(); j < 119; j++) info += " ";
                    info += "|";
                    System.out.println(info);
                    System.out.println(ramka);
                    res++;
                }
            }
            System.out.println("");
        }
        else{
            System.out.println("There are no such users!\n");
        }
    }

    public static void main(String[] args) {

        System.out.println("Kalyshka D.M.");
        Scanner in = new Scanner(System.in);

        int zap = 0;

        Notebook [] mass = new Notebook[10];

        System.out.print("Do you want to fill in the data about the person in the notebook? (1 - yes, else - no):");
        String musor = "";
        zap = in.nextInt();
        if(zap == 1){
            int count = 0;
            while(count < 10 && zap == 1){
                musor = in.nextLine();
                System.out.print("Surname: ");
                String surname = in.nextLine();
                System.out.print("Name: ");
                String name = in.nextLine();
                System.out.print("Do you want enter full information? (1 - yes, else - no): ");
                int dal = in.nextInt();
                musor = in.nextLine();
                if(dal == 1) {
                    System.out.print("Last name: ");
                    String lastName = in.nextLine();
                    System.out.print("Address: ");
                    String address = in.nextLine();
                    System.out.print("Phone: ");
                    String phone = in.nextLine();
                    System.out.print("Additional information: ");
                    String additionalInformation = in.nextLine();
                    mass[count] = new Notebook(surname, name, lastName, address, phone, additionalInformation);
                }
                else{
                    mass[count] = new Notebook(surname, name);
                }
                count++;
                System.out.print("Do you want to add another entry? (1 - yes, else - no):");
                zap = in.nextInt();
            }

            //cout
            System.out.println("\n\nNotebook table:");
            cout(mass);

            //cout Task 1
            System.out.print("\nTask 1. Enter the first character of the surname to search: ");
            String str = in.next();
            char symbol = str.charAt(str.length()-1);
            symbol = Character.toUpperCase(symbol);
            coutSurname(mass, symbol);

            //cout Task 2
            System.out.println("\nTask 2. Every user who has a phone number: ");
            coutNumber(mass);
        }
    }
}
