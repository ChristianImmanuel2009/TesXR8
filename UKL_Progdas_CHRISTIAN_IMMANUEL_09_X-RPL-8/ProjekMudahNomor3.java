public class ProjekMudahNomor3 {
    public static void main(String[] args) {
        for (int i = 50; i >= 2; i--) { //karena di soal ada 50 turun ke angka 1
            if (i % 3 == 0) { //jika urutan teks bisa di bagi 3 dan hasilnya 0 maka akan menampilkan "saya angkatan 33"
                System.out.println(i + ". Saya angkatan 33");
            }else if(i % 2 == 0){  //jika urutan teks bisa dibagi 2 dan hasilnya 0 maka akan menampilkan "saya anak moklet"
                System.out.println(i +". Saya anak moklet");
            }else{ //dan jika tidak bisa dibagi 3 dan 2 akan menampilkan "saya anak wikusama"
                System.out.println(i + ". Saya anak wikusama");
            }
        }
        System.out.println("1. Saya senang");
    }
}
