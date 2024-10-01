//superclass
public class Person2 {
    protected String name;
    protected int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person2 () {
        name ="";
        age=0;
    }
    public Person2 (String name, int age){
        this.name = name;
        this.age = age;
    }

    public void print (){
        System.out.println("Nama" + name);
        System.out.println("Umur" + age);
    }

}
