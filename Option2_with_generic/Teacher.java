package Option2_with_generic;
import java.time.LocalDate;

public class Teacher extends User implements Comparable<Teacher> {
    private Long teacherId;

    public Teacher(String secondName, String firstName, String patronymic, LocalDate dateOfBirth, Long teacherId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.teacherId = teacherId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher " + teacherId + " " + super.toString();
    }

    @Override
    public int compareTo(Teacher o) {
        return Long.compare(this.teacherId, o.getTeacherId());
    }

}
