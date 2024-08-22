import java.util.Scanner;

public class bukuTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inputkan Judul Buku");
        String judul = in.nextLine();
        System.out.println("Inputkan Pengarang Buku");
        String pengarang = in.nextLine();
        System.out.println("Inputkan Tahun terbit Buku");
        int tahunTerbit= in.nextInt();
        System.out.println("Inputkan ID Buku");
        int id = in.nextInt();

        buku A1 = new buku(id, judul, pengarang, tahunTerbit );

        // buku A1 = new buku(99, "Cara Raih Juara 1", "Ciello", 2002 );
        // buku A2 = new buku(98, "Memasak Ala Chef", "Cola", 2001);
        // buku A3 = new buku(97, "Tutorial Masakan Nusantara", "Cilla", 2000);
        // buku A4 = new buku(96, "Ilmu jendela dunia", "Corrie", 1999);
        // buku A5 = new buku(95, "Menerapkan cara hidup hemat", "Canna", 1998);

        A1.id = 99;
        A1.judul = "Cara Raih Juara 1";
        A1.pengarang = "Ciello";
        A1.tahunTerbit = 2002;
        // A2.id = 98;
        // A2.judul = "Memasak Ala Chef";
        // A2.pengarang = "Cola";
        // A2.tahunTerbit = 2001;
        // A3.id = 97;
        // A3.judul = "Tutorial Masakan Nusantara";
        // A3.pengarang = "Cilla";
        // A3.tahunTerbit = 2000;
        // A4.id = 96;
        // A4.judul = "Ilmu Jendela Dunia";
        // A4.pengarang = "Corrie";
        // A4.tahunTerbit = 1999;
        // A5.id = 95;
        // A5.judul = "Menerapkan cara hidup hemat";
        // A5.pengarang = "Canna";
        // A5.tahunTerbit = 1998;

        System.out.println(" Judul Buku : "+A1.judul+" - Pengarang Buku : "+A1.pengarang+" - Tahun Terbit : "+A1.tahunTerbit+" - Id Buku : "+A1.id);
        // System.out.println(" Id Buku : "+A2.id+" - Judul Buku : "+A2.judul+" - Pengarang Buku : "+A2.pengarang+" - Tahun Terbit : "+A2.tahunTerbit);
        // System.out.println(" Id Buku : "+A3.id+" - Judul Buku : "+A3.judul+" - Pengarang Buku : "+A3.pengarang+" - Tahun Terbit : "+A3.tahunTerbit);
        // System.out.println(" Id Buku : "+A4.id+" - Judul Buku : "+A4.judul+" - Pengarang Buku : "+A4.pengarang+" - Tahun Terbit : "+A4.tahunTerbit);
        // System.out.println(" Id Buku : "+A5.id+" - Judul Buku : "+A5.judul+" - Pengarang Buku : "+A5.pengarang+" - Tahun Terbit : "+A5.tahunTerbit);
       
        in.close();
    }
}
