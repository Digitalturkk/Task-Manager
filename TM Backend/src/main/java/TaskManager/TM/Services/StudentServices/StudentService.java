package TaskManager.TM.Services.StudentServices;

import TaskManager.TM.Models.Student;

import java.util.List;

public interface StudentService {
    void addStudent(Student student);

    void deleteStudent(Long studentId);

    void activateStudent(Long studentId);

    void deactivateStudent(Long studentId);

    void payStudent(Long studentId);

    void unpayStudent(Long studentId);

    List<Student> getAllStudents();

    Student getStudentById(Long studentId);
}
