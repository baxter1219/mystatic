package a01staticdemo1;

public class Student {
    private String name;
    private int age;
    private String gender;
    public static String teacher;//static �������ι���������������ļ��ض�ֱ�Ӽ��ص��ڴ�Ķ���
    // ��̬��������û�е�this�ؼ��ֵ�
    /*
     * 
     */

    public Student() {
        // �ղι���
    }

    public Student(String name, int age, String gender) {// ȫ�ι���
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
        System.out.println(this.name + "����ѧϰ");
    }

    public void show() {
        System.out.printf("������%s, ����: %d, �Ա�: %s", this.name, this.age, this.gender);
    }

}
