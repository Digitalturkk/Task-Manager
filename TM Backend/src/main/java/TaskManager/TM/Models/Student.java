package TaskManager.TM.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String studentName;
    private String studentPhone;
    private Double studentPayment;
    private Boolean hasStudentPayed;
    private Boolean isStudentActive;

    public Student(Long studentId, String studentName, String studentPhone, Double studentPayment, Boolean hasStudentPayed, Boolean isStudentActive) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.studentPayment = studentPayment;
        this.hasStudentPayed = hasStudentPayed;
        this.isStudentActive = isStudentActive;
    }

    public Student() {
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public Double getStudentPayment() {
        return studentPayment;
    }

    public void setStudentPayment(Double studentPayment) {
        this.studentPayment = studentPayment;
    }

    public Boolean getHasStudentPayed() {
        return hasStudentPayed;
    }

    public void setHasStudentPayed(Boolean hasStudentPayed) {
        this.hasStudentPayed = hasStudentPayed;
    }

    public Boolean getStudentActive() {
        return isStudentActive;
    }

    public void setStudentActive(Boolean studentActive) {
        isStudentActive = studentActive;
    }
}
