package tdd.intervalHierarchy;

public class FromEndpoint extends Point{

	public FromEndpoint(double value, boolean isClosed) {
		super(value, isClosed);
	}
	
	public boolean isAtLeft(Point point) {
		if(Double.isNaN(this.value)) {
			return true;
		}
		if(this.value < point.getValue() || isTheSame(point) ) {
			return true;
		}
		return false;
	}	
}
