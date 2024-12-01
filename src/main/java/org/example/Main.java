package org.example;

import static org.example.Person.deserializePerson;
import static org.example.Person.serializePerson;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Michael Jackson", 30);
        String filename = "person.ser";

        // Сериализация
        serializePerson(person, filename);

        // Десериализация
        Person deserializedPerson = deserializePerson(filename);
        if (deserializedPerson != null) {
            System.out.println("Имя: " + deserializedPerson.getName());
            System.out.println("Возраст: " + deserializedPerson.getAge());
        }
    }
}