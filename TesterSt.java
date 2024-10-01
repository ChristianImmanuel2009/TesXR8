
import java.util.Scanner;

public class TesterSt {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Pilih 1. Student atau 2. Teacher : ");
        int pilihan = in.nextInt();
        in.nextLine();

        if (pilihan == 1) {
            System.out.println("Nama : ");
            String name = in.nextLine();
            System.out.println("Umur : ");
            int age = in.nextInt();
            System.out.println("Major : ");
            String major = in.nextLine();
            System.out.println("Nomor : ");
            int studentNumber = in.nextInt();
            System.out.println("Score : ");
            int score = in.nextInt();
            Student2 std2 = new Student2(name, age, studentNumber, score, major);
            std2.print();
        } else if (pilihan == 2) {
            System.out.print("Pilih 1. Fulltime atau 2. Partime : ");
            int pilihant = in.nextInt();
            in.nextLine();
            if (pilihant == 1) {
                System.out.println("Name : ");
                String name = in.nextLine();
                System.out.println("Subjek : ");
                String subject = in.nextLine();
                System.out.println("Unit :");
                String unit = in.nextLine();
                System.out.println("Umur : ");
                int age = in.nextInt();
                System.out.println("salary : ");
                int anualSalary = in.nextInt();
                Fulltime2 Ft2 = new Fulltime2(name, age, subject, anualSalary, unit);
                Ft2.print();
            } else {
                System.out.println("Name : ");
                String name = in.nextLine();
                System.out.println("Subjek : ");
                String subject = in.nextLine();
                System.out.println("Umur : ");
                int age = in.nextInt();
                System.out.println("Per-Jam :");
                int hoursworked = in.nextInt();
                PartTime2 Pt2 = new PartTime2(name, age, subject, hoursworked);
                Pt2.print();
            }
        }
    }
}
