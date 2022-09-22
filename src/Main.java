import java.util.*;

public class Main {
    public static void main(String[] args) {
        Comparator<Person> pcomp = new PersonSurnameComparator(11);
        TreeSet<Person> people = new TreeSet(pcomp);
        people.add(new Person("Olga", "Ivanova", 25));
        people.add(new Person("Petr", "Sidorov", 35));
        people.add(new Person("Alex", "Rokossovsky", 18));
        people.add(new Person("Lena", "Lisicina", 12));
        people.add(new Person("Maria", "Gorohova", 22));
        people.add(new Person("Max", "Novikov", 15));
        System.out.println(people);

        for (Person p : people) {
            System.out.println(p.getSurname() + " " + p.getAge());
        }


    }
}
