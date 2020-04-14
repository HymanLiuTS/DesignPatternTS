package cn.codenest.factory;

import cn.codenest.duck.Quackable;

/**
 * <h3>designpatternts</h3>
 * <p></p>
 *
 * @author : 你的名字
 * @date : 2020-04-14 19:04
 **/
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallarduck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createRubberDuck();
    public abstract Quackable createDuckCall();
}
