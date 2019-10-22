package com.miaguila.test.service;

@Service
public class ViajeService {
	
	public Long getTotalViajes();

    public Long getTotalViajesCiudad();

    public Viaje crearViaje(Viaje viaje);

    public Viaje actualizarViaje(Viaje viaje);
}