package tdd.intervalHierarchy;

public class Point {
	
	private double value;
	private boolean isClosed;
	private boolean isFrom;
	
	protected Point(double value, boolean isClosed, boolean isFrom) {
		this.value = value;
		this.isClosed = isClosed;
		this.isFrom = isFrom;
	}
	
	public double getValue() {
		return value;
	}
	public void setPoint(int point) {
		this.value = point;
	}
	public boolean getIsClosed() {
		return isClosed;
	}
	public void setIsClosed(boolean isClosed) {
		this.isClosed = isClosed;
	}
	public boolean getisFrom() {
		return this.isFrom;
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
