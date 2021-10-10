package com.doclick.repositories;

import com.doclick.entities.Prestation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestationRepository extends JpaRepository<Prestation, Long> {
}
