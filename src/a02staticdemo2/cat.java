package a02staticdemo2;

public class cat extends animal {
    public void catchMouse() {
        System.out.println("我在抓老鼠");
    }

    public cat() {
        super();
    }

    public cat(String name, int age) {// 父类有无参构造的前提下，子类才能参数构造
        // 父类没有无参构造时，子类任何构造器都必须在第一行手动 super(实参) 调用父类存在的构造器；否则编译直接失败。
        // this.name = name;//报错,无法直接访问父类的private,必须提升权限
        // this.age = age;
        /*
         * 父类有无参构造 ≠ 子类能直接访问父类的 private 字段。
         * 想写 this.name = name; 就把字段改成 protected，或者干脆用 super(name, age) 让父类负责初始化。
         */
        super(name, age);
        // System.out.print(name);
        // System.out.print(age);
    }

    public static void main(String[] args) {
        // cat c1 = new cat();
        cat c1 = new cat("猫", 10);
        c1.eat();
        c1.sleep();
        System.out.println(c1);
    }
}
