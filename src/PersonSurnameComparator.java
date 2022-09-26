import java.util.Comparator;

public class PersonSurnameComparator implements Comparator<Person> {

    private int wordSurname;

    public PersonSurnameComparator(int wordSurname) {
        this.wordSurname = wordSurname;
    }

    @Override
    public int compare(Person a, Person b) {
        int surname1 = a.getSurname().split("\\P{IsAlphabetic}+").length;
        int surname2 = b.getSurname().split("\\P{IsAlphabetic}+").length;

        if ((surname1 >= wordSurname) != (surname2 >= wordSurname)) {
            return Integer.compare(surname1, surname2);
        } else {
            return Integer.compare(a.getAge(), b.getAge());
        }
    }
}
