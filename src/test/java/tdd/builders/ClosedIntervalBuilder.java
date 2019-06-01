package tdd.builders;

import tdd.intervalHierarchy.Interval;

public class ClosedIntervalBuilder {

	private IntervalBuilder intervalBuilder;

	public ClosedIntervalBuilder() {
		this.intervalBuilder = new IntervalBuilder();
	}

	public ClosedIntervalBuilder min(double min) {
		this.intervalBuilder.min(min);
		return this;
	}

	public ClosedIntervalBuilder max(double max) {
		this.intervalBuilder.max(max);
		return this;
	}

	public Interval build() {
		return intervalBuilder.minClosed().maxClosed().build();
	}

}
