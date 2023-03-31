public class ThreeDPoint extends Point {
	private int z;

	public ThreeDPoint(String label, int x, int y, int z) {
		super(label, x, y);
		this.z = z;
	}

	public String toString() {
		return super.toString() + String.format(", z = %d", z);
	}

	// normally you dont inherit v3s from v2s bc of this sort of thing
	public boolean equals(Point other) { return false; }
	public boolean equals(ThreeDPoint other) {
		return super.equals(other) && this.z == other.z;
	}
}
