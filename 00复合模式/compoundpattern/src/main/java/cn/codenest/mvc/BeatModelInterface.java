package cn.codenest.mvc;

/**
 * <h3>designpatternts</h3>
 * <p></p>
 *
 * @author : hyman
 * @date : 2020-05-06 19:40
 **/
public interface BeatModelInterface {

    void initialize();

    void on();

    void off();

    void setBPM(int BPM);

    int getBPM();

    void registerObserver(BeatObserver o);

    void removeOberver(BeatObserver o);

    void registerObserver(BPMObserver o);

    void removeOberver(BPMObserver o);

}
