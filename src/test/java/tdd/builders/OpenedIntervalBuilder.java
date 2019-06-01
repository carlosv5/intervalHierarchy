package tdd.builders;

import tdd.intervalHierarchy.Interval;

public class OpenedIntervalBuilder {

	private IntervalBuilder intervalBuilder;

	public OpenedIntervalBuilder() {
		this.intervalBuilder = new IntervalBuilder();
	}

	public OpenedIntervalBuilder min(double min) {
		this.intervalBuilder.min(min);
		return this;
	}

	public OpenedIntervalBuilder max(double max) {
		this.intervalBuilder.max(max);
		return this;
	}

	public Interval build() {
		return intervalBuilder.build();
	}
}
