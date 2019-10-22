package com.miaguila.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.miaguila.test.service.ViajeService;

@RestController
@RequestMapping("viajes")
public class ViajeController {
	
	@Autowired
	private ViajeService viajeService;

	@RequestMapping(value = "totalViajes/",method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Long> getTotalViajes() {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(viajeService.getTotalViajes());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}

    @RequestMapping(value = "totalViajesCiudad/{ciudad}",method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Long> getTotalViajesCiudad(String ciudad) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(viajeService.getTotalViajesCiudad(ciudad));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}

    @PostMapping(value = "crearViaje/",method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Long> crearViaje(Viaje viaje) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(viajeService.crearViaje(viaje));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}

    @RequestMapping(value = "actualizarViaje/",method = RequestMethod.PUT, produces = "application/json")
	public ResponseEntity<Long> crearViaje(Viaje viaje) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(viajeService.actualizarViaje(viaje));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}
	
	
}