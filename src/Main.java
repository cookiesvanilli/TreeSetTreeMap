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

        people.sort((a, b) -> {
            int surname1 = a.getSurname().split("\\P{IsAlphabetic}+").length;
            int surname2 = b.getSurname().split("\\P{IsAlphabetic}+").length;
            int words = 5;
            if (Math.min(surname1, words) != Math.max(surname2, words)) {
                return Integer.compare(surname1, surname2);
            } else {
                return Integer.compare(a.getAge(), b.getAge());
            }
        });
        for (Person person : people) {
            System.out.println(person.getSurname() + " " + person.getAge());
        }
    }
}
