package tdd.intervalHierarchy;

import org.junit.Test;

import junit.framework.TestCase;
import tdd.builders.ClosedIntervalBuilder;
import tdd.builders.IntervalBuilder;
import tdd.builders.OpenedIntervalBuilder;

public class InfiniteStartlIntervalTest extends TestCase {
	
	@Test
	public void testIsIntersectedInfiniteUntilIntervalsInRight() {
		Interval infiniteUntilInterlval1 = new IntervalBuilder().max(15).maxClosed().build();
		Interval infiniteUntilInterlval2 = new IntervalBuilder().max(10).maxClosed().build();
		assertTrue(infiniteUntilInterlval1.isIntersected(infiniteUntilInterlval2));
	}

}
