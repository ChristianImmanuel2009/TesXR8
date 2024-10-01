//subclass
public class PartTime2 extends Teacher2 {

    int hoursworked;

    public int getHoursworked() {
        return this.hoursworked;
    }

    public void setHoursworked(int hoursworked) {
        this.hoursworked = hoursworked;
    }

    public int setSalary() {
        int salary = hoursworked * 4 * 20000;
        return salary;
    }

    public PartTime2() {
        super();
        hoursworked = 0;
    }

    public PartTime2(String name, int age, String subject, int hoursworked) {
        super(name, age, subject);
        this.hoursworked = hoursworked;
    }

    public void print() {
        super.print();
        System.out.println("Kerja Perjam : " + hoursworked);
    }

}
