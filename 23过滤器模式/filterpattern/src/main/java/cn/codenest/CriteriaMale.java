package cn.codenest;

import java.util.List;
import java.util.ArrayList;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/14 9:00
 * @description：
 * @modified By：
 * @version: $
 */
public class CriteriaMale implements Criteria {


    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}