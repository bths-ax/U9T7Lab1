public class Point {
	private String label;
	private int x;
	private int y;

	public Point(String label, int x, int y) {
		this.label = label;
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return String.format("Point %s is at x = %d, y = %d", label, x, y);
	}

	public boolean equals(Point other) {
		return other != null && this.x == other.x && this.y == other.y;
	}
}
