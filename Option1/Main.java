package Option1;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        StudentGroup students = new StudentGroup(List.of());
        students.setStudents(Arrays.asList(
                new Student("Иванов", "Иван", "Иванович", LocalDate.of(1996, 2, 22), 1L),
                new Student("Серов", "Сергей", "Семёнович", LocalDate.of(2000, 1, 10), 2L),
                new Student("Шаров", "Виталий", "Сергеевич", LocalDate.of(1990, 8, 6), 5L)));

        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next().toString());
        }
        System.out.println("..........................................");

        students.getStudents().sort(new StudentComparator());
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("..........................................");

        Teacher oneTeacher = new Teacher("Язов", "Григорий", "Сергеевич", LocalDate.of(1969, 6, 16), 1L);
        Teacher twoTeacher = new Teacher("Берман", "Татьяна", "Николаевна", LocalDate.of(1980, 5, 10), 2L);
        Teacher threeTeacher = new Teacher("Ситников", "Николай", "Михайлович", LocalDate.of(1988, 1, 1), 3L);
        TeacherGroup teachers = new TeacherGroup(Arrays.asList(oneTeacher, twoTeacher, threeTeacher));

        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
        System.out.println("..........................................");

        teachers.getTeacherList().sort(new TeacherComparator());
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }

    }
}
