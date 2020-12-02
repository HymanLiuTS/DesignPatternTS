package cn.codenest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Throwable {
        MenuComponent pkMenu=new Menu("PANCAKE HOUSE MENU","Breakfast",1.2);
        MenuComponent dinerMenu=new Menu("DING MENU","lUNCH",2.3);
        MenuComponent cafeMenu=new Menu("cafe MENU","dinner",3.4);
        MenuComponent sessertMenu=new Menu("DESSERT MENU","DESSERT OD COURSE",4.5);

        MenuComponent allMenus=new Menu("All Menus","All menus combined",7.8);

        allMenus.addComponent(pkMenu);
        allMenus.addComponent(dinerMenu);
        allMenus.addComponent(cafeMenu);

        dinerMenu.addComponent(new MenuItem("Pasta"," bread",3.69));
        dinerMenu.addComponent(new MenuItem("Apple price"," ice cream",1.059) );


        Waittress waittress=new Waittress(allMenus);
        waittress.printMenu();
        waittress.printMenuPlus();
    }
}
