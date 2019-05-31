package tdd.intervalHierarchy;

public class OpenedInterval {
	
	protected double min;
	protected double max;

	public OpenedInterval(double min, double max) {
		this.min = min;
		this.max = max;
	}

	public boolean isIntersected(OpenedInterval another) {
		return this.isTheSame(another) || this.isIncluded(another.min) ||
				this.isIncluded(another.max)||
				another.isIncluded(this.min);
	}

	protected boolean isIncluded(double value) {
		return this.min < value && value < this.max;
	}
	
	public boolean isTheSame(OpenedInterval another) {
		return this.min == another.min && this.max == another.max;
	}

}
