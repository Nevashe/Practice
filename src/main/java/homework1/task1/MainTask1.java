package homework1.task1;


import homework1.task1.models.Person;

public class MainTask1 {
    public static void main(String[] args) {
        /*
        * 1. Создать builder для класса Person со следующими полями:
        * String firstName, String lastName,
        * String middleName, String country,
        * String address, String phone,
        * int age, String gender.
        */

        Person person = Person.builder()
                .address("address")
                .age(25)
                .country("Russia")
                .firstName("Aleksey")
                .build();
        System.out.println(person);


    }
}
