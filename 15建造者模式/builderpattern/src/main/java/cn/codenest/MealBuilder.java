package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/7 11:20
 * @description：
 * @modified By：
 * @version: $
 */
public class MealBuilder {

    Burger burger;
    ColdDrink coldDrink;

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    public MealBuilder burger(Burger burger) {
        this.burger = burger;
        return this;
    }

    public MealBuilder coldDrink(ColdDrink coldDrink) {
        this.coldDrink = coldDrink;
        return this;
    }

    public Meal build() {
        Meal meal = new Meal();
        meal.addItem(burger);
        meal.addItem(coldDrink);
        return meal;
    }

}
