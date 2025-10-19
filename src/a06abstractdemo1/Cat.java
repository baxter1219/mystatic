package a06abstractdemo1;

public class Cat extends animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("≥‘¿œ Û");
    }
}
