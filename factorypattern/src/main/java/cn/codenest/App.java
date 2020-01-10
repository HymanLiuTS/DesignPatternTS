package cn.codenest;

import cn.codenest.store.domain.ChicagoStylePizzaStore;
import cn.codenest.store.domain.NYPizzaStore;
import cn.codenest.store.domain.PizzaStore;

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
