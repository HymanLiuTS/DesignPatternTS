package cn.codenest;

import cn.codenest.sort.Duck;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Coffee coffee=new Coffee();
        coffee.prepareRecipe();
        Tea tea=new Tea();
        tea.prepareRecipe();

        Duck[] ducks={
                new Duck("Daffy",8),
                new Duck("Dewey",2),
                new Duck("Howard",7),
                new Duck("Louie",2),
                new Duck("Huey",10)
        };
        System.out.println("Before sorting:");
        display(ducks);
        Arrays.sort(ducks);
        display(ducks);
        System.out.println( "Hello World!" );
    }

    public static void display(Duck[] ducks){
        for(int i=0;i<ducks.length;i++){
            System.out.println(ducks[i]);
        }
    }
}
