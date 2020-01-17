# 常见的设计模式
## 1、工厂模式
![#f03c15](https://placehold.it/15/f03c15/000000?text=+) 简单工厂模式<br>
![avatar](http://123.207.107.215/images/designpattern/simplefactory.jpg)<br>
* 说明：<br>
（1）工厂中只有一个对象创建的方法，根据传入的参数确认创建什么样的对象。<br><br>
![#f03c15](https://placehold.it/15/f03c15/000000?text=+) 多工厂方法模式<br>
![avatar](http://123.207.107.215/images/designpattern/multifactory.jpg)<br>
* 说明：<br>
（1）工厂中针对每个产品都定义一种生产方法。<br><br>
![#f03c15](https://placehold.it/15/f03c15/000000?text=+) 静态工厂模式<br>
![avatar](http://123.207.107.215/images/designpattern/staticfactory.jpg)<br>
* 说明：<br>
（1）工厂声明成静态，通过类进行调用。该种方式在使用时比较方便，不好的地方在于无法使用子类进行继承。<br><br>
![#f03c15](https://placehold.it/15/f03c15/000000?text=+) 抽象工厂模式<br>
![avatar](http://123.207.107.215/images/designpattern/abstractfactory.jpg)<br>
* 说明：<br>
（1）工厂为抽象接口，各自实现不同对象的工厂，装配工厂时只需装配抽象接口，符合针对接口而非针对具体类编程的原则。<br><br>
## 2、单例模式
![#f03c15](https://placehold.it/15/f03c15/000000?text=+) 普通单例模式<br>
```java
public class Singleton1 {

    private Singleton1() {
    }

    private static Singleton1 uniqueInstance;

    public static Singleton1 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton1();
        }
        return uniqueInstance;
    }

}
```
* 说明：<br>
（1）普通的单例模式类，在多线程时可能出现创建两个对象的情况。<br><br>
![#f03c15](https://placehold.it/15/f03c15/000000?text=+) 加锁的单例模式<br>
```java
public class Singleton2 {

    private Singleton2() {
    }

    private static Singleton2 uniqueInstance;

    public static synchronized Singleton2 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton2();
        }
        return uniqueInstance;
    }

}
```
* 说明：<br>
（1）使用synchronized关键字解决了多线程下同步的问题，但是只有在第一次创建对象时同步才有用，后面每次使用同步变成了累赘。<br><br>

![#f03c15](https://placehold.it/15/f03c15/000000?text=+) 勤加载单例模式<br>
```java
public class Singleton3 {

    private Singleton3() {
    }

    private static Singleton3 uniqueInstance = new Singleton3();

    public static synchronized Singleton3 getInstance() {
        return uniqueInstance;
    }

}
```
* 说明：<br>
（1）在静态初始化器中创建但见，保证了线程安全，但不是使用时才创建。<br><br>

![#f03c15](https://placehold.it/15/f03c15/000000?text=+) 双重检查加锁单例模式<br>
```java
public class Singleton4 {

    private Singleton4() {
    }

    private static volatile Singleton4 uniqueInstance;

    public static synchronized Singleton4 getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton4.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton4();
                }
            }
        }
        return uniqueInstance;
    }

}
```
* 说明：<br>
（1）双重检查加锁，首先检查实例是否创建，如果未创建才进行同步，只有第一次会同步而且符合使用时才创建的原则。<br><br>
