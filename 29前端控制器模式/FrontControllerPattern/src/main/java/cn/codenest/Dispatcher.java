package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/17 8:47
 * @description：
 * @modified By：
 * @version: $
 */
public class Dispatcher {

    private StudentView studentView;
    private HomeView homeView;
    public Dispatcher(){
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request){
        if(request.equalsIgnoreCase("STUDENT")){
            studentView.show();
        }else{
            homeView.show();
        }
    }
}
