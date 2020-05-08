package cn.codenest.mvc;

import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import java.util.ArrayList;

/**
 * @author ：Hyman
 * @date ：Created in 2020/5/8 19:39
 * @description：
 * @modified By：
 * @version: $
 */
public class BeatModel implements BeatModelInterface, MetaEventListener {

    ArrayList beatObservers=new ArrayList();
    ArrayList bpmObservers=new ArrayList();

    @Override
    public void initialize() {

    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public void setBPM(int BPM) {

    }

    @Override
    public int getBPM() {
        return 0;
    }

    @Override
    public void registerObserver(BeatObserver o) {

    }

    @Override
    public void removeOberver(BeatObserver o) {

    }

    @Override
    public void registerObserver(BPMObserver o) {

    }

    @Override
    public void removeOberver(BPMObserver o) {

    }

    @Override
    public void meta(MetaMessage meta) {

    }
}
