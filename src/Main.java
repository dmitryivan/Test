
public class Main {

	public static void main(String[] args) {
		
		Triangle t1 = new Triangle(3, 3, 3);
		t1.printArea();
        
		Vector3D v1=new Vector3D(3, 4, 1);
		Vector3D.info(v1, "Initial");
		
		Vector3D v2=new Vector3D(4, 5, 6);
		Vector3D.info(v2, "Initial");
		
		Vector3D v3 = Vector3D.sum(v1, v2);
		Vector3D.info(v1, "After sum-");
		
		v3 = Vector3D.vectorProduct(v1, v2);
		Vector3D.info(v3, "After vector product-");
		
		System.out.println("Skalar product (Vector 1 vs Vector 2): " + Vector3D.skalarProduct(v1, v2) );
	}

}
