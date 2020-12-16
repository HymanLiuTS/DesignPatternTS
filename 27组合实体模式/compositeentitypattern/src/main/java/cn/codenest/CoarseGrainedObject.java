package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/16 10:20
 * @description：
 * @modified By：
 * @version: $
 */
public class CoarseGrainedObject {
    DependentObject1 do1 = new DependentObject1();
    DependentObject2 do2 = new DependentObject2();

    public void setData(String data1, String data2){
        do1.setData(data1);
        do2.setData(data2);
    }

    public String[] getData(){
        return new String[] {do1.getData(),do2.getData()};
    }
}
