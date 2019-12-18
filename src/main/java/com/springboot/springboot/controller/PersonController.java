package com.springboot.springboot.controller;

import com.springboot.springboot.Repository.PersonPepository;
import com.springboot.springboot.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2019/12/18
 */
@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonPepository pp;

    @PostMapping(path="addPerson")
    public void addPerson(@RequestBody Person person) {
        pp.save(person);
    }

    @GetMapping(path="getAllPerson")
    public List<Person> getPerson(){
        return pp.findAll();
    }

    @DeleteMapping(path="deletePerson")
    public void deletePerson(@RequestParam Long id) {
        pp.deleteById(id);
    }

    @PutMapping(path="updatePerson")
    public void updatePerson(@RequestBody Person person) {
        pp.saveAndFlush(person);
    }
}
