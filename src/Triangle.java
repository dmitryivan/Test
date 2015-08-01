public class Triangle {
	private double a,b,c;
	
	public Triangle(){
		a = 0;
		b = 0;
		c = 0;
	}
	
	public Triangle(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double area (){
		double p = (this.a + this.b + this.c)/2;
		return Math.pow(p * ((p-a) * (p-b) * (p-c)), 0.5);
	}
	
	public void printArea(){
		System.out.println("Area:" + this.area());
	}
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
}