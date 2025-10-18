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
            System.out.println("����Ϊ" + this.age + "���"  + this.name + "����һֻ"+ d.getColor() + "���" + d.getAge() + "�Ĺ�");
            System.out.println(d.getAge() + "���" +  d.getColor() + "�����ڳ�" + something);
            d.lookHome();
        } else if (a1 instanceof Cat c) {
            System.out.println("����Ϊ" + this.age + "���"  + this.name + "����һֻ"+ c.getColor() + "���" + c.getAge() + "��è");
            System.out.println(c.getAge() + "���" +  c.getColor() + "è���ڳ�" + something);
            c.catchMouse();
        }
    }
    // @formatter:o
}
