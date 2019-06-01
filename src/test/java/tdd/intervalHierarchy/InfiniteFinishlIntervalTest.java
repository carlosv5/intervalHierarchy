package tdd.intervalHierarchy;

import org.junit.Test;

import junit.framework.TestCase;
import tdd.builders.ClosedIntervalBuilder;
import tdd.builders.IntervalBuilder;
import tdd.builders.OpenedIntervalBuilder;

public class InfiniteFinishlIntervalTest extends TestCase {
	
	@Test
	public void testIsIntersectedInfiniteUntilIntervalsWithOpenCloseInterval() {
		Interval infiniteFinishInterlval1 = new IntervalBuilder().min(0).maxClosed().build();
		Interval interval2 = new IntervalBuilder().min(1).max(10).maxClosed().build();
		assertTrue(infiniteFinishInterlval1.isIntersected(interval2));
	}
	
}
