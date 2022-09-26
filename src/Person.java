public class Person {
    private String name;
    private String surname;
    private int age;
    //private String[] surnameSize;

    // создайте конструктор на все поля
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // создайте геттеры и сеттеры
    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    int getAge() {
        return age;
    }

    public int compareTo(Person p) {
        return surname.length() - p.getSurname().length();
    }

    // создайте toString
    @Override
    public String toString() {
        return name + " " + surname + " " + age;
    }

}