import java.util.Scanner;

public class Diskon {
    public static void main(String[] args) {
        int TotalHarga ;
        int hargaBarang ;
        Double diskonBarang ;
        int jumlahBarang ;
        double hasilAkhir ;

        Scanner input = new Scanner(System.in);
        System.err.println("Masukkan Harga Barang: ");
        hargaBarang= input.nextInt();
        System.err.println("Masukkan Diskon Barang: ");
        diskonBarang = input.nextDouble();

        System.err.println("Masukkan Jumlah Barang: ");
        jumlahBarang = input.nextInt();
        TotalHarga = hargaBarang*jumlahBarang;
        System.err.println("Total Belanja Anda: "+TotalHarga);
        diskonBarang = diskonBarang / 100 * TotalHarga;
        hasilAkhir = TotalHarga - diskonBarang;
        System.err.println("Total akhir Anda: "+hasilAkhir);


        // int TotalGaji ;
        // int GajiKaryawan;
        // Double PajakGaji ;
        // int jumlahJamKerja ;
        // int TarifJamKerja ;
        // double hasil_akhir;

        // // double hargaBarang,diskonBarang,jumlahBarang,TotalHarga;
        // Scanner input = new Scanner(System.in);
        // System.err.println("Masukkan tarif perjam: ");
        // GajiKaryawan= input.nextInt();
        // System.err.println("Masukkan Pajak Gaji: ");
        // PajakGaji = input.nextDouble();

        // System.err.println("Masukkan Jumlah Jam Kerja: ");
        // jumlahJamKerja = input.nextInt();
        // GajiKaryawan= GajiKaryawan*jumlahJamKerja;
        // System.err.println("Total Gaji Anda: "+GajiKaryawan);
        // PajakGaji = (PajakGaji / 100 )* GajiKaryawan;
        // hasil_akhir = GajiKaryawan - PajakGaji;
        // System.err.println("Total akhir Anda: "+hasil_akhir);
        


    }
}
