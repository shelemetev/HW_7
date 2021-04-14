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

        public boolean equals(Object o) {

            Person person = (Person) o;

            return firstName == person.firstName && lastName == person.lastName && gender == person.gender;
        }



    @Override
    public int hashCode() {


        return firstName.hashCode()*7+lastName.hashCode()*17+gender.hashCode()*19;
    }

    @Override
    public String toString() {
        return firstName + " " +
                lastName + " " +
                gender + " ";
    }
}
