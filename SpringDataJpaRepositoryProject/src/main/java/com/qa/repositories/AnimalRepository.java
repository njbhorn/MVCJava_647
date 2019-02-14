package com.qa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.beans.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Integer>{

}
