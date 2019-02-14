package com.qa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.beans.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Integer>{

}
