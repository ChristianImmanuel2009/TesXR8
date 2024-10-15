//subclass <termasuk objectclass
public class Biography3 extends TextBook3{
    String about;

    public String getAbout() {
        return this.about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Biography3(){
        super();
        about="";
    }

    public Biography3(String title, int year, Double price, String subject, String about) {
        super(title, year, price, subject);
        this.about = about;

    }

    public void print () {
        super.print();
        System.out.println("Tentang : " + about);
    }

}
