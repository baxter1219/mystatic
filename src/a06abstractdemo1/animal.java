package a06abstractdemo1;

public abstract class animal {
    private int age;
    private String neme;

    public animal() {
    }

    public animal(String neme, int age) {
        this.age = age;
        this.neme = neme;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.neme;
    }

    public void setName(String neme) {
        this.neme = neme;
    }

    public abstract void eat();

}
