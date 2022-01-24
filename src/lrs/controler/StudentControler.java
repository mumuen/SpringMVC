package lrs.controler;


import lrs.entity.Student;
import lrs.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("student")
public class StudentControler {
    @Autowired
    StudentService studentService;

    @RequestMapping("/queryStudent/{id}")
    public String queryStudent(@PathVariable("id") Integer id, Map<String,Object> map){

        Student student=studentService.queryStudent(id);
        map.put("student",student);

        return "success";
    }
}
