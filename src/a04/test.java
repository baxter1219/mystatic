package a04;

public class test {
    public static void main(String[] args) {
        Person p1 = new Person("����", 30);
        Person p2 = new Person("����", 25);

        animal a1 = new Dog(2, "��ɫ");
        animal a2 = new Cat(3, "��ɫ");
        p1.keepPet(a1, "��ͷ");
        p2.keepPet(a2, "��");
    }
}
