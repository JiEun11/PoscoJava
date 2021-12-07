package com.javaex.oop.casting;

public class AnimalApp {

	public static void main(String[] args) {
		
		//Upcasting (부모타입으로 자식객체가 자동변환 되는 것)
		Dog dog1 = new Dog("스누피");  //animal에게 물려받은 method + 자기꺼 method
		dog1.eat();
		dog1.walk();
		dog1.bark();
		
		//Upcasting : 참조 자료형에 설계된 멤버에만 접근 가능
		Animal dog2  = new Dog("아지");  //부모타입으로 자식객체 생성 
		dog2.eat();
		dog2.walk();
		((Dog)dog2).bark(); 	//Downcasting

		
		Animal cat1 = new Cat("야용이");	//Upcasting
		cat1.eat();
		cat1.walk();
		
		if (cat1 instanceof Dog) {	// cat1이 Dog의 인스턴스인가?
			((Dog)cat1).bark();
		}else if(cat1 instanceof Cat){	// cat1이 Cat의 인스턴스인가?
			((Cat)cat1).meow();
		}
		
//		Dog[] pets = new Dog[3];	//부모타입으로 자식을 참조하는가, 다형성 때문에 , 교체가능성 때문에
		Animal[] pets = new Animal[3];
		
		pets[0] = dog1;
		pets[1] = (Dog)dog2;
		pets[2] = new Dog("멍멍이");
		pets[2] = new Cat("아즈라엘");	//들어갈 수 없음.
		
		
		for(Animal pet: pets) {
			pet.eat();
			pet.walk();
			
			if(pet instanceof Dog) {
				((Dog)pet).bark();
			}else if(pet instanceof Cat) {
				((Cat)pet).meow();
			}
		}
		
	}

}
