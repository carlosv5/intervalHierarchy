package tdd.builders;

import tdd.intervalHierarchy.UntilEndpoint;

public class UntilEndpointBuilder {

	private double value;
		
	private boolean isClosed;
	
	
	public UntilEndpointBuilder(){
		this.value = Double.NaN;
		this.isClosed = false;
	}
	
	public UntilEndpointBuilder value(double value) {
		this.value = value;
		return this;
	}
	
	public UntilEndpointBuilder closed() {
		this.isClosed = true;
		return this;
	}
	
	public UntilEndpoint build() {
		return new UntilEndpoint(value, isClosed);
	}
	
	public double getValue() {
		return value;
	}
}
