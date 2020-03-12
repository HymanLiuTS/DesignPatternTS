package cn.codenest;


/**
 * @author Hyman
 * @version 1.0
 * @created 12-3月-2020 19:21:29
 */
public class Duck {

	FlyBehavior flyBehavior = null;
	QuackBehavior quackBehavior = null;

	public void display(){
		System.out.println("I am a duck.");
	}

	public void performFly(){
		this.flyBehavior.fly();
	}

	public void performQuack(){
		this.quackBehavior.quack();
	}

	public void swim(){
		System.out.println("I can swim.");
	}

	public void setFlyBehavior(FlyBehavior flyBehavior){
		this.flyBehavior=flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior){
		this.quackBehavior=quackBehavior;
	}

}