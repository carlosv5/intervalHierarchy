package tdd.intervalHierarchy;

import org.junit.Test;

import junit.framework.TestCase;
import tdd.builders.ClosedIntervalBuilder;
import tdd.builders.IntervalBuilder;
import tdd.builders.OpenedIntervalBuilder;

public class InfiniteStartlIntervalTest extends TestCase {
	
	@Test
	public void testIsIntersectedInfiniteUntilIntervalsWithOpenCloseInterval() {
		Interval infiniteUntilInterlval1 = new IntervalBuilder().max(12).maxClosed().build();
		Interval interval2 = new IntervalBuilder().min(1).max(10).maxClosed().build();
		assertTrue(infiniteUntilInterlval1.isIntersected(interval2));
	}
	
	@Test
	public void testIsIntersectedInfiniteUntilIntervalsWithOpenInterval() {
		Interval infiniteUntilInterlval1 = new IntervalBuilder().max(12).maxClosed().build();
		Interval interval2 = new IntervalBuilder().min(1).max(10).build();
		assertTrue(infiniteUntilInterlval1.isIntersected(interval2));
	}
	
	@Test
	public void testIsIntersectedInfiniteUntilIntervalsWithCloseInterval() {
		Interval infiniteUntilInterlval1 = new IntervalBuilder().max(12).maxClosed().build();
		Interval interval2 = new IntervalBuilder().min(1).max(10).minClosed().maxClosed().build();
		assertTrue(infiniteUntilInterlval1.isIntersected(interval2));
	}
	
	@Test
	public void testIsIntersectedInfiniteUntilIntervalsInside() {
		Interval infiniteUntilInterlval1 = new IntervalBuilder().max(15).maxClosed().build();
		Interval infiniteUntilInterlval2 = new IntervalBuilder().max(10).maxClosed().build();
		assertTrue(infiniteUntilInterlval1.isIntersected(infiniteUntilInterlval2));
	}
	
	@Test
	public void testIsIntersectedInfiniteUntilIntervalsInRight() {
		Interval infiniteUntilInterlval1 = new IntervalBuilder().max(10).maxClosed().build();
		Interval infiniteUntilInterlval2 = new IntervalBuilder().max(12).maxClosed().build();
		assertTrue(infiniteUntilInterlval1.isIntersected(infiniteUntilInterlval2));
	}
	
	@Test
	public void testIsIntersectedInfiniteUntilIntervalsWithTheSameFinishPoint() {
		Interval infiniteUntilInterlval1 = new IntervalBuilder().max(12).maxClosed().build();
		Interval infiniteUntilInterlval2 = new IntervalBuilder().max(12).maxClosed().build();
		assertTrue(infiniteUntilInterlval1.isIntersected(infiniteUntilInterlval2));
	}
	
	@Test
	public void testIsIntersectedInfiniteUntilIntervalsOneHasNegativeValue() {
		Interval infiniteUntilInterlval1 = new IntervalBuilder().max(12).maxClosed().build();
		Interval infiniteUntilInterlval2 = new IntervalBuilder().max(-10).maxClosed().build();
		assertTrue(infiniteUntilInterlval1.isIntersected(infiniteUntilInterlval2));
	}
}
