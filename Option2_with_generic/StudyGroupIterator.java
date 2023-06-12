package Option2_with_generic;
import java.util.Iterator;
import java.util.List;

public class StudyGroupIterator<T extends User> implements Iterator<T> {
    private int counter;
    private final List<T> users;

    public StudyGroupIterator(StudyGroup studyGroup) {
        this.users = studyGroup.getUserList();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < users.size();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new RuntimeException("Users");
        }
        return users.get(counter++);
    }

}
