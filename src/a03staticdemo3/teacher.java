package a03staticdemo3;

public class teacher extends Person {
    @Override
    public void show() {
        System.out.println("老师的信息是：" + getName() + getAge());
    }
}
