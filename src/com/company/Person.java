package com.company;

public final class Person {
    private final String firstName;

    private final String lastName;

    private final Gender gender;

    public Person(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object a) {
        if (this== a) return true;
        if (!(a instanceof Person)) return false;

        Person person=(Person) a;
        return firstName==person.firstName &&
                lastName==person.lastName &&
                gender==person.gender;
    }

    @Override
    public int hashCode() {
        return firstName.length() + lastName.length();
    }

    @Override
    public String toString() {
        return firstName + " " +
                lastName + " " +
                gender + " ";
    }
}
