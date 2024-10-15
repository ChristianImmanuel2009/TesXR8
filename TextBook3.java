//subclass <termasuk objectclass
public class TextBook3 extends Book3 {

    String subject;

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public TextBook3() {
        super();
        subject = "";
    }

    public TextBook3(String title, int year, Double price, String subject) {
        super(title, year, price);
        this.subject = subject;

    }

    public void print() {
        super.print();
        System.out.println("Subjek : " + subject);
    }

}
