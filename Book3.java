//superclass <termasuk objectclass
public class Book3 {
    protected String title;
    protected int year;
    protected Double price;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Book3 () {
        title ="";
        year=0;
        price=0.0;
    }
    public Book3 (String title, int year, Double price){
        this.title = title;
        this.year = year;
        this.price = price;
    }

    public double discount(int a, double b) {
        int discount = 0;
        if (a <= 2020 && a >= 2011) {
            discount = 20;
        }else if (a < 2011){
            discount = 50;
        }
        double discountPrice= b * discount/100;
        return discountPrice;
    }

    public void print (){
        System.out.println("Judul" + title);
        System.out.println("Tahun" + year);
        System.out.println("Harga" + (price - discount(year, price)) + ",-(setelah diskon)");
    }

}
