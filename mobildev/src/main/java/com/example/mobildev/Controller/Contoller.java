package com.example.mobildev.Controller;

import com.example.mobildev.Model.Person;
import com.example.mobildev.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@RestController
public class Contoller {

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping(value = "/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");

        return modelAndView;
    }

    @RequestMapping("/addByManual")
    public void main(){

        //manual adding
        Person mutlu = new Person();
        mutlu.setName("Mutlu");
        mutlu.setAge(23);
        mutlu.setHobby("Fitness");

        this.personRepository.save(mutlu);
    }

    @RequestMapping("/allPerson")
    public List<Person> getAllPerson(){
        return personRepository.findAll();
    }


    @PostMapping("/createNewPerson")
    public Person createNewPerson(@RequestBody Person person){
        return personRepository.save(person);
    }

    @PutMapping("/updatePerson")
    public Person updatePerson(@RequestBody Person person){
        return personRepository.save(person);
    }

    @DeleteMapping("/deletePerson")
    public boolean deletePerson(@PathVariable(value = "id") Integer id){
        personRepository.deleteById(id);
        return true;
    }

}
