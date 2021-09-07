package inheritance;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
	
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
	
	public void hunt() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	
	public void fly() {
		System.out.println("�������� �� �� �ֽ��ϴ�.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
		
		// Animal a = new Human();
		// �̷��� �ϴ°Ŷ� moveAnimal(new Human()) �̶� ���� ����
		
		Animal[] animalList = new Animal[3];
		animalList[0] = new Human();
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Tiger());
		
	}
	
	public void moveAnimal(Animal animal) {
		
		animal.move();
		
//		Human human = (Human) animal;
//		�̷��� �� ��� �� ��������� human�� �ƴ� �ֵ� tiger, eagle�� ������ �� ���� �߻�
		
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
			System.out.println("�������� �ʴ� ����Դϴ�.");
		}
	}

}
