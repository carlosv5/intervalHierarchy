package tdd.intervalHierarchy;

public class ClosedIntervalBuilder {
	
	private IntervalBuilder intervalBuilder;
	
	ClosedIntervalBuilder(){
		this.intervalBuilder = new IntervalBuilder();
	}
	
	ClosedIntervalBuilder min(double min) {
		this.intervalBuilder.min(min);
		return this;
	}

	ClosedIntervalBuilder max(double max) {
		this.intervalBuilder.max(max);
		return this;
	}
	
	Interval build() {
		return intervalBuilder.minClosed().maxClosed().build();
	}
	
}
