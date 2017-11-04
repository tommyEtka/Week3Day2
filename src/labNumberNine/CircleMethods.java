package labNumberNine;

import java.text.DecimalFormat;

//import java.util.Scanner;

public class CircleMethods {

	// Scanner scan1 = new Scanner(System.in);

	private double radius;
	private String formattedCircumference;
	// private double circumference;
	private String formattedArea;
	public String formattedNumber;

	// private double area;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		System.out.println(Math.PI * radius * radius);
		return radius;

	}

	public double getCircumference() {
		System.out.println(2 * Math.PI * radius);
		return radius;
	}

	public String getFormattedArea() {
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		System.out.println(df.format(Math.PI * radius * radius));
		return formattedArea;
	}

	public String getFormattedCircumference() {
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		System.out.println(df.format(2 * Math.PI * +radius));
		// System.out.println(df.format(getArea()));
		return formattedCircumference;
	}
	
	
	
	public String getFormattedNumber(double number){
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		System.out.println(df.format(number));
		String getformattedNumber = df.format(number);
		return getformattedNumber;
		
	}

}
