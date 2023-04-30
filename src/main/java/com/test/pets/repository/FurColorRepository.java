package com.test.pets.repository;

import com.test.pets.model.FurColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FurColorRepository extends JpaRepository<FurColor, Long> {

}
