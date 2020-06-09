package src.ua.lgs;
import java.util.Arrays;

public class firstlesson {

	
	public static void main(String[] args) {
		byte b = 10;
		short s = 32;
		int in = 521;
		long l = 120;
		float f = 33222;
		double d = 1772.23;
		char c = 0;
		boolean bo = true;
		
		System.out.println("Byte MAX =" + Byte.MAX_VALUE);
		System.out.println("Byte MIN =" + Byte.MIN_VALUE);
		
		System.out.println("Short MAX =" + Short.MAX_VALUE);
		System.out.println("Short MIN =" + Short.MIN_VALUE);
		
		System.out.println("Integer MAX =" + Integer.MAX_VALUE);
		System.out.println("Integer MIN =" + Integer.MIN_VALUE);
		
		System.out.println("Long MAX =" + Long.MAX_VALUE);
		System.out.println("Long MIN =" + Long.MIN_VALUE);
		
		System.out.println("Float MAX =" + Float.MAX_VALUE);
		System.out.println("Float MIN =" + Float.MIN_VALUE);
		
		System.out.println("Double MAX =" + Double.MAX_VALUE);
		System.out.println("Double MIN =" + Double.MIN_VALUE);
		
		System.out.println("Character MAX =" + Character.MAX_VALUE);
		System.out.println("Character MIN ="  + Character.MIN_VALUE);
		
//		System.out.println("Boolean " + Boolean.MAX_VALUE);
//		System.out.println("Boolean " + Boolean.MIN_VALUE);
		
		
		int array1[] = new int [10];
		
		for(int i = 0; i < array1.length; i++) {
			array1[i] = 5 *(2+ i);
			System.out.println(array1[i]);
		}
		Arrays.sort(array1);
		int min = array1[0];
		System.out.println("Min array value -> "+ min);
		int max = array1[array1.length-1];
		System.out.println("Max array value -> "+ max);
		
	}
}
