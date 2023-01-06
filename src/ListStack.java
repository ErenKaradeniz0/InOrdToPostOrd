import java.util.ArrayList;
import java.util.List;

public class ListStack<Type> implements Stack<Type> {
    List<Type> list;
    public ListStack(){
        list =new ArrayList<>();
    }
    public boolean isEmpty() { return list.isEmpty(); }
    public void push(Type item) { list.add(0, item); }
    public Type pop() { return list.remove(0); }
    public Type top() { return list.get(0); }
}
