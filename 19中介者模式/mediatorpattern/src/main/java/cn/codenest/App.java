package cn.codenest;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ChatRoom cr = new ChatRoom();

        User robert = new User("Robert", cr);
        User john = new User("John", cr);

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");

    }
}
