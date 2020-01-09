package cn.codenest.pizza;

import cn.codenest.pizza.store.ChicagoStylePizzaStore;
import cn.codenest.pizza.store.NYPizzaStore;
import cn.codenest.pizza.store.PizzaStore;

/**
 * <h3>designpatternts</h3>
 * <p>测试类</p>
 *
 * @author : hyman
 * @date : 2020-01-09 11:29
 **/
public class App {

    public static void main(String[] args) {
        PizzaStore store=new NYPizzaStore();
        store.orderPizza("cheese");

        store=new ChicagoStylePizzaStore();
        store.orderPizza("cheese");
    }
}
