package tdd.intervalHierarchy;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import tdd.builders.IntervalBuilder;

public class MixedIntervalTest {

	@Test
	public void testIsIntersectedOpenCloseWithCloseClose() {
		Interval openclose = new IntervalBuilder().min(3).max(14).maxClosed().build();
		Interval closeclose = new IntervalBuilder().min(2).max(7).minClosed().maxClosed().build();
		assertTrue(openclose.isIntersected(closeclose));
	}

	@Test
	public void testIsNotIntersectedOpenCloseWithCloseCloseOverlappingByOnePointInLeft() {
		Interval openclose = new IntervalBuilder().min(3).max(14).maxClosed().build();
		Interval closeclose = new IntervalBuilder().min(2).max(3).minClosed().maxClosed().build();
		assertFalse(openclose.isIntersected(closeclose));
	}

	@Test
	public void testIsIntersectedOpenCloseWithCloseCloseOverlappingByOnePointInRight() {
		Interval openclose = new IntervalBuilder().min(3).max(14).maxClosed().build();
		Interval closeclose = new IntervalBuilder().min(14).max(15).minClosed().maxClosed().build();
		assertTrue(openclose.isIntersected(closeclose));
	}

	@Test
	public void testIsNotIntersectedCloseOpenWithCloseCloseOverlappingByOnePointInRight() {
		Interval openclose = new IntervalBuilder().min(3).max(14).minClosed().build();
		Interval closeclose = new IntervalBuilder().min(14).max(15).minClosed().maxClosed().build();
		assertFalse(openclose.isIntersected(closeclose));
	}

	@Test
	public void testIsIntersectedCloseOpenWithCloseCloseOverlappingByOnePointInLeft() {
		Interval openclose = new IntervalBuilder().min(3).max(14).minClosed().build();
		Interval closeclose = new IntervalBuilder().min(1).max(3).minClosed().maxClosed().build();
		assertTrue(openclose.isIntersected(closeclose));
	}

	@Test
	public void testIsIntersectedCloseOpenWithCloseCloseOverlappingInside() {
		Interval openclose = new IntervalBuilder().min(3).max(14).minClosed().build();
		Interval closeclose = new IntervalBuilder().min(5).max(10).minClosed().maxClosed().build();
		assertTrue(openclose.isIntersected(closeclose));
	}

	@Test
	public void testIsIntersectedCloseOpenWithCloseCloseOverlappingOutside() {
		Interval openclose = new IntervalBuilder().min(3).max(14).minClosed().build();
		Interval closeclose = new IntervalBuilder().min(1).max(19).minClosed().maxClosed().build();
		assertTrue(openclose.isIntersected(closeclose));
	}

}
