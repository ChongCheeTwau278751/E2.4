package MotorGetterSetter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Motor standard = new Motor();
		Motor touring = new Motor();
		Motor sport = new Motor();
		Motor dirt = new Motor();
		
		standard.setType("Yamaha SR400");
		standard.setColour("Black and Blue");
		standard.setClassification("Standard bike");
		standard.setengineCapacity("399cc");
		
		touring.setType("Gold Wing");
		touring.setColour("Black and Red");
		touring.setClassification("Touring bike");
		touring.setengineCapacity("1833cc");
		
		sport.setType("Suzuki GSX-R600");
		sport.setColour("Black and White");
		sport.setClassification("Sport bike");
		sport.setengineCapacity("599cc");
		
		dirt.setType("Yamaha YZ450F");
		dirt.setColour("Blue and White");
		dirt.setClassification("Dirt bike");
		dirt.setengineCapacity("449cc");
		
		System.out.println("Type\t\t:" + standard.getType());
		System.out.println("Colour\t\t:" + standard.getColour());
		System.out.println("Classification\t:" + standard.getClassification());
		System.out.println("Engine Capacity\t:" + standard.getengineCapacity());
		standard.travel();
		standard.ride();
		standard.brake();
		standard.fetch();
		System.out.println();
		
		System.out.println("Type\t\t:" + touring.getType());
		System.out.println("Colour\t\t:" + touring.getColour());
		System.out.println("Classification\t:" + touring.getClassification());
		System.out.println("Engine Capacity\t:" + touring.getengineCapacity());
		touring.travel();
		touring.ride();
		touring.brake();
		touring.fetch();
		System.out.println();
		
		System.out.println("Type\t\t:" + sport.getType());
		System.out.println("Colour\t\t:" + sport.getColour());
		System.out.println("Classification\t:" + sport.getClassification());
		System.out.println("Engine Capacity\t:" + sport.getengineCapacity());
		sport.travel();
		sport.ride();
		sport.brake();
		sport.fetch();
		System.out.println();
		
		System.out.println("Type\t\t:" + dirt.getType());
		System.out.println("Colour\t\t:" + dirt.getColour());
		System.out.println("Classification\t:" + dirt.getClassification());
		System.out.println("Engine Capacity\t:" + dirt.getengineCapacity());
		dirt.travel();
		dirt.ride();
		dirt.brake();
		dirt.fetch();
		
	}

}
