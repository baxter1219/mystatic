package a07;

public class Car {
    private String carName;
    private int age;
    private String carColor;

    /*
     * �ڲ�����ֱ�ӷ����ⲿ��
     * �ⲿ������ڲ��ࣺ���봴������
     */

    public Engine getEngine() {
        return new Engine();
    }// �ṩ������ȡ�ڲ���

    public class Engine {// public �����ڲ��࣬ʹ���ⲿ��ֱ��ʹ��
        private String engineName;
        private int engineAge;

        public void show() {
            System.out.println(Car.this.carName);
            System.out.println(engineName);
        }
    }
}
