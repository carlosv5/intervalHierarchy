package tdd.intervalHierarchy;

public class ClosedIntervalBuilder {

	private double min;
	
	private double max;
	
	private boolean isClosed;
	
	ClosedIntervalBuilder(){
		this.min = 0;
		this.max = 1;
		this.isClosed = true;
	}
	
	ClosedIntervalBuilder min(double min) {
		this.min = min;
		return this;
	}

	ClosedIntervalBuilder max(double max) {
		this.max = max;
		return this;
	}
	
	Interval build() {
		assert min <= max;
		return new Interval(min, max, isClosed);
	}

	
}
