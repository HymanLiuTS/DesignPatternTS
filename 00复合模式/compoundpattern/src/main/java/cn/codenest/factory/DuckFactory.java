package cn.codenest.factory;

import cn.codenest.decorator.QuackCounter;
import cn.codenest.duck.*;

/**
 * @author ：Hyman
 * @date ：Created in 2020/4/14 19:06
 * @description：
 * @modified By：
 * @version: $
 */
public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallarduck() {
        return new QuackCounter(new Mallarduck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }
}
