package rectangle;

public class rec {

	public static void main(String[] args) 
	{
		System.out.println("area for rectangle " + calculateRectArea(10,5));

		double areaOfACircle = calculatecirclearea(4);
		System.out.println("area of circle "+ areaOfACircle);
	}
	
	public static double calculateRectArea(int length,int width)
	{
	double area=length * width;
	return area;
	}
	public static double calculatecirclearea(int radius) 
	{
	double area=3.14*radius*radius;
	return area;
	}
}
