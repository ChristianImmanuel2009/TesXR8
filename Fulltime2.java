//subclass
public class Fulltime2 extends Teacher2{
    int anualSalary;
    String unit;

    public int getAnualSalary() {
        return this.anualSalary;
    }

    public void setAnualSalary(int anualSalary) {
        this.anualSalary = anualSalary;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Fulltime2(){
        super();
        anualSalary=0;
        unit="";
    }

    public Fulltime2(String name, int age, String subject, int anualSalary, String unit) {
        super(name, age, subject);
        this.anualSalary = anualSalary;
        this.unit = unit;
    }

    public void print () {
        super.print();
        System.out.println("AnualSalary : " + anualSalary);
        System.out.println("Unit : " + unit);
    }

}
