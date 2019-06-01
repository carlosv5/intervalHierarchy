package tdd.intervalHierarchy;

public class UntilEndpoint extends Point {

	public UntilEndpoint(double value, boolean isClosed) {
		super(value, isClosed);
	}

	public boolean isAtRight(Point point) {
		if (Double.isNaN(this.value)) {
			return true;
		}
		if (this.value > point.getValue() || isTheSame(point)) {
			return true;
		}
		return false;
	}
}
