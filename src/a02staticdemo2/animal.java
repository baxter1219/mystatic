package a02staticdemo2;

public class animal {
    private String name;
    private int age;

    public void eat() {
        System.out.println("��Ҫ�Է�");
    }

    public void sleep() {
        System.out.println("��Ҫ˯��");
    }

    private void show() {
        System.out.println("������" + this.name + "   ���䣺" + this.age);
    }

    public animal() {

    }

    public animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        animal a1 = new animal("����", 10);
        a1.eat();
        a1.sleep();
        a1.show();
    }
}
