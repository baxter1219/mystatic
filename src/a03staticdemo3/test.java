package a03staticdemo3;

public class test {
    public static void main(String[] args) {
        Student s1 = new Student();
        teacher t1 = new teacher();
        s1.setAge(18);
        s1.setName("ѧ��");
        t1.setName("��ʦ");
        t1.setAge(20);
        register(t1);
        register(s1);
    }

    public static void register(Person p) {
        p.show();
    }
}
