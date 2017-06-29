package com.janita.jpa.service;

import com.janita.jpa.model.Person;
import com.janita.jpa.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * Created by Janita
 */
@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public double getAverageSalary() {

        double salarySum = 0;
        List<Person> personList = personRepository.findAll();

        for (Person person : personList) {

            salarySum = salarySum + person.getSalary();

            if (person.getBirthday() != null) {
            }
        }

        return salarySum / personList.size();
    }

    public Person addPerson(Person person) {
        return personRepository.save(person);
    }

    public Collection<Person> findAll() {
        return personRepository.findAll();
    }

    public Person findOne(Long id) {
        return personRepository.findOne(id);
    }

    public Person create(Person person) {

        if (person.getId() != null) {
            return null;
        }
        return personRepository.save(person);
    }

    public Person update(Person person) {
        Person persistedPerson = personRepository.findOne(person.getId());

        if (persistedPerson == null) {
            return null;
        }

        return personRepository.save(person);
    }

    public void delete(long id) {
        personRepository.delete(id);
    }

    public void tabulaRasa() {
        personRepository.deleteAll();
    }
}
