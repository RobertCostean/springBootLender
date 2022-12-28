package com.peerlender.profile.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Users {

    @Id
    private String username;
    private String firstName;
    private String lastname;
    private int age;
    private String occupation;
    private LocalDate registeredSince;

    public Users() {
    }

    public Users(String username, String firstName, String lastname, int age, String occupation, LocalDate registeredSince) {
        this.username = username;
        this.firstName = firstName;
        this.lastname = lastname;
        this.age = age;
        this.occupation = occupation;
        this.registeredSince = registeredSince;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }

    public LocalDate getRegisteredSince() {
        return registeredSince;
    }

    public void setRegisteredSince(LocalDate registeredSince) {
        this.registeredSince = registeredSince;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return age == users.age && Objects.equals(username, users.username) && Objects.equals(firstName, users.firstName) && Objects.equals(lastname, users.lastname) && Objects.equals(occupation, users.occupation) && Objects.equals(registeredSince, users.registeredSince);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, firstName, lastname, age, occupation, registeredSince);
    }

    @Override
    public String toString() {
        return "Users{" +
                "username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                ", registeredSince=" + registeredSince +
                '}';
    }
}
