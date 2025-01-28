package com.lucassena.springscrudpeople.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucassena.springscrudpeople.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
