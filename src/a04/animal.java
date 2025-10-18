package a04;

public class animal {
    private int age;
    private String color;

    public animal() {
    }

    public animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat(String something) {
        System.out.println("ÕýÔÚ³Ô" + something);
    }
}
