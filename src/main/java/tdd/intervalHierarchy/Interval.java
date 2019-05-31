package tdd.intervalHierarchy;

public class Interval {
	
	private double min;
	private double max;
	private boolean isClosed;


	public Interval(double min, double max, boolean isClosed) {
		this.min = min;
		this.max = max;
		this.isClosed = isClosed;
	}

	public boolean isIntersected(Interval another) {
		return this.isTheSame(another) || this.isIncluded(another.min, another.isClosed) ||
				this.isIncluded(another.max, another.isClosed)||
				another.isIncluded(this.min, this.isClosed);
	}

	public boolean isIncluded(double value, boolean valueClosed) {
		if(this.isClosed && valueClosed) {
			return this.min <= value && value <= this.max;
		} else  {
			return this.min < value && value < this.max;
		}
	}
	
	public boolean isTheSame(Interval another) {
		return this.min == another.min && this.max == another.max;
	}

}