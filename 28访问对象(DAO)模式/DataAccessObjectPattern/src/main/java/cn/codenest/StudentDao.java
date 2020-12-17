package cn.codenest;

import java.util.List;

/**
 * <h3>designpatternts</h3>
 * <p></p>
 *
 * @author : Hyman
 * @date : 2020-12-17 08:33
 **/
public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
