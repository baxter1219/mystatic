package a04;

public class Person {
    private String name;
    private int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

// @formatter:off
    public void keepPet(animal a1, String something) {
        
        if (a1 instanceof Dog d) {
            System.out.println("年龄为" + this.age + "岁的"  + this.name + "养了一只"+ d.getColor() + "岁的" + d.getAge() + "的狗");
            System.out.println(d.getAge() + "岁的" +  d.getColor() + "狗正在吃" + something);
            d.lookHome();
        } else if (a1 instanceof Cat c) {
            System.out.println("年龄为" + this.age + "岁的"  + this.name + "养了一只"+ c.getColor() + "岁的" + c.getAge() + "的猫");
            System.out.println(c.getAge() + "岁的" +  c.getColor() + "猫正在吃" + something);
            c.catchMouse();
        }
    }
    // @formatter:o
}
