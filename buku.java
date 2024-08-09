public class buku {
    int id;
    String judul;
    String pengarang;
    int tahunTerbit;

    public buku () {
        id = 0;
        judul = "kosong";
        pengarang = "kosong";
        tahunTerbit = 0;

    }

    public buku(int id, String judul, String pengarang, int tahunTerbit) {
        this.id = id;
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;

    // public buku(){
    //    System.out.println("Idnya"+ id);
    //    System.out.println("Judulnya"+ judul);
    //    System.out.println("Pengarangnya"+ pengarang);
    //    System.out.println("Tahun Terbitnya"+ tahunTerbit);
    }
}
