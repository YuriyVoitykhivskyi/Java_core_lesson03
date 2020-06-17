package ua.lviv.lgs;

public class MainMethod {
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		
		
		System.out.println("Rectangle Area = " + r1.getArea());
		System.out.println("Rectangle Perimetr = " + r1.getPerimetr());
		
		Circle c1 = new Circle();
		
		System.out.println("Circle Area = " + c1.getArea());
		System.out.println("Circle Lenght = " + c1.getLenght());
	}
}
