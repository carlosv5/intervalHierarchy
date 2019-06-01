package tdd.intervalHierarchy;

import org.junit.Test;

import junit.framework.TestCase;
import tdd.builders.ClosedIntervalBuilder;
import tdd.builders.IntervalBuilder;
import tdd.builders.OpenedIntervalBuilder;

public class InfiniteFinishlIntervalTest extends TestCase {

	@Test
	public void testIsIntersectedInfiniteFinishIntervalsWithOpenCloseInterval() {
		Interval infiniteFinishInterlval1 = new IntervalBuilder().min(0).build();
		Interval interval2 = new IntervalBuilder().min(1).max(10).maxClosed().build();
		assertTrue(infiniteFinishInterlval1.isIntersected(interval2));
	}

	@Test
	public void testIsIntersectedInfiniteFinishIntervalsWithOpenInterval() {
		Interval infiniteFinishInterlval1 = new IntervalBuilder().min(0).build();
		Interval interval2 = new IntervalBuilder().min(1).max(10).build();
		assertTrue(infiniteFinishInterlval1.isIntersected(interval2));
	}

	@Test
	public void testIsIntersectedInfiniteFinishIntervalsWithCloseInterval() {
		Interval infiniteFinishInterlval1 = new IntervalBuilder().min(0).build();
		Interval interval2 = new IntervalBuilder().min(1).max(10).minClosed().maxClosed().build();
		assertTrue(infiniteFinishInterlval1.isIntersected(interval2));
	}

	@Test
	public void testIsIntersectedInfiniteFinishIntervalsInside() {
		Interval infiniteFinishInterlval1 = new IntervalBuilder().min(0).build();
		Interval infiniteFinishInterlval2 = new IntervalBuilder().min(5).build();
		assertTrue(infiniteFinishInterlval1.isIntersected(infiniteFinishInterlval2));
	}

	@Test
	public void testIsIntersectedInfiniteFinishIntervalsWithTheSameStartPoint() {
		Interval infiniteFinishInterlval1 = new IntervalBuilder().min(0).minClosed().build();
		Interval infiniteFinishInterlval2 = new IntervalBuilder().min(0).minClosed().build();
		assertTrue(infiniteFinishInterlval1.isIntersected(infiniteFinishInterlval2));
	}

	@Test
	public void testIsIntersectedInfiniteFinishIntervalsNegativesValue() {
		Interval infiniteFinishInterlval1 = new IntervalBuilder().min(-12).build();
		Interval infiniteFinishInterlval2 = new IntervalBuilder().max(-10).build();
		assertTrue(infiniteFinishInterlval1.isIntersected(infiniteFinishInterlval2));
	}

}
