public class Bus {
	private String marca;
	private int kilometraje;
	private String color;
	private String id;
	public Bus(String marca, int kilometraje, String color, String id) {
		this.marca = marca;
		this.kilometraje = kilometraje;
		this.color = color;
		this.id = id;
	}
	public String getMarca() {
		return this.marca;
	}
	public int getKilometraje() {
		return this.kilometraje;
	}

	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public String getId() {
		return this.id;
	}

}