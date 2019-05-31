package tdd.intervalHierarchy;

public class OpenedIntervalBuilder {

	private double min;
	
	private double max;
	
	private boolean isClosed;
	
	OpenedIntervalBuilder(){
		this.min = 0;
		this.max = 1;
		this.isClosed = false;
	}
	
	OpenedIntervalBuilder min(double min) {
		this.min = min;
		return this;
	}

	OpenedIntervalBuilder max(double max) {
		this.max = max;
		return this;
	}
	
	Interval build() {
		assert min <= max;
		return new Interval(min, max, isClosed, isClosed);
	}

	
}
