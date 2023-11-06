public class Student {
    private String name;
    private int age;

    public Student() {
        name = "Undefined";
        age = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString(){
        return "Student[name= "+name+", age="+age+"]";
    }

    public static void main(String[] args) {
        Student s = new Student();

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());

        s.setName("Showrav");
        s.setAge(21);
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println(s.toString());
    }
}
