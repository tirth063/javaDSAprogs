import java.util.*;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }*/

    public static String getName(Person p) {
        return p.name;
    }

    public static int getAge(Person p) {
        return p.age;
    }
}

public class Main {
    public static void main(String[] args) {
        HashSet<Person> persons = new HashSet<>();

        Person p1 = new Person("Alice", 30);
        Person p2 = new Person("Bob", 25);
        Person p3 = new Person("Alice", 30); // Duplicate based on equals() and hashCode()

        TreeSet<Person> persons2 = new TreeSet<>(Comparator.comparing(Person::getName).thenComparing(Person::getAge));

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        System.out.println("Size is " + persons.size());
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
