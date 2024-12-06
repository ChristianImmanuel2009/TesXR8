
import java.util.Scanner;

public class ProjekSulitNomor2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input ukuran array
        System.out.print("Masukkan jumlah elemen dalam array: ");
        int n = scanner.nextInt();

        // Deklarasi array
        int[] array = new int[n];

        // Input elemen array
        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Elemen ke-%d: ", i + 1);
            array[i] = scanner.nextInt();
        }

        // Tampilkan array
        System.out.print("Array: {");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        // Cek duplikat menggunakan nested loop
        boolean hasDuplicate = false;
        System.out.println("Array memiliki elemen duplikat: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[i] + " ");
                    hasDuplicate = true;
                    break; 
                }
            }
        }

        if (!hasDuplicate) {
            System.out.println("Tidak ada.");
        } else {
            System.out.println();
        }

        scanner.close();
    }
}
