package cat.fastigo64.aplicacion.consulta;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import cat.fastigo64.aplicacion.entidad.Vehiculo;
import cat.fastigo64.aplicacion.servicio.VehiculoServicio;

@Component
public class VehiculoQuery implements GraphQLQueryResolver {

	@Autowired
	private VehiculoServicio vehiculoServ;

	public List<Vehiculo> getCoche() {
		return this.vehiculoServ.listaTodos();
	}
	
	public List<Vehiculo> getVehiculos(final int count) {
		return this.vehiculoServ.listaTodos(count);
	}
	
	public Optional<Vehiculo> getVehiculo(int id) {
		
		return vehiculoServ.unVehiculo(id);
	}
}
