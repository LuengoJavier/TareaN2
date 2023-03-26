import java.util.ArrayList;

public class Empresa {
	int cantidadBuses = 10;
	private ArrayList<Bus> buses;

	public Bus comprarBuses(String marca, int kilometraje, String color, String id) {
		if (buscarBus(id) == null){
			Bus bus = new Bus(marca, kilometraje, color, id);
			this.buses.add(bus);
			return bus;
		}
		return null;
	}

	public boolean venderBuses(String id) {
		for(Bus bus : this.buses) {
			if (buscarBus(id) != null){
				this.buses.remove(bus);
				return true;
			}
		}
		return false;
	}

	public Bus buscarBus(String id) {
		for(Bus bus : this.buses){
			if(bus.getId().equals(id)){
				return bus;
			}
		}
		return null;
	}

	public int getCantidadBuses() {
		return this.cantidadBuses;
	}

	public int setCantidadBuses(int cantidadBuses) {
		return this.cantidadBuses = cantidadBuses;
	}
}