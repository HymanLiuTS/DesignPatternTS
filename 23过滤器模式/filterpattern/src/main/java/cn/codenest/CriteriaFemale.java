package cn.codenest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/14 9:04
 * @description：
 * @modified By：
 * @version: $
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
