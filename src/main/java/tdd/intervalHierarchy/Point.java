package tdd.intervalHierarchy;

public class Point {
	
	private double value;
	private boolean isClosed;
	
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
	
	public boolean isAtRight(Point point) {
		if(this.value > point.getValue() || isTheSame(point)) {
			return true;
		}
		return false;
	}
	
	public boolean isAtLeft(Point point) {
		if(this.value < point.getValue() || isTheSame(point) ) {
			return true;
		}
		return false;
	}
	
	public boolean isTheSame(Point point) {
		return this.isClosed && point.getIsClosed() && this.value == point.getValue();
	}

}
