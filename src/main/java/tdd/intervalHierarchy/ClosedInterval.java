package tdd.intervalHierarchy;

public class ClosedInterval extends OpenedInterval{

	public ClosedInterval(double min, double max) {
		super(min,max);
	}

	public boolean isIntersected(OpenedInterval another) {
		return super.isIntersected(another);
	}

	@Override
	protected boolean isIncluded(double value) {
		return super.isIncluded(value) || this.min == value || value == this.max;
	}

}
