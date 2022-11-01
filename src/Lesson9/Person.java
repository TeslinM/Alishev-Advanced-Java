package Lesson9;

import java.util.Objects;

public class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    /*
    Контракт hashcode() equals()
    1) У двух проверяемых объектов вызываем метод hashcode()
    если хэши разные -> два объекта точно разные.

    2) если хэши одинаковые -> equals()
    3) equals() -> выдает ответ
    */

}

