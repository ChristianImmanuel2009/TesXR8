import java.util.Scanner;

public class ProjekSedangNomor2 {

    // Fungsi untuk menghitung volume tabung
    public static double hitungVolumeTabung(double r, double t) {
        final double PI = 3.14; // Konstanta PI
        return Math.PI * Math.pow(r, 2) * t; // Rumus volume tabung
    }
    //menghitung luas permukaan tabung
    public static double hitungLuasTabung(double r, double t) {
        final double PI = 3.14;
        return 2 * Math.PI * r * (r + t);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dari pengguna
        System.out.print("Masukkan jari-jari tabung (cm): ");
        double jariJari = scanner.nextDouble();

        System.out.print("Masukkan tinggi tabung (cm): ");
        double tinggi = scanner.nextDouble();

        // Panggil fungsi untuk menghitung volume
        double luasPermukaan = hitungLuasTabung(jariJari, tinggi);
        double volume = hitungVolumeTabung(jariJari, tinggi);

        // Tampilkan hasil
        System.out.printf("Volume tabung adalah %.2f\n", volume, "cm");
        System.out.printf("Luas Permukaan Tabung adalah %.2f\n", luasPermukaan, "cm");

        scanner.close();
    }
}
