package ua.lviv.lgs;

public class Rectangle {
	
	 int width;
	 int lenght;
	 int area;
	 int perimetr;

		Rectangle (){
		this.width = 10;
		this.lenght = 10;
		this.area = width * lenght;
		this.perimetr = 2 * (width + lenght);
		}
		Rectangle (int width, int lenght){
		this.width = width;
		this.lenght = lenght;
		}
			public int getArea() {
				return area;
			}
			public int getPerimetr() {
				return perimetr;
			}
			
	
//		public String toString() {
//			return "Rectangle [width=" + width + ", lenght=" + lenght + ", area=" + area + ", perimetr=" + perimetr
//					+ "]";
//		}
	
			
	
}
