package homework2.task1;

public class MainTask1 {
    /*
    * 1. Реализовать основные методы связанного списка.
    * Я ввел следующие методы:
    * add() +first/last,  clear(), contains(), get() +first/last,
    * indexOf(), remove() +first/last, set() и size().
    */
    public static void main(String[] args) {
        ListLinked<Integer> li = new ListLinked<>();
        li.addFirst(5);
        li.addFirst(6);
        li.addFirst(9);
        System.out.println(li);
        System.out.println(li.size());
        System.out.println(li.contains(9));
        System.out.println(li.contains(7));
        System.out.println(li.indexOf(6));
        li.add(1, 3);
        System.out.println(li);
        li.set(2 ,8);
        System.out.println(li);
        li.addFirst(1);
        System.out.println(li);
        li.removeFirst();
        System.out.println(li);
        li.removeLast();
        System.out.println(li);
        li.remove(1);
        System.out.println(li);
        li.clear();
        System.out.println(li);
    }
}
