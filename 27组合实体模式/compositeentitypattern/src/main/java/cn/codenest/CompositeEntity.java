package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/16 10:21
 * @description：
 * @modified By：
 * @version: $
 */
public class CompositeEntity {

    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2){
        cgo.setData(data1, data2);
    }

    public String[] getData(){
        return cgo.getData();
    }
}
