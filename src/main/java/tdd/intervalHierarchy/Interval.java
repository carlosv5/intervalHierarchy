package tdd.intervalHierarchy;

public class Interval {
	
	protected double min;
	protected double max;
	protected boolean isClosed;


	public Interval(double min, double max, boolean isClosed) {
		this.min = min;
		this.max = max;
		this.isClosed = isClosed;
	}

	public boolean isIntersected(Interval another) {
		return this.isTheSame(another) || this.isIncluded(another.min) ||
				this.isIncluded(another.max)||
				another.isIncluded(this.min);
	}

	protected boolean isIncluded(double value) {
		return isClosed && (this.min <= value && value <= this.max) || (this.min < value) && (value < this.max);
	}
	
	public boolean isTheSame(Interval another) {
		return this.min == another.min && this.max == another.max;
	}

}