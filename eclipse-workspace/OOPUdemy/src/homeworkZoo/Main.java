package homeworkZoo;

public class Main {
	
	public static void main(String args[]) {
		Animal sparrow = new Sparrow(5,"asd",6);
		Animal fish = new Fish(45,"asdzxc");
		Animal bird = new Bird(45,"rte",45);
		
		Flyable flyingBird = new Sparrow(5,"asdf",60);
		
		moveAnimals(fish);
		moveAnimals(bird);
		moveAnimals(sparrow);

		
		System.out.println(bird.name);
		bird.name="asdasd";
		System.out.println(bird.name);
	}
	
	public static void moveAnimals(Animal animal) {
		animal.move();
	}
	
}
