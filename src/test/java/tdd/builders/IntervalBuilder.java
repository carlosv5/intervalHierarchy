package tdd.builders;

import tdd.intervalHierarchy.FromEndpoint;
import tdd.intervalHierarchy.Interval;
import tdd.intervalHierarchy.UntilEndpoint;

public class IntervalBuilder {
	
	private FromEndpointBuilder fromEndpointBuilder;
	
	private UntilEndpointBuilder untilEndpointBuilder;

	public IntervalBuilder(){
		this.fromEndpointBuilder = new FromEndpointBuilder();
		this.untilEndpointBuilder = new UntilEndpointBuilder();
	}
	
	public IntervalBuilder min(double min) {
		this.fromEndpointBuilder.value(min);
		return this;
	}

	public IntervalBuilder max(double max) {
		this.untilEndpointBuilder.value(max);
		return this;
	}
	
	public IntervalBuilder minClosed() {
		this.fromEndpointBuilder.closed();
		return this;
	}
	
	public IntervalBuilder maxClosed() {
		this.untilEndpointBuilder.closed();
		return this;
	}
	
	public Interval build() {
		assert fromEndpointBuilder.getValue() <= untilEndpointBuilder.getValue();
		return new Interval(fromEndpointBuilder.build(), untilEndpointBuilder.build());
	}

	
}
