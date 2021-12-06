package com.javaex.oop.goods.v3;

public class GoodsApp {

	public static void main(String[] args) {
//		Goods notebook = new Goods(); //참조타입 
//		notebook.setName("Macbook Air");
//		notebook.setPrice(1600000);
		Goods notebook = new Goods("Macbook Air", 1600000);
		
//		Goods smartphone = new Goods();
//		smartphone.setName("iPhone 13");
//		smartphone.setPrice(1000000);
		Goods smartphone = new Goods("iPhone 13", 1000000);
		
//		smartphone.setPrice(10000);
//		System.out.printf("%s, %d원%n", notebook.getName(), notebook.getPrice());
//		System.out.printf("%s, %d원%n", smartphone.getName(), smartphone.getPrice());
		
		notebook.showInfo();
		smartphone.showInfo();
	}

}
