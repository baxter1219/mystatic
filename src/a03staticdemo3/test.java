package a03staticdemo3;

public class test {
    public static void main(String[] args) {
        Student s1 = new Student();
        teacher t1 = new teacher();
        s1.setAge(18);
        s1.setName("学生");
        t1.setName("老师");
        t1.setAge(20);
        register(t1);
        register(s1);
    }

    public static void register(Person p) {
        p.show();
    }
}
