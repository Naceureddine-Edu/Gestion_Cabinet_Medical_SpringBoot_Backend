package com.doclick.repositories;

import com.doclick.entities.Cabinet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CabinetRepository extends JpaRepository<Cabinet, Long> {
}
