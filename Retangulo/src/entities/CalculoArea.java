package entities;

public class CalculoArea {

	public double Width;
	public double Height;
	
	public double Area() {
		return Width * Height;
	}
	public double Perimeter() {
		return (Width + Height) * 2;
	}
	public double Diagonal() {
		return Math.sqrt(Math.pow(Width, 2) + Math.pow(Height, 2));
	}
	public String toString() {
		return "AREA = " + String.format("%.2f", Area()) 
				+ "\nPERIMENTER = " + String.format("%.2f", Perimeter()) 
				+ "\nDIAGONAL = " + String.format("%.2f", Diagonal());
	}
}
