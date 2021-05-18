package Assignment.LineCompare;
import java.util.Scanner;

public class LineLength {
	public static double length() {
		double x1,x2,y1,y2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("........coordinates of line........");
		System.out.println("enter value of start point coordinate X: ");
		x1 = scanner.nextDouble();
		System.out.println("enter value of start point coordinate Y: ");
		y1 = scanner.nextDouble();
		System.out.println("enter value of end point coordinate X: ");
		x2 = scanner.nextDouble();
		System.out.println("enter value of end point coordinate Y: ");
		y2 = scanner.nextDouble();
		System.out.println("the given coordinates are ("+x1+","+y1+"),("+x2+","+y2+")" );
		
		return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
	}
}
