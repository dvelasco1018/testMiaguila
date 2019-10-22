package com.miaguila.test.data;

import org.springframework.stereotype.Repository;

import com.miaguila.test.model.Viaje;

@Repository(value="Viaje")
public interface ViajeRepository extends JpaRepository<Viaje, Long> {
	
}