package tdd.intervalHierarchy;

public class OpenedInterval extends Interval{

	public OpenedInterval(double min, double max) {
		super(min,max);
	}

	public boolean isIntersected(Interval another) {
		return super.isIntersected(another) || this.isTheSame(another);
	}

	protected boolean isIncluded(double value) {
		return this.min < value && value < this.max;
	}
	
	public boolean isTheSame(Interval another) {
		return this.min == another.min && this.max == another.max;
	}

}
