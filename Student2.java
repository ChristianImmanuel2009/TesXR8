//subclass
public class Student2 extends Person2{
    int studentNumber;
    int score;
    String major;

    public int getStudentNumber() {
        return this.studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Student2(){
        super();
        studentNumber=0;
        score=0;
        major="";
    }

    public Student2(String name, int age, int studentNumber, int score, String major) {
        super(name, age);
        this.studentNumber = studentNumber;
        this.score = score;
        this.major = major;

    }

    public void print () {
        super.print();
        System.out.println("Nomor Siswa : " + studentNumber);
        System.out.println("Skor siswa : " + score);
        System.out.println("Major : " + major);
    }

}
