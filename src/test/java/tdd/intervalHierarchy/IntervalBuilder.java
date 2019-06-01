package tdd.intervalHierarchy;

public class IntervalBuilder {

	private double min;
	
	private double max;
	
	private boolean minIsClosed;
	
	private boolean maxIsClosed;

	
	IntervalBuilder(){
		this.min = 0;
		this.max = 1;
		this.minIsClosed = false;
		this.maxIsClosed = false;
	}
	
	IntervalBuilder min(double min) {
		this.min = min;
		return this;
	}

	IntervalBuilder max(double max) {
		this.max = max;
		return this;
	}
	
	IntervalBuilder minClosed() {
		this.minIsClosed = true;
		return this;
	}
	
	IntervalBuilder maxClosed() {
		this.maxIsClosed = true;
		return this;
	}
	
	Interval build() {
		assert min <= max;
		return new Interval(min, max, minIsClosed, maxIsClosed);
	}

	
}
