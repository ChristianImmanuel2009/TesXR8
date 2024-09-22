import java.util.Scanner;

public class Kelipatan6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int batasAwal,batasAkhir;

        System.out.println("Masukkan Batas Akhir Anda");
        batasAwal = input.nextInt();
        System.out.println("Masukkan Batas Akhir Anda");
        batasAkhir = input.nextInt();

        while (i >= batasAwal && i <= batasAkhir) {
        System.out.println(i);
        i+=6;
        }

    }
}
