package Option2_with_generic;
import java.time.LocalDate;

public class Student extends User implements Comparable<Student> {
    private Long studentId;

    public Student(String secondName, String firstName, String patronymic, LocalDate dateOfBirth, Long studentId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.studentId = studentId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Students " + studentId + " " + super.toString();
    }

    @Override
    public int compareTo(Student o) {

        return this.studentId.compareTo(o.studentId);
    }

}
