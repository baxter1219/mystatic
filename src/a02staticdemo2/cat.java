package a02staticdemo2;

public class cat extends animal {
    public void catchMouse() {
        System.out.println("����ץ����");
    }

    public cat() {
        super();
    }

    public cat(String name, int age) {// �������޲ι����ǰ���£�������ܲ�������
        // ����û���޲ι���ʱ�������κι������������ڵ�һ���ֶ� super(ʵ��) ���ø�����ڵĹ��������������ֱ��ʧ�ܡ�
        // this.name = name;//����,�޷�ֱ�ӷ��ʸ����private,��������Ȩ��
        // this.age = age;
        /*
         * �������޲ι��� �� ������ֱ�ӷ��ʸ���� private �ֶΡ�
         * ��д this.name = name; �Ͱ��ֶθĳ� protected�����߸ɴ��� super(name, age) �ø��ฺ���ʼ����
         */
        super(name, age);
        // System.out.print(name);
        // System.out.print(age);
    }

    public static void main(String[] args) {
        // cat c1 = new cat();
        cat c1 = new cat("è", 10);
        c1.eat();
        c1.sleep();
        System.out.println(c1);
    }
}
