package se.lexicon.cheng.data;

import se.lexicon.cheng.model.Person;

import java.lang.reflect.Array;
import java.util.Arrays;

public class People {
    private static Person[] people;

    //    instantiated as empty and not null (new Person[0]).
    static {
        people = new Person[0];
    }

    public void clear() {
        people = new Person[0];
    }

    public int size() {
        return people.length;
    }

    public Person createPerson(String firstName, String lastName) {
        Person newPerson = new Person(
                PersonSequencer.nextPersonId(),
                firstName,
                lastName
        );

        people = Arrays.copyOf(people, people.length + 1);
        people[people.length - 1] = newPerson;
        return newPerson;
    }

    public Person[] findAll() {
        return Arrays.copyOf(people, people.length);
    }

    public Person findById(int personId) {
        for (Person person : people) {
            if (person.getPersonId() == personId) {
                return person;
            }
        }
        return null;
    }
}

