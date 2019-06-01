package tdd.intervalHierarchy;

public class OpenedIntervalBuilder {

	private IntervalBuilder intervalBuilder;
	
	OpenedIntervalBuilder(){
		this.intervalBuilder = new IntervalBuilder();
	}
	
	OpenedIntervalBuilder min(double min) {
		this.intervalBuilder.min(min);
		return this;
	}

	OpenedIntervalBuilder max(double max) {
		this.intervalBuilder.max(max);
		return this;
	}
	
	Interval build() {
		return intervalBuilder.build();
	}	
}
