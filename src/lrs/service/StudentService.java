package lrs.service;

import lrs.dao.StudentMapper;
import lrs.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentService {
    @Autowired
    StudentMapper studentMapper;

    public Student queryStudent(Integer id){
       return studentMapper.queryStudentById(id);
    }
}
