package cat.fastigo64.aplicacion.entidad;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Entity
public class Vehiculo implements Serializable{

	private static final long serialVersionUID = 6686794654411958082L;

	@Id
	@Column(name="ID", nullable = false)
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;

	@Column(name = "tipo", nullable = false)
	private String tipo;

	@Column(name = "codigo_modelo", nullable = false)
	private String codigoModelo;

	@Column(name = "nombre_marca")
	private String nombreMarca;

	@Column(name = "fecha_lanzamiento")
	private LocalDate fechaLanzamiento;
	
	private transient String fechaFormateada;
	
	public Vehiculo() {
		super();
	}

	public Vehiculo(String tipo, String codigoModelo, String nombreMarca,
			LocalDate fechaLanz) {
		super();
		this.tipo = tipo;
		this.codigoModelo = codigoModelo;
		this.nombreMarca = nombreMarca;
		this.fechaLanzamiento = fechaLanz;
	}

	// getter y setter
	public String getFechaFormateada() {
		return getFechaLanzamiento().toString();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCodigoModelo() {
		return codigoModelo;
	}

	public void setCodigoModelo(String codigoModelo) {
		this.codigoModelo = codigoModelo;
	}

	public String getNombreMarca() {
		return nombreMarca;
	}

	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}

	public LocalDate getFechaLanzamiento() {
		return fechaLanzamiento;
	}

	public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}

	public void setFechaFormateada(String fechaFormateada) {
		this.fechaFormateada = fechaFormateada;
	}

}
