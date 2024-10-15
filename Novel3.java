//subclass <termasuk objectclass
public class Novel3 extends Book3{
    String genre;

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Novel3(){
        super();
        genre="";
    }

    public Novel3(String title, int year, Double price, String genre) {
        super(title, year, price);
        this.genre = genre;

    }

    public void print () {
        super.print();
        System.out.println("Genre : " + genre);
    }

}
