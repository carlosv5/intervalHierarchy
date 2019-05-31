package tdd.intervalHierarchy;

public class OpenedInterval {
	
	protected double min;
	protected double max;
	protected boolean isClosed;


	public OpenedInterval(double min, double max, boolean isClosed) {
		this.min = min;
		this.max = max;
		this.isClosed = isClosed;
	}

	public boolean isIntersected(OpenedInterval another) {
		return this.isTheSame(another) || this.isIncluded(another.min) ||
				this.isIncluded(another.max)||
				another.isIncluded(this.min);
	}

	protected boolean isIncluded(double value) {
		if(isClosed) {
			return (this.min < value && value < this.max) || this.min == value || value == this.max;
		}
		return (this.min < value) && (value < this.max);
	}
	
	public boolean isTheSame(OpenedInterval another) {
		return this.min == another.min && this.max == another.max;
	}

}