package Option2_with_generic;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Student oneStudent = new Student("Шаров", "Иван", "Иванович", LocalDate.of(1996, 2, 22), 1L);
        Student twoStudent = new Student("Серов", "Сергей", "Семёнович", LocalDate.of(2000, 1, 10), 2L);
        Student threeStudent = new Student("Иванов", "Виталий", "Сергеевич", LocalDate.of(1990, 8, 6), 5L);
        StudyGroup students = new StudyGroup<>(Arrays.asList(oneStudent, twoStudent, threeStudent));

        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next().toString());
        }
        System.out.println("..........................................");

        System.out.println(students.getUserList().stream().sorted(new UserComparator()).collect(Collectors.toList()));

        System.out.println("..........................................");

        Teacher oneTeacher = new Teacher("Язов", "Григорий", "Сергеевич", LocalDate.of(1969, 6, 16), 1L);
        Teacher twoTeacher = new Teacher("Берман", "Татьяна", "Николаевна", LocalDate.of(1980, 5, 10), 2L);
        Teacher threeTeacher = new Teacher("Ситников", "Николай", "Михайлович", LocalDate.of(1988, 1, 1), 3L);
        StudyGroup teachers = new StudyGroup<>(Arrays.asList(oneTeacher, twoTeacher, threeTeacher));

        Iterator<Teacher> teacherIterator = teachers.iterator();
        while (teacherIterator.hasNext()) {
            System.out.println(teacherIterator.next().toString());
        }
        System.out.println("..........................................");

        System.out.println(teachers.getUserList().stream().sorted(new UserComparator()).collect(Collectors.toList()));

    }

}
