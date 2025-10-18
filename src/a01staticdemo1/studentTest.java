package a01staticdemo1;

public class studentTest {
    public static void main(String[] args) {
        Student.teacher = "告五人";
        // Student s1 = new Student("张三", 18, "男");
        // Student s2 = new Student("李四", 18, "男");
        System.out.println(Student.teacher);
    }
}
