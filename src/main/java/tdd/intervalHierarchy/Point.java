package tdd.intervalHierarchy;

public class Point {

	protected double value;
	protected boolean isClosed;

	protected Point(double value, boolean isClosed) {
		this.value = value;
		this.isClosed = isClosed;
	}

	public double getValue() {
		return value;
	}

	public boolean getIsClosed() {
		return isClosed;
	}

	public boolean isTheSame(Point point) {
		return this.isClosed && point.getIsClosed() && this.value == point.getValue();
	}

}
