package a07;

public class Car {
    private String carName;
    private int age;
    private String carColor;

    /*
     * 内部类能直接访问外部类
     * 外部类访问内部类：必须创建对象
     */

    public Engine getEngine() {
        return new Engine();
    }// 提供方法获取内部类

    public class Engine {// public 修饰内部类，使得外部能直接使用
        private String engineName;
        private int engineAge;

        public void show() {
            System.out.println(Car.this.carName);
            System.out.println(engineName);
        }
    }
}
