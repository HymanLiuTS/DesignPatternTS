package cn.codenest.goose;

import cn.codenest.duck.Quackable;

/**
 * @author ：Hyman
 * @date ：Created in 2020/4/14 18:50
 * @description：
 * @modified By：
 * @version: $
 */
public class GooseAdapter implements Quackable {

    Goose goose;
    public GooseAdapter(Goose goose){
        this.goose=goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
