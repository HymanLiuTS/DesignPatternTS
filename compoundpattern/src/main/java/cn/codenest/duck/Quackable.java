package cn.codenest.duck;


import cn.codenest.observ.observable.QuackObservable;

/**
 * @author Hyman
 * @version 1.0
 * @created 07-4月-2020 19:17:04
 */
public interface Quackable extends QuackObservable {
	public void quack();
}