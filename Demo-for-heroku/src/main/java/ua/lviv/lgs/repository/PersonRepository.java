package ua.lviv.lgs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.lviv.lgs.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
