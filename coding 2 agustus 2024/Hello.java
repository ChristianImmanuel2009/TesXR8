
import java.util.Scanner;



public class Hello{
    public static void main(String[] args) {
        
        // String nama= "Christian Immanuel";
        // String namaPanggilan= "Chris";
        // String asalKota="Malang";
        // String alamatRumah="Perumahan Mutiara Garden Blok i4 No.2";
        // String hobbi="Melukis";
        // int usia=15;
        // double beratBadan=74.00;
        // float tinggiBadan=170.0f;
        // char jenisKelamin = 'L';
        // boolean status = true;

        // System.out.println("Nama: "+nama);
        // System.out.println("Nama Panggilan: "+namaPanggilan);
        // System.out.println("Usia: "+usia);
        // System.out.println("Hobby: "+hobbi);
        // System.out.println("Asal Kota: "+asalKota);
        // System.out.println("Alamat Rumah: "+alamatRumah);
        // System.out.println("Jenis Kelamin: "+jenisKelamin);
        // System.out.println("Berat Badan: "+beratBadan);
        // System.out.println("Berat Badan: "+tinggiBadan);
        // System.out.println("Status: "+status);
        
        // Scanner input = new Scanner(System.in);
        // System.out.println("Masukkan Nama Siswa");
        // String nama= input.nextLine();
        // System.out.println("Masukkan Alamat Siswa");
        // String alamat= input.nextLine();
        // System.out.println("Masukkan Usia Siswa");
        // int usia= input.nextInt();
        // System.out.println("Masukkan Jenis Kelamin");
        // String jenisKelamin= input.nextLine();
        // System.out.println("=====================");
        // System.out.println("Selamat datang, "+nama + "!");

        // double alas,tinggi,hasil;
        // Scanner input = new Scanner(System.in);
        // System.err.println("Masukkan alas segitiga: ");
        // alas = input.nextDouble();
        // System.err.println("Masukkan tinggi segitiga: ");
        // tinggi = input.nextDouble();
        // hasil = 0.5*alas*tinggi;
        // System.out.println("Hasil luas segitiga adalah: "+hasil);

        // double panjang,tinggi,hasil;
        // Scanner input = new Scanner(System.in);
        // System.err.println("Masukkan panjang Jajar genjang: ");
        // panjang = input.nextDouble();
        // System.err.println("Masukkan tinggi Jajar genjang");
        // tinggi = input.nextDouble();
        // hasil = panjang*tinggi;
        // System.err.println("Hasil luas Jajar Genjang adalah: "+hasil);
        
        double diagonal1,diagonal2,hasil;
        Scanner input = new Scanner(System.in);
        System.err.println("Masukkan Diagonal 1 layang layang: ");
        diagonal1 = input.nextDouble();
        System.err.println("Masukkan Diagonal 2 layang layang");
        diagonal2 = input.nextDouble();
        hasil = 0.5*diagonal1*diagonal2;
        System.err.println("Hasil luas Layang Layang adalah: "+hasil);
    }
}