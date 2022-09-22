import java.util.Comparator;

public class PersonSurnameComparator implements Comparator<Person> {

    private int maxLetters;

    public PersonSurnameComparator(int maxLetters) {
        this.maxLetters = maxLetters;
    }

    @Override
    public int compare(Person a, Person b) {
        if (b.getSurname().length() == a.getSurname().length()) {
            return Integer.compare(b.getAge(), a.getAge());
        } else if (a.getSurname().length() > maxLetters || b.getSurname().length() > maxLetters) {
            return Integer.compare(a.size(), b.size());
        } else {
            return b.getSurname().length() - a.getSurname().length();
        }
    }
}
