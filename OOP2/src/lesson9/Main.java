package lesson9;

public class Main {

	public static void main(String[] args) {

	Auto auto = new Auto("mazda", 10, new Engine(200));
	
	
	System.out.println(auto.getEngine().getPower());
	
	
	Boat boat = new Boat("spirit");
	
	boat.setEngine(new Engine(30));
	
	boat.setEngine(null);
	
	Human human = new Human();
	
	human.humanClapping();
		

		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
