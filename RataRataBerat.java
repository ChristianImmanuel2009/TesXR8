//untuk menghitung rata rata
import java.util.Scanner;

public class RataRataBerat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah siswa : ");
        int jumlahSiswa = scanner.nextInt();
        
        double totalBerat = 0;
        
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan berat badan siswa ke " + i + ": ");
            double beratBadan = scanner.nextDouble();
            totalBerat += beratBadan;
        }
        
        double rataRataBerat = totalBerat / jumlahSiswa;
        System.out.println("========================================");
        System.out.println("Rata-rata berat badan siswa adalah: " + rataRataBerat);
        System.out.println("========================================");
        
        scanner.close();
    }
}
