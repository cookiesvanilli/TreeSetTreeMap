import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Olga", "Ivanova Sinicina", 25));
        people.add(new Person("Petr", "Sidorov Petrov", 35));
        people.add(new Person("Alex", "Rokossovsky", 18));
        people.add(new Person("Lena", "Lisicina", 12));
        people.add(new Person("Maria", "Gorohova", 22));
        people.add(new Person("Edwin", "van der Sar", 15));
        System.out.println(people);

        people.removeIf(person -> person.getAge() < 18);

        for (Person person : people) {
            System.out.println(person.getSurname() + " " + person.getAge());
        }
    }
}
