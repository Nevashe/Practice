package homework2.task2;

import java.util.ArrayList;
import java.util.List;

public class MainTask2 {
    /*
    * 2. Реализовать основные методы ArrayList.
    * Я ввел следующие методы:
    * add(),  clear(), contains(), get(),
    * indexOf(), remove(), set() и size().
    */

    public static void main(String[] args) {
        ListArray<Integer> li = new ListArray<>();
        li.add(5);
        li.add(5);
        System.out.println(li);
        System.out.println(li.getCapacity());
        System.out.println(li.size());
        li.addOnIndex(3,3);
        li.add(5);
        li.add(5);
        li.add(5);
        li.add(5);
        System.out.println(li.getCapacity());
        System.out.println(li.size());
        System.out.println(li);

        li.remove(3);
        System.out.println(li);
        li.remove(3);
        li.remove(3);

        System.out.println(li.getCapacity());
        System.out.println(li.size());
        li.clear();
        System.out.println(li);

    }
}
