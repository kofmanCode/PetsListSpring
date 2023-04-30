package com.test.pets.repository;

import com.test.pets.model.PetType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepository extends JpaRepository<PetType, Long> {

}
