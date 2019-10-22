package com.miaguila.test.implementation;

@Component
public class ViajeService implements ViajeService{
	
	@Autowired
	private ViajeRepository viajeRepository;
	
	public Long getTotalViajes() {
		return viajeRepository.count();
	}

    public Long getTotalViajesCiudad() {
		return viajeRepository.count();
	}

    public Viaje crearViaje(Viaje viaje) {
		return viajeRepository.save(viaje);
	}

    public Viaje actualizarViaje(Viaje viaje) {
        Viaje viajeReemplazo = viajeRepository.findById(viaje.getId());
        viajeReemplazo = viaje;
        //Al estar cargada la entidad en memoria, se actualiza automaticamente la bd
		return viajeRepository.saveAndFlush();
	}
}