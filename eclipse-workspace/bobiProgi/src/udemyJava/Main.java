package udemyJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String args[]) {
		
		class Ember{
			int age;
			String name;
			
			public Ember(int age, String name) {
				this.age=age;
				this.name=name;
			}
			
			public String toString() {
				return name;
			}
			
		}
		
		ArrayList<Integer> ember = new ArrayList<Integer>();
	
		ember.add(20);
		for(int i=0;i<10;i++) {
			ember.add(i);
		}
		
		class Dogo implements Animal{
			@Override
			public void animalSound() {
				System.out.println("vau");
			}
		}
		
		Dogo dogo = new Dogo();
		dogo.animalSound();
		
		Animal animal2 = new Animal() {
			@Override
			public void animalSound() {
				System.out.println("anonim inner class");
			}
		};
		
		animal2.animalSound();
		
		ember.remove(5);
		
		for(int i=0;i<ember.size();i++) {
			ember.remove(2);
			System.out.println(ember.get(i));
		}
		
		
		
		
		
		
		
		
		
	Teacher sallyTeacher = new Teacher("","", "",4,4);
	Teacher.Subject subject = sallyTeacher.new Subject("Math");
	System.out.println(subject.getName());
	
	
	System.out.println(ember);
	
	Dog dog = new Dog();
	Cat cat = new Cat();
	
	Animal animal = new Dog(); 
	
	Animal[] animals = {cat,dog};
	
	animal.animalSound();
	
	
	Labdavezetes[] meccs = new Labdavezetes[6];
	meccs[0] = new Labdavezetes(1,10);
	meccs[1] = new Labdavezetes(2,6);
	meccs[2] = new Labdavezetes(2,5);
	meccs[3] = new Labdavezetes(1,10);
	meccs[4] = new Labdavezetes(2,5);
	meccs[5] = new Labdavezetes(1,10);
	
	for(Labdavezetes i:meccs) {
		System.out.println(i.getPlayerId() + ": "+i.getDistance());
	}
	
	int maxDistance = meccs[0].getDistance();
	int bestPlayer = meccs[0].getPlayerId();
	int currentDistance = meccs[0].getDistance();
	int currentPlayer = meccs[0].getPlayerId();
	
	for(int i=1;i<meccs.length;i++) {
		if(currentPlayer == meccs[i].getPlayerId()) {
			currentDistance = currentDistance + meccs[i].getDistance();
			
			
		}else {
			currentDistance = meccs[i].getDistance();
			currentPlayer = meccs[i].getPlayerId();
			
		}
		
		if(maxDistance < currentDistance) {
			maxDistance = currentDistance;
			bestPlayer = currentPlayer;
		}
	}
	
	System.out.println("maxDistance: " + maxDistance);
	System.out.println("bestPlayer: " + bestPlayer);
	
	
	}
}






