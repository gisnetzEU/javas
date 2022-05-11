package exampleColaborativeTest1;

public class Clinica {
	
	String name;
	String addres;
	int beds;
	
	public Clinica(String name, String addres, int beds) {
		super();
		this.name = name;
		this.addres = addres;
		this.beds = beds;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public int getBeds() {
		return beds;
	}

	public void setBeds(int beds) {
		this.beds = beds;
	}
	
	
	
	
	

	@Override
	public String toString() {
		return "Clinica [name=" + name + ", addres=" + addres + ", beds=" + beds + "]";
	}
	
	
	
	

}
