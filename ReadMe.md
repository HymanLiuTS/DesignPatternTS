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

* 使用工厂模式的好处：<br>
（1）将创建对象的方法集中的一个对象或者一个方法中，避免代码重复，方便以后维护。<br>
（2）工厂方法可以返回接口而非对象，利于针对接口编程。<br>

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

## 3、观察者模式
![avatar](http://123.207.107.215/images/designpattern/observer.jpg)<br>

* 说明：<br>
（1）被观察者WeatherData实现Subject接口，提供注册、删除观察者以及通知观察者的功能。<br>
（2）观察者CurrentConditionDisplay等实现Observer接口，直接关联被观察者（被观察者作为观察者的成员变量），通过被观察者对象将自身注册进被观察者的观察者列表中。<br>
（3）当被观察者的数据发生变化时，直接通过notifyObservers方法遍历通知每个注册的观察者。<br>
（4）在各自观察者的内部，实现数据变化时的业务逻辑。<br>

## 4、装饰者模式
![avatar](http://123.207.107.215/images/designpattern/decorator.jpg)<br>

* 说明：<br>
（1）装饰者和被装饰者对象具有相同的超类型。<br>
（2）可以用一个或者多个装饰者包装一个对象<br>
（3）在使用任何原始对象的地方都可以使用装饰过的对象来替代它。<br>
（4）对象可以在任何时候被装饰。所以可以在运行时动态的、不限量的用你喜欢的装饰者来装饰对象。<br>

## 5、命令模式
![avatar](http://123.207.107.215/images/designpattern/order.jpg)<br>

* 说明：<br>
（1）命令模式将发出请求的对象和执行请求的对象解耦。<br>
（2）在被解耦的两者之间是通过命令对象来沟通的，命令对象封装了接收者一个或者一组动作<br>
（3）调用者通过调用命令对象的execute()发出请求，这会使得接收者的命令被调用。<br>
（4）命令可以支持撤销，做法是实现一个undo()方法来回到execute()执行前的状态。<br>
（5）可以将一组命令再次封装成一个宏命令对象。<br>
（6）命令可以实现日志和事务系统。<br>

## 6、适配器模式
![avatar](http://123.207.107.215/images/designpattern/adapter.jpg)<br>
* 说明：<br>
（1）目标对象：MallardDuck，被适配对象：WildTurkey，适配器：TurkeyAdapter。<br>
（2）适配器解决的问题，要求WildTurkey具有MallardDuck的操作，使用TurkeyAdapter适配实现<br>

## 7、外观模式
![avatar](http://123.207.107.215/images/designpattern/classadapter.jpg)<br>
* 说明：<br>
（1）外观模式又叫做类适配器模式（普通的适配器可叫做对象适配器）。<br>
（2）外观模式的提出是为了简化接口，类适配器继承目标类，和多个被适配类，对外重新封装业务接口，避免了为了实现某一功能在业务代码中调用大量类的接口<br>
（3）外观模式将客户实现从任何子系统中解耦，在客户中业务需要发生变化时，只需要修改外观模式适配器的接口即可，无需修改客户实现代码<br>
（4）最少知识原则：减少对象之间的交互，就任何对象而言，在该对象的执行方法内，我们应该调用属于以下范围的方法：
+ 该对象本身
+ 被当做方法的参数而传递进来的对象
+ 此方法所创建的任何对象
+ 该对象的任何组件（类成员对象）

## 8、模板方法模式
![avatar](http://123.207.107.215/images/designpattern/templatemethodpattern.jpg)<br>
* 说明：<br>
（1）CaffeineBeverage为超类，规定了算法的骨架（其他方法的调用顺序），Coffee和Tea为子类，其不能参与算法骨架的定制，但是可以具体实现算法中某一步骤。<br>
（2）模板方法模式提供了一种代码复用的重要技巧，在模板方法的抽象类中可以定义具体方法、抽象方法和钩子。抽象方法由子类实现，钩子是一种方法，它在抽象类中不做事，或者只做默认的事，子类可以选择要不要去覆盖它。<br>
（3）为了防止子类改变模板方法中的算法，可以将模板方法声明为final<br>
（4）好莱坞原则：子类（低层组件）的算法逻辑中不应该调用超类（高层组件）的方法，只能超类（高层组件）调用子类（低层组件）的方法。目的是避免出现环形依赖：子类调用了超类的方法，而超类又调用了子类的方法，让人很难理解系统的设计。<br>

## 9、策略模式
![avatar](http://123.207.107.215/images/designpattern/stragepattern.jpg)<br>
* 说明：<br>
（1）策略模式：将类中某一操作进行抽象，该操作具体的实现算法由每一个抽象的实现定制。
（2）策略模式和模板方法模式的区别在于，前者将算法实现交给了每一个子类或者接口实现，而后者算法封装到了超类中，只是将算法中某几个步骤抽象出来，让子类去实现。
