package a02staticdemo2;

public class animal {
    private String name;
    private int age;

    public void eat() {
        System.out.println("我要吃饭");
    }

    public void sleep() {
        System.out.println("我要睡觉");
    }

    private void show() {
        System.out.println("姓名：" + this.name + "   年龄：" + this.age);
    }

    public animal() {

    }

    public animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        animal a1 = new animal("动物", 10);
        a1.eat();
        a1.sleep();
        a1.show();
    }
}
