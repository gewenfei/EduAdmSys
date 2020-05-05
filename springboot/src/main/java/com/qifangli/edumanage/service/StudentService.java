package com.qifangli.edumanage.service;

import com.qifangli.edumanage.dao.entity.Student;
import com.qifangli.edumanage.dao.entity.StudentScore;

import java.util.List;

public interface StudentService {

    Student findStudentByIdAndPwd(String id, String pass);

    List<StudentScore> findScoreByTermAndStuId(String term, String id);

    Student findStudentById(String id);

}
