package tdd.intervalHierarchy;

import org.junit.Test;

import junit.framework.TestCase;
import tdd.builders.ClosedIntervalBuilder;
import tdd.builders.IntervalBuilder;
import tdd.builders.OpenedIntervalBuilder;

public class mixedInfiniteIntervalTest extends TestCase {

	@Test
	public void testIsIntersectedInfiniteIntervalsWithOtherInterval() {
		Interval infiniteInterlval1 = new IntervalBuilder().build();
		Interval another = new IntervalBuilder().min(0).max(12).maxClosed().build();
		assertTrue(infiniteInterlval1.isIntersected(another));
	}

	@Test
	public void testIsIntersectedInfiniteIntervals() {
		Interval infiniteInterlval1 = new IntervalBuilder().build();
		assertTrue(infiniteInterlval1.isIntersected(infiniteInterlval1));
	}

}
