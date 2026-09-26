
public class A1Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double rad=7;
		double peri=2.0 * Math.PI * rad;
		double cirArea=rad * peri/2.0;
		double ballArea=4.0 * cirArea;
		double ballVol=ballArea * rad/3.0;
		
		System.out.print("rad = "+rad+
				"\nPerimeter of the circle = "+peri+
				"\nArea of the circle = "+cirArea+
				"\nSurface area of the sphere = "+ballArea+
				"\nVolume of the sphere = "+ballVol);
	}

}
