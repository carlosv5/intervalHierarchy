package tdd.builders;

import tdd.intervalHierarchy.FromEndpoint;

public class FromEndpointBuilder {

	private double value;
		
	private boolean isClosed;
	
	
	public FromEndpointBuilder(){
		this.value = 0;
		this.isClosed = false;
	}
	
	public FromEndpointBuilder value(double value) {
		this.value = value;
		return this;
	}
	
	public FromEndpointBuilder closed() {
		this.isClosed = true;
		return this;
	}
	
	public FromEndpoint build() {
		return new FromEndpoint(value, isClosed);
	}

	public double getValue() {
		return value;
	}
}
