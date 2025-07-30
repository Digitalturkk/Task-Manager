package TaskManager.TM.Services.StudentServices;

import TaskManager.TM.Models.Student;
import TaskManager.TM.Repos.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentImplement implements StudentService {

    @Autowired
    StudentRepo studentRepo;


    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Student getStudentById(Long studentId) {
        return studentRepo.findById(studentId).get();
    }
    @Override
    public void addStudent(Student student) {
        studentRepo.save(student);
    }

    @Override
    public void deleteStudent(Long studentId) {
        studentRepo.deleteById(studentId);
    }

    @Override
    public void activateStudent(Long studentId) {
        Student deactivatedStudent = getStudentById(studentId);
        deactivatedStudent.setStudentActive(true);
        studentRepo.save(deactivatedStudent);
    }

    @Override
    public void deactivateStudent(Long studentId) {
        Student activatedStudent = getStudentById(studentId);
        activatedStudent.setStudentActive(false);
        studentRepo.save(activatedStudent);
    }

    @Override
    public void payStudent(Long studentId) {
        Student student = getStudentById(studentId);
        student.setHasStudentPayed(true);
        studentRepo.save(student);
    }

    @Override
    public void unpayStudent(Long studentId) {
        Student student = getStudentById(studentId);
        student.setHasStudentPayed(false);
        studentRepo.save(student);
    }

}
