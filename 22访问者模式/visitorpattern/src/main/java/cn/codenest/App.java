package cn.codenest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
