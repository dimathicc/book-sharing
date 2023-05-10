package ru.dmitryshvalev.libraryspringboot.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.dmitryshvalev.libraryspringboot.models.Person;
import ru.dmitryshvalev.libraryspringboot.repositories.PeopleRepository;
import ru.dmitryshvalev.libraryspringboot.services.PeopleService;

@Component
public class PersonValidator implements Validator {

    private final PeopleService peopleService;

    @Autowired
    public PersonValidator(PeopleRepository peopleRepository, PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return Person.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Person person = (Person) o;

        if (peopleService.getPersonByName(person.getName()).isPresent()) {
            errors.rejectValue("name", "", "Человек с таким ФИО уже есть");
        }
    }
}
