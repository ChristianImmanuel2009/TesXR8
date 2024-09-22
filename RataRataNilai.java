import java.util.Scanner;
public class RataRataNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Jumlah Siswa");
        int jumlahSiswa = scanner.nextInt();
        double totalNilai = 0;

        for (int i = 1; 1 <= jumlahSiswa; i++) {
            System.out.println("Masukkan Nilai siswa ke-" + i +": ");
            double nilai = scanner.nextDouble();
            totalNilai += nilai;
        }
        double rataRata = totalNilai / jumlahSiswa;
        System.out.println("Rata rata nilai dari "+ jumlahSiswa + "siswa adalah :"+ rataRata);
        scanner.close();
    }
}
