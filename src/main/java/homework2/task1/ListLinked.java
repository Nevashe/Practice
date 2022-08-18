package homework2.task1;

public class ListLinked<T>{

    private int size;

    private Node<T> firstNode;

    private Node<T> lastNode;

    public ListLinked() {
        this.size = 0;
    }

    public void add(int index, T t){
        checkIndex(index);
        Node<T> nn = new Node<>(t);
        Node<T> prevIndexNode = firstNode;
        for (int i = 0; i < index-1; i++) {
            prevIndexNode = prevIndexNode.next();
        }
        Node<T> indexNode = prevIndexNode.next();
        prevIndexNode.newLinkNext(nn);
        indexNode.newLinkPrev(nn);
        nn.newLinkNext(indexNode);
        nn.newLinkPrev(prevIndexNode);
    }

    public void addFirst(T t){
        Node<T> nn = new Node<>(t);
        if(size > 1){
            nn.newLinkNext(firstNode);
            firstNode.newLinkPrev(nn);
            firstNode = nn;
            size++;
        }
        else if(size>0){
            nn.newLinkNext(firstNode);
            firstNode.newLinkPrev(nn);
            lastNode = firstNode;
            firstNode = nn;
            size++;
        } else {
            firstNode = nn;
            size++;
        }
    }

    public void addLast(T t){
        Node<T> nn = new Node<>(t);
        if(size > 1){
            nn.newLinkPrev(lastNode);
            lastNode.newLinkNext(nn);
            lastNode = nn;
            size++;
        }
        else if(size>0){
            nn.newLinkPrev(firstNode);
            firstNode.newLinkNext(nn);
            lastNode = nn;
            size++;
        } else {
            firstNode = nn;
            size++;
        }
    }

    public void clear(){
        firstNode = null;
        lastNode = null;
        size = 0;
    }

    public boolean contains(T t){
        return findNode(t)!=null;
    }

    public T get(int index){
        checkIndex(index);
        Node <T> n = firstNode;
        for (int i = 0; i < index-1; i++) {
            n = n.next();
        }
        return n.getElement();
    }

    public T getFirst(){
        if(firstNode!=null){
            return firstNode.getElement();
        }
        throw new NullPointerException();
    }

    public T getLast(){
        if(lastNode!=null){
            return lastNode.getElement();
        }
        throw new NullPointerException();
    }

    public int indexOf(T t){
        int index = 0;
        Node <T> n = firstNode;
        while (true){
            if(n.getElement().equals(t)){
                return index;
            }
            index++;
            if(!n.hasNext()){
                break;
            }
            n = n.next();
        }
        return -1;
    }

    public void remove(int index){

        Node<T> prevNode = firstNode;
        for (int i = 0; i < index-1; i++) {
            prevNode = prevNode.next();
        }
        Node<T> nextNode = prevNode.next().next();
        prevNode.newLinkNext(nextNode);
        nextNode.newLinkPrev(prevNode);
    }

    public void removeFirst(){
        if(size > 1){
            firstNode.next().newLinkPrev(null);
            firstNode = firstNode.next();
            if(firstNode.equals(lastNode)){
                lastNode = null;
            }
            size--;
        }
        else if(size>0){
            firstNode = null;
            size--;
        } else {
            throw new NullPointerException();
        }
    }

    public void removeLast(){
        Node<T> nn = lastNode;
        if(size > 1){
            lastNode.prev().newLinkNext(null);
            lastNode = lastNode.prev();
            size--;
        }
        else if(size>0){
            firstNode = null;
            size--;
        } else {
            throw new NullPointerException();
        }
    }

    public void set(int index, T t){
        checkIndex(index);
        Node<T> nn = new Node<>(t);
        Node<T> prevNode = firstNode;
        for (int i = 0; i < index-1; i++) {
            prevNode = prevNode.next();
        }
        Node<T> nextNode = prevNode.next().next();
        nn.newLinkNext(nextNode);
        nn.newLinkPrev(prevNode);
        prevNode.newLinkNext(nn);
        nextNode.newLinkPrev(nn);
    }

    public int size(){
        return size;
    }

    private Node<T> findNode(T t){
        Node <T> n = firstNode;
        while (true){
            if(n.getElement().equals(t)){
                return n;
            }
            if(!n.hasNext()){
                break;
            }
            n = n.next();
        }
        return null;
    }
    private void checkIndex(int index){
        if(size<=index){
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        String s = "{\n";
        Node<T> n = firstNode;
        if(firstNode!=null) {
            while (true) {
                s += n.getElement().toString();
                if (!n.hasNext()) {
                    break;
                }
                s += ", ";
                n = n.next();
            }
        }
        s += "\n}";
        return s;
    }
}
