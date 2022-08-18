package homework2.task2;


public class ListArray<T>{
    private Object[] o;
    private final static int CAPACITY = 16;

    public int getCapacity() {
        return capacity;
    }

    private int capacity = CAPACITY;
    private int size = 0;

    public ListArray() {
        this.o = new Object[capacity];
    }

    public void addOnIndex(int index, T t){
        checkIndexMassive(index);
        checkCapacity();
        for (int i = size; i > index + 1; i--) {
            o[i] = o[size - 1];
        }
        o[index] = t;
        size++;
    }

    public void add(T t){
        checkCapacity();
        o[size] = t;
        size++;
    }

    public void clear(){
        capacity = CAPACITY;
        o = new Object[capacity];
        size = 0;
    }

    public boolean contains(T t){
        for (Object value : o) {
            if (value.equals(t)) {
                return true;
            }
        }
    return false;
    }

    public T get(int index){
        return (T) o[index];
    }

    public int indexOf(T t){
        for (int i = 0; i < o.length; i++) {
            if(o[i].equals(t)){
                return i;
            }
        }
        return -1;
    }

    public void remove(int index){
        checkIndexMassive(index);
        checkCapacity();
        for (int i = index; i < size; i++) {
            o[i] = o[i+1];
        }
        size--;
    }

    public void set(int index, T t){
        checkIndexMassive(index);
        o[index] = t;
    }

    public int size(){
        return size;
    }

    private void checkCapacity(){
        if(size >= capacity/1.5){
            capacity = (int)(1.5 * capacity);
            Object[] oldO = o;
            o = new Object[capacity];
            for (int i = 0; i < size; i++) {
                o[i] = oldO[i];
            }
        }
        if(size <= capacity/3){
            capacity = capacity/2;
            Object[] oldO = o;
            o = new Object[capacity];
            for (int i = 0; i < size; i++) {
                o[i] = oldO[i];
            }
        }
    }

    private void checkIndexMassive(int index){
        if(size<index){
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        String s = "{\n";
        for (int i = 0; i < size; i++) {
            s += o[i];
            if(i+1 != size){
                s += ", ";
            }
        }
        s += "\n}";
        return s;
    }
}
