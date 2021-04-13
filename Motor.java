package MotorGetterSetter;

public class Motor {

	String type;
	String colour;
	String classification;
	String engineCapacity;
	
	//Create Setter Method
	public void setType(String type) {
		this.type = type;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public void setClassification(String classification) {
		this.classification = classification;
	}
	
	public void setengineCapacity(String engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	
	//Create Getter Method
	public String getType() {
		return this.type;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public String getClassification() {
		return this.classification;
	}
	
	public String getengineCapacity() {
		return this.engineCapacity;
	}
	
	// Create a method
	public void travel() {
		System.out.println("Travelling with motorcycle!");
	}
	
	public void ride() {
		System.out.println("Riding a motorcycle!");
	}
	
	public void brake() {
		System.out.println("Braking the motorcycle!");
	}
	
	public void fetch() {
		System.out.println("Fetching people with motorcycle!");
	}
}
