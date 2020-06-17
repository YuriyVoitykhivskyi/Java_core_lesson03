package ua.lviv.lgs;

public class Circle {
	
	double diameter;
	double radius;
	double area;
	double lenght;
	
		Circle (){
			this.diameter = 5;
			this.radius = 2.5;
			this.area = 3.14 * diameter;
			this.lenght = 2 * 3.14 * radius;
		}
		Circle (double diameter, double radius){
			this.diameter = diameter;
			this.radius = radius;
		}
		
		public double getArea() {
				return area;
		}
		public double getLenght() {
			return lenght;
	}
}
