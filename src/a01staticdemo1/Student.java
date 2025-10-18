package a01staticdemo1;

public class Student {
    private String name;
    private int age;
    private String gender;
    public static String teacher;//static 用来修饰公共的量，随着类的加载而直接加载到内存的堆中
    // 静态方法中是没有的this关键字的
    /*
     * 
     */

    public Student() {
        // 空参构造
    }

    public Student(String name, int age, String gender) {// 全参构造
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGerder(String gender) {
        this.gender = gender;
    }

    public void study() {
        System.out.println(this.name + "正在学习");
    }

    public void show() {
        System.out.printf("姓名：%s, 年龄: %d, 性别: %s", this.name, this.age, this.gender);
    }

}
