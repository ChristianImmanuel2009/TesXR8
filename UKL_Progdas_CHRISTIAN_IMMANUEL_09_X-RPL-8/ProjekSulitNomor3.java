import java.util.Scanner;

public class ProjekSulitNomor3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input ukuran array
        System.out.print("Masukkan jumlah elemen dalam array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        // Input elemen array
        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Elemen ke-%d: ", i + 1);
            array[i] = scanner.nextInt();
        }

        // Hitung dan tampilkan frekuensi elemen
        System.out.println("Frekuensi setiap elemen:");
        calculateFrequency(array);

        scanner.close();
    }

    // Function untuk menghitung dan mencetak frekuensi
    public static void calculateFrequency(int[] array) {
        boolean[] checked = new boolean[array.length]; // Penanda elemen yang sudah dihitung

        for (int i = 0; i < array.length; i++) {
            if (checked[i]) {
                continue; // Lewati elemen yang sudah dihitung
            }

            int count = 1; // Mulai dengan 1 untuk menghitung elemen saat ini
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    checked[j] = true; // Tandai elemen yang sama
                }
            }

            // Cetak hasil untuk elemen saat ini
            System.out.printf("%d muncul %d kali%n", array[i], count);
        }
    }
}
