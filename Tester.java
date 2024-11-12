import  java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Pilih 1. CD atau 2. DVD : ");
        int pilihan = in.nextInt();
        in.nextLine();

        if (pilihan == 1) {
            System.out.println("Nama : ");
            String name =in.nextLine();
            System.out.println("Artis : ");
            String artist =in.nextLine();
            System.out.println("Label : ");
            String label =in.nextLine();
            System.out.println("Nomor : ");
            int number = in.nextInt();
            System.out.println("Berapa banyak: ");
            int quantity = in.nextInt();
            System.out.println("Jumlah Total lagu : ");
            int numSong = in.nextInt();
            System.out.println("Harga : ");
            double price = in.nextDouble();
            System.out.println("Label : ");
            CD cd1 = new CD(number, name, quantity, price, artist, numSong, label);
            cd1.print();
        } else if (pilihan == 2) {
            System.out.println("Name : ");
            String name = in.nextLine();
            System.out.println("Penilaian : ");
            String rating = in.nextLine();
            System.out.println("Studio : ");
            String studio = in.nextLine();
            System.out.println("Berapa banyak : ");
            int quantity = in.nextInt();
            System.out.println("Nomor : ");
            int number = in.nextInt();
            System.out.println("Durasi :");
            int length = in.nextInt();
            System.out.println("Harga : ");
            double price = in.nextDouble();
            DVD dvd1 = new DVD(number, name, quantity, price, length, rating, studio);
            dvd1.print();
        } else {
            System.out.println("Input salah");
        }
    }
}
