package cat.fastigo64.aplicacion.servicio;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cat.fastigo64.aplicacion.entidad.Vehiculo;
import cat.fastigo64.aplicacion.repositorio.VehiculoRepositorio;

@Service
public class VehiculoServicio {

	final VehiculoRepositorio vehiculoRepo;

	public VehiculoServicio(VehiculoRepositorio vehiculoRepo) {
		this.vehiculoRepo = vehiculoRepo;
	}

	@Transactional(readOnly = true)
	public List<Vehiculo> listaTodos() {
		
		return vehiculoRepo.findAll();
	}
	
	@Transactional(readOnly = true)
	public List<Vehiculo> listaTodos(final int cuenta) {
		 
		//return vehiculoRepo.findAll().stream().limit(cuenta).collect(Collectors.toList());
		return vehiculoRepo.findAll().subList(0, cuenta);
	}

	@Transactional(readOnly = true)
	public Optional<Vehiculo> unVehiculo(int id) {
		
		return vehiculoRepo.findById(id);
	}

	@Transactional
	public Vehiculo creaVehiculo(String tipo, String codigoModelo, String nombreMarca, String fechaLanz) {
		
		final Vehiculo vehic = new Vehiculo(tipo, codigoModelo, nombreMarca, LocalDate.parse(fechaLanz));
		return vehiculoRepo.save(vehic);
	}

	/*public List<Vehiculo> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Vehiculo> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}*/

}
