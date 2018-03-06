package by.tc.lesson2;
import java.util.Scanner; 
public class homework {

	
		public static void main (String [] args) {
		
			double a;
			double b;
			double c;
			double result;
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Введите число a");
			a = sc.nextDouble();
			System.out.println("Введите число b");
			b = sc.nextDouble();
			System.out.println("Введите число c");
			c = sc.nextDouble();		
			result = (b + Math.sqrt(b*b + 4*a*c))/(2*a) - Math.pow(a, 3)*c + b;
			System.out.println("Ответ: " + result);
		}
	}

