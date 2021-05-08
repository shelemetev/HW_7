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

            return firstName.equals(person.firstName) && lastName.equals(person.lastName) && gender==person.gender;
        }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());             result = prime * result; result = prime * result +
                ((lastName == null) ? 0 : lastName.hashCode()); return result;
    }


    @Override
    public String toString() {
        return firstName + " " +
                lastName + " " +
                gender + " ";
    }
}
