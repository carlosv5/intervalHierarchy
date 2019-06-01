package tdd.builders;

import tdd.intervalHierarchy.Interval;

public class IntervalBuilder {

	private double min;
	
	private double max;
	
	private boolean minIsClosed;
	
	private boolean maxIsClosed;

	
	public IntervalBuilder(){
		this.min = 0;
		this.max = 1;
		this.minIsClosed = false;
		this.maxIsClosed = false;
	}
	
	public IntervalBuilder min(double min) {
		this.min = min;
		return this;
	}

	public IntervalBuilder max(double max) {
		this.max = max;
		return this;
	}
	
	public IntervalBuilder minClosed() {
		this.minIsClosed = true;
		return this;
	}
	
	public IntervalBuilder maxClosed() {
		this.maxIsClosed = true;
		return this;
	}
	
	public Interval build() {
		assert min <= max;
		return new Interval(min, max, minIsClosed, maxIsClosed);
	}

	
}
