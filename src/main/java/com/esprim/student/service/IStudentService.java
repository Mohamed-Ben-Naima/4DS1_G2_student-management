package com.esprim.student.service;

import com.esprim.student.entity.Student;

public interface IStudentService {

    Student getStudentByEmail(String email);
}
