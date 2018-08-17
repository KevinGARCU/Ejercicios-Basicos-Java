package ejercicios.basicos;

/**
 *
 * @author Kevin Garcia
 */
public class list {
	
	private String fecha;
	private String hora;
	private String lugar;
	private String descripcion;
	
	public list( ){
		
		fecha =  "";
		hora = "";
		lugar = "";
		descripcion = "";
	}
	
	public list( String date, String hour, String place, String description ) {
		
		fecha =  date;
		hora = hour;
		lugar = place;
		descripcion = description;
	}

	public String getFecha() {
		
		return fecha;
	}

	public void setFecha(String fecha) {
		
		this.fecha = fecha;
	}

	public String getHora() {
		
		return hora;
	}

	public void setHora(String hora) {
		
		this.hora = hora;
	}

	public String getLugar() {
		
		return lugar;
	}

	public void setLugar(String lugar) {
		
		this.lugar = lugar;
	}

	public String getDescripcion() {
		
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		
		this.descripcion = descripcion;
	}
	
	
}
