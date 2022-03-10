
public class Complex {
	private double  x;
	private double y;
	public static int nrComplexe=0;
	
	public Complex(double x, double y) {
		this.x=x;
		this.y=y;
		nrComplexe++;
		
	}
	
	public void calcul() {
		double c= Math.sqrt(x*x + y*y);
		
	}
	public void PrintComplex() {
		System.out.println(x + " +i*"+ y);
	}
	
	public void SumaComplexe(Complex i) {
		/*double sumaX= i.x + x;
		double sumaY=i.x + y;
		
		return 
		*/
		//nu am inteles exact cerinta 
		
	}
}
