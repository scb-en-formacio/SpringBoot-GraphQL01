package cat.fastigo64.aplicacion.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import cat.fastigo64.aplicacion.entidad.Vehiculo;
import cat.fastigo64.aplicacion.servicio.VehiculoServicio;

@Component
public class VehiculoMutation implements GraphQLMutationResolver {

	@Autowired
	private VehiculoServicio vehiculoServ;
	
	public Vehiculo creaVehicul(final String tip, final String codigoModel, 
			final String nombreMarc, final String fechaLanz) {

        return vehiculoServ.creaVehiculo(tip, codigoModel, nombreMarc, fechaLanz);
	}

}
