//subclass
public class Teacher2 extends Person2{
    String subject;

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher2(){
        super();
        subject="";
    }

    public Teacher2(String name, int age, String subject) {
        super(name, age);
        this.subject= subject;

    }

    public void print () {
        super.print();
        System.out.println("Subjek : " + subject);
    }

}
