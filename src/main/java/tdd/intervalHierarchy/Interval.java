package tdd.intervalHierarchy;

public class Interval {
	
	private Point fromEndpoint;
	private Point untilEndpoint;

	public Interval(double min, double max, boolean minIsClosed, boolean maxIsClosed) {
		this.fromEndpoint = new Point(min, minIsClosed, true);
		this.untilEndpoint = new Point(max, maxIsClosed, false);

	}

	public boolean isIntersected(Interval another) {
		return  this.isTheSame(another) || this.isIncluded( another.getFromEndpoint()) ||
				this.isIncluded(another.getUntilEndpoint())||
				another.isIncluded(this.getFromEndpoint());
	}

	public boolean isIncluded(Point another) {
		return this.fromEndpoint.isAtLeft(another) && this.untilEndpoint.isAtRight(another);
	}
	
	public Point getFromEndpoint() {
		return this.fromEndpoint;
	}
	
	public Point getUntilEndpoint() {
		return this.untilEndpoint;
	}
	

	public boolean isTheSame(Interval another) {
		return this.getFromEndpoint().getValue() == another.getFromEndpoint().getValue() && this.getUntilEndpoint().getValue() == another.getUntilEndpoint().getValue();
	}

}