package com.example.mobildev.Model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "person_information")
public class Person {

    @Id
    @GeneratedValue
    @NotNull
    @Column
    private int id;

    @NotNull
    @Column
    private String name;

    @NotNull
    @Column
    private int age;

    @NotNull
    @Column
    private String hobby;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
