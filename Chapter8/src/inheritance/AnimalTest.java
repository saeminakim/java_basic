package inheritance;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunt() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void fly() {
		System.out.println("독수리는 날 수 있습니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
		
		// Animal a = new Human();
		// 이렇게 하는거랑 moveAnimal(new Human()) 이랑 같은 역할
		
		Animal[] animalList = new Animal[3];
		animalList[0] = new Human();
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Tiger());
		
	}
	
	public void moveAnimal(Animal animal) {
		
		animal.move();
		
//		Human human = (Human) animal;
//		이렇게 할 경우 잘 실행되지만 human이 아닌 애들 tiger, eagle이 생성될 때 에러 발생
		
		if(animal instanceof Human) {
			Human human = (Human) animal;
			human.readBook();
		} else if (animal instanceof Tiger) {
			Tiger tiger = (Tiger) animal;
			tiger.hunt();
		} else if (animal instanceof Eagle) {
			Eagle eagle = (Eagle) animal;
			eagle.fly();
		} else {
			System.out.println("지원되지 않는 기능입니다.");
		}
	}

}
