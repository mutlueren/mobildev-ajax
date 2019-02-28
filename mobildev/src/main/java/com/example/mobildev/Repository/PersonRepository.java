package com.example.mobildev.Repository;

import com.example.mobildev.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    List<Person> findByName(String name);
}
