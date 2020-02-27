package cat.fastigo64.aplicacion.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cat.fastigo64.aplicacion.entidad.Vehiculo;

@Repository
public interface VehiculoRepositorio extends JpaRepository<Vehiculo, Integer> {

}
