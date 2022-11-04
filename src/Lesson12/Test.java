package Lesson12;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();
        Set<Person> personSet = new TreeSet<>();

        addElements(peopleList);
        addElements(personSet);

        Collections.sort(peopleList);

        System.out.println(peopleList);
        System.out.println(personSet);

    }

    private static void addElements(Collection collection) {
        collection.add(new Person(4, "Bob"));
        collection.add(new Person(3, "Tom"));
        collection.add(new Person(2, "George"));
        collection.add(new Person(1, "Jhon"));
    }
}

class Person implements Comparable<Person> {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Lesson12.Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if (this.name.length() > o.getName().length()) {
            return 1;
        } else if (this.name.length() < o.getName().length()) {
            return -1;
        } else {
            return 0;
        }
    }
}