public class Vector3D {
	private double x;
	private double y;
	private double z;

	public Vector3D (double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public static Vector3D sum (Vector3D v1, Vector3D v2) {
		return new Vector3D(v1.getX() + v2.getX(), v1.getY() + v2.getY(), v1.getZ() + v2.getZ());
	}

	public static double skalarProduct (Vector3D v1, Vector3D v2) {
		return v1.getX() * v2.getX() + v1.getY() * v2.getY() + v1.getZ() * v2.getZ();
	}

	public static Vector3D vectorProduct (Vector3D v1, Vector3D v2) {
		double mX = v1.getY() * v2.getZ() - v1.getZ() * v2.getY();
		double mY = v1.getZ() * v2.getX() - v1.getX() * v2.getZ();
		double mZ = v1.getX() * v2.getY() - v1.getY() * v2.getX();
		return new Vector3D (mX, mY, mZ);
	}

	static public void info(Vector3D v, String message) {
		System.out.println(message + " vector coordinates: " + v.getX() + ", " + v.getY() + ", " + v.getZ());
	}
	
}
