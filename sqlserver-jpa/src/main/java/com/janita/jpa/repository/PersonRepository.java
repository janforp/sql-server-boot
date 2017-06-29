package com.janita.jpa.repository;

import com.janita.jpa.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Janita
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
