
/**
 * 接口的使用
 * 1.接口使用interface来定义
 * 2.Java中，接口和类是并列的两个结构
 * 3.如何定义接口：定义接口中的成员
 * 
 * 3.1 JDK7以前，只能定义全局常量和抽象方法
 * >全局常量:public static final 的//书写时可以省略不写
 * >抽象方法:public abstract的
 * 
 * 3.2 JDK8：除了定义全局常量和抽象方法之外，还可以定义静态方法、默认方法（略）
 * 
 * 4.接口中不能定义构造器！意味着接口不可以实例化
 * 
 * 5.Java开发中，接口通过让类去实现(implements)的方式类使用
 * 如果实现类覆盖了接口中所有抽象方法，则此实现类就可以实例化
 * 如果实现类没有覆盖接口中所有的抽象方法，则此实现类仍为一个抽象类
 * 
 * 6.Java类可以实现多个接口 --->弥补了Java单继承性的局限性
 * 格式：class AA extends BB implements CC,DD,EE
 * 
 * 7.接口与接口之间可以继承，而且可以多继承
 * 
 * ********************************************************************
 * 8.接口的具体使用，体现多态性
 * 9.接口，实际上可以看做是一种规范
 */

public class InterfaceTest {
    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.stop();
        plane.fly();
    }
}

interface Flyable {

    // 全局常量
    public static final int MAX_SPEED = 7900;

    int MIN_SPEED = 1;

    // 抽象方法
    public abstract void fly();

    // 省略了public abstract
    void stop();

    /*
     * 接口无法定义构造器
     * public Flyable(){}
     */
}

interface Attackable {
    void attack();
}

class Plane implements Flyable {

    @Override
    public void fly() {
        System.out.println("通过引擎飞");
    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速停飞");
    }

}

abstract class AA implements Flyable {

    @Override
    public void fly() {
    }

    // 如果没有全部的重写，就可以变成抽象性的
    public abstract void stop();

}

// 即继承了，也实现了接口
class Bullet extends Object implements Flyable, Attackable, DD {

    @Override
    public void attack() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }

    // 因为实现了DD,而DD继承了BB,CC
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

}

interface BB {
    void method1();
}

interface CC {
    void method2();
}

// 接口可以进行多继承
interface DD extends BB, CC {
    void method3();
}