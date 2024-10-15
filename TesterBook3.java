//driverclass <termasuk objectclass
import java.util.Scanner;
public class TesterBook3 {
    public static void main(String[] args) {
        int pilihan;
        String pilihan2;
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih Jenis Buku: \n 1.Textbook \n 2.Novel\n=");
        pilihan = input.nextInt();
        if (pilihan == 1) {
        System.out.println("Title: ");
        String title = input.next();
        System.out.println("Year: ");
        int year = input.nextInt();
        System.out.println("Price: ");
        double price = input.nextDouble(); 
        System.out.println("Subject: ");
        String subject = input.next();
        System.out.println("Apakah memilih Biografi? (1.Ya/2.Tidak)");
        pilihan2 = input.next();     
       
        switch (pilihan2) {
            case "1":
                System.out.println("About: ");
                String about = input.next();
               Biography3 bio3= new Biography3(title,year,price,subject,about);
               bio3.print();
            case ("2"):
            TextBook3 txt3= new TextBook3(title,year,price,subject);
            txt3.print();
                break;
        
            default:
                break;
        }
        } else if (pilihan == 2) {
            System.out.println("Title: ");
            String title = input.next();
            System.out.println("Year: ");
            int year = input.nextInt();
            System.out.println("Price: ");
            double price = input.nextDouble(); 
            System.out.println("Genre: ");
            String genre = input.next();
            Novel3 nvl3= new Novel3(title,year,price,genre);
            nvl3.print();   
        }
    }
}