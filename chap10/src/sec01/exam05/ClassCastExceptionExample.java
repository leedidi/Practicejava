package sec01.exam05;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDoog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}

	public static void changeDog(Animal animal) {
		//if(animal instanceof Dog) {
		Dog dog = (Dog) animal;
	//}
	}
}
}

	class Animal{}
	class Dog etends Animal{}
	class Cat extends Animal{}
