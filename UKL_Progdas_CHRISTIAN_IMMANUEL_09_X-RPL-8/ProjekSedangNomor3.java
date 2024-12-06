import java.util.Random;
import java.util.Scanner;

public class ProjekSedangNomor3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean keepPlaying = true;

        System.out.println("Selamat datang di Kuis Matematika!");
        System.out.println("Pilihan soal:");
        System.out.println("1. Perkalian");
        System.out.println("2. Pembagian");
        System.out.println("3. Modulus");
        System.out.println("Ketik 'stop' untuk keluar.\n");

        while (keepPlaying) {
            System.out.print("Pilih jenis soal (1-3): ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("stop")) {
                keepPlaying = false;
                System.out.println("Terima kasih telah bermain!");
                break;
            }

            int num1 = random.nextInt(10) + 1; // Bilangan pertama (1-10)
            int num2 = random.nextInt(10) + 1; // Bilangan kedua (1-10)
            int correctAnswer = 0;
            char operator = ' ';

            switch (choice) {
                case "1":
                    operator = '*';
                    correctAnswer = num1 * num2;
                    break;
                case "2":
                    operator = '/';
                    num1 = num1 * num2; // Pastikan pembagian menghasilkan bilangan bulat
                    correctAnswer = num1 / num2;
                    break;
                case "3":
                    operator = '%';
                    correctAnswer = num1 % num2;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
                    continue; // Kembali ke awal loop
            }

            // Tampilkan soal
            System.out.printf("Soal: %d %c %d = ?%n", num1, operator, num2);

            // Baca jawaban pengguna
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("stop")) {
                keepPlaying = false;
                System.out.println("Terima kasih telah bermain!");
                break;
            }

            try {
                int userAnswer = Integer.parseInt(userInput);
                if (userAnswer == correctAnswer) {
                    System.out.println("Benar!");
                } else {
                    System.out.printf("Salah! Jawaban yang benar adalah %d.%n", correctAnswer);
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Silakan masukkan angka atau 'stop'.");
            }

            System.out.println(); // Tambahkan baris kosong untuk mempercantik output
        }

        scanner.close();
    }
}
