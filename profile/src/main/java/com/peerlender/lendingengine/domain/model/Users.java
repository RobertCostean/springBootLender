package com.peerlender.lendingengine.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.Objects;

@Entity
public final class Users {
    @Id
    private String username;
    private String firstName;
    private String lastName;
    private int age;
    private String occupation;

    public Users() {
    }

    public Users(String username, String firstName, String lastName, int age, String occupation) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.occupation = occupation;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "Users{" +
                "username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return age == users.age && Objects.equals(username, users.username) && Objects.equals(firstName, users.firstName) && Objects.equals(lastName, users.lastName) && Objects.equals(occupation, users.occupation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, firstName, lastName, age, occupation);
    }
}
