# 常见的设计模式
## 1、工厂模式
![#f03c15](https://placehold.it/15/f03c15/000000?text=+) 简单工厂模式<br>
![avatar](http://123.207.107.215/images/designpattern/simplefactory.jpg)<br>
* 特点：<br>
（1）工厂中只有一个对象创建的方法，根据传入的参数确认创建什么样的对象。<br><br>
![#f03c15](https://placehold.it/15/f03c15/000000?text=+) 多工厂方法模式<br>
![avatar](http://123.207.107.215/images/designpattern/multifactory.jpg)<br>
* 特点：<br>
（1）工厂中针对每个产品都定义一种生产方法。<br><br>
![#f03c15](https://placehold.it/15/f03c15/000000?text=+) 静态工厂模式<br>
![avatar](http://123.207.107.215/images/designpattern/staticfactory.jpg)<br>
* 特点：<br>
（1）工厂声明成静态，通过类进行调用。该种方式在使用时比较方便，不好的地方在于无法使用子类进行继承。<br><br>
![#f03c15](https://placehold.it/15/f03c15/000000?text=+) 抽象工厂模式<br>
![avatar](http://123.207.107.215/images/designpattern/abstractfactory.jpg)<br>
* 特点：<br>
（1）工厂未抽象接口，各自实现不同对象的工厂，装配工厂时只需装配抽闲接口，符合针对接口而非针对具体类编程的原则。<br><br>
