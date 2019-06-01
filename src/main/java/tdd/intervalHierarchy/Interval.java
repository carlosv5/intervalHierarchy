package tdd.intervalHierarchy;

public class Interval {

	private FromEndpoint fromEndpoint;
	private UntilEndpoint untilEndpoint;

	public Interval(FromEndpoint fromEndpoint, UntilEndpoint untilEndpoint) {
		this.fromEndpoint = fromEndpoint;
		this.untilEndpoint = untilEndpoint;

	}

	public boolean isIntersected(Interval another) {
		return this.isTheSame(another) || fulfillIncludeConditions(another);
	}

	private boolean fulfillIncludeConditions(Interval another) {
		return this.isIncluded(another.getFromEndpoint()) || this.isIncluded(another.getUntilEndpoint())
				|| another.isIncluded(this.getFromEndpoint()) || another.isIncluded(this.getUntilEndpoint());
	}

	private boolean isIncluded(Point another) {
		return this.fromEndpoint.isAtLeft(another) && this.untilEndpoint.isAtRight(another);
	}

	public Point getFromEndpoint() {
		return this.fromEndpoint;
	}

	public Point getUntilEndpoint() {
		return this.untilEndpoint;
	}

	public boolean isTheSame(Interval another) {
		return this.getFromEndpoint().getValue() == another.getFromEndpoint().getValue()
				&& this.getUntilEndpoint().getValue() == another.getUntilEndpoint().getValue();
	}

}