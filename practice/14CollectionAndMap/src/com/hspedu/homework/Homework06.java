package com.hspedu.homework;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author 韩顺平
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Homework06 {
    public static void main(String[] args) {
        HashSet set = new HashSet();//ok
        Person p1 = new Person(1001,"AA");//ok
        Person p2 = new Person(1002,"BB");//ok
        set.add(p1);//ok
        set.add(p2);//ok
        p1.name = "CC";
        set.remove(p1);
        System.out.println(set);//2
        set.add(new Person(1001,"CC"));
        System.out.println(set);//3
        set.add(new Person(1001,"AA"));
        System.out.println(set);//4

    }
}

class Person {
    public String name;
    public int id;

    public Person(int id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

