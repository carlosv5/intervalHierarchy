package tdd.intervalHierarchy;

public abstract class Interval {
	
	protected double min;
	protected double max;
	
	protected Interval(double min, double max) {
		this.min = min;
		this.max = max;
	}
	
	protected boolean isIntersected(Interval another) {
		return this.isIncluded(another.min) ||
				this.isIncluded(another.max)||
				another.isIncluded(this.min);
	}

	protected boolean isIncluded(double value) {
		return this.min < value && value < this.max;
	}

}