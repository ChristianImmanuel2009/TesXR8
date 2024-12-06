
import java.util.Scanner;

public class ProjekMudahNomor2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //scanner untuk kita bisa input suatu bilangan

        System.out.println("Masukkan suatu bilangan: "); //menampilkan teks
        int bilangan = input.nextInt(); 

        if (bilangan % 2 == 0) { //percabangan jika bilangan bisa dimodulus 2 dan hasil nya 0 = bilangan genap
            System.out.println(bilangan + " adalah bilangan genap");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil");
        }
    }
}
