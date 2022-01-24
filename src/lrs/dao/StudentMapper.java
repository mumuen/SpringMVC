package lrs.dao;

import lrs.entity.Student;

public interface StudentMapper {
    Student queryStudentById(Integer id);
}
