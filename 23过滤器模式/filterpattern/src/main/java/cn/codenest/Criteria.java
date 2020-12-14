package cn.codenest;

import java.util.List;

/**
 * <h3>designpatternts</h3>
 * <p></p>
 *
 * @author : Hyman
 * @date : 2020-12-14 08:59
 **/
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
