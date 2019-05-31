package tdd.intervalHierarchy;

public class ClosedInterval extends Interval{

	public ClosedInterval(double min, double max) {
		super(min,max);
	}

	public boolean isIntersected(Interval another) {
		return super.isIntersected(another);
	}

	@Override
	protected boolean isIncluded(double value) {
		return super.isIncluded(value) || this.min == value || value == this.max;
	}

}
