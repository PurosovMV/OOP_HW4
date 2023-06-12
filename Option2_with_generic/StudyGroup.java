package Option2_with_generic;
import java.util.Iterator;
import java.util.List;

public class StudyGroup<T extends User> implements Iterable<T> {
    private List<T> userList;

    public StudyGroup(List<T> userList) {
        this.userList = userList;
    }

    public List<T> getUserList() {
        return userList;
    }

    public void setUserList(List<T> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "StudyGroup [user=" + userList + "]";
    }

    @Override
    public Iterator<T> iterator() {
        return new StudyGroupIterator<>(this);
    }

}