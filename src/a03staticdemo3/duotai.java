package a03staticdemo3;

public class duotai {
    /*
     * 没有继承就没有多态
     * 多态：拥有共同的父类
     * 多态的表现形式：父类类型 对象名称 = new 子类对象
     * 前提：有继承关系，有父类引用指向子类对象 fu f = new zi();
     * 
     * 
     * 多态调用成员的特点
     * 变量调用：编译看左边，运行也看左边
     * 方法调用：编译看左边，运行看右边
     * 
     * 
     * 多态的缺点：
     * 无法使用子类特有的功能
     * 需要定义的类转换成指定的子类，不能随便转换
     * 例如
     * Person p = new Student();
     * Student p = (Student) p;这种但是不能是 teacher p = (teacher) p
     * 
     * instanceof:用于判断某一个对象是不是某一类
     * 使用  a(名字) ubstabceof Person(类名)，用于判断是不是属于某个类
     * 
     * jdk14
     * if (p instanceof student s)//先判断这个p是不是person这个类，如果是的话直接发生强制转换，并将名称设为s
     * 如果不是，则直接判断为false   需要有继承关系
     */
}
