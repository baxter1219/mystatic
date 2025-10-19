package a06abstractdemo1;

public class Dog extends animal implements Swim  {

    public Dog(String name, int age) {
        super(name, age);
    }

    public void lookHome() {
        System.out.println("π∑ø¥º“");
    }

    @Override
    public void eat() {
        System.out.println("≥‘π«Õ∑");
    }

    @Override
    public void swim() {
        System.out.println("π∑≈Ÿ");
    }
}
