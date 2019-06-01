package tdd.intervalHierarchy;

import org.junit.Test;

import junit.framework.TestCase;
import tdd.builders.ClosedIntervalBuilder;
import tdd.builders.OpenedIntervalBuilder;

public class OpenedAndCloseIntervals extends TestCase {

	@Test
	public void testIsIntersectedOverlapingByLeftWithEquals() {
		Interval open = new OpenedIntervalBuilder().min(3).max(14).build();
		Interval close = new ClosedIntervalBuilder().min(3).max(7).build();
		assertTrue(open.isIntersected(close));
	}

	@Test
	public void testIsIntersectedOverlapingByRigthWithEquals() {
		Interval open = new OpenedIntervalBuilder().min(8).max(14).build();
		Interval close = new ClosedIntervalBuilder().min(9).max(14).build();
		assertTrue(open.isIntersected(close));
	}

	@Test
	public void testIsIntersectedOverlapingByEquals() {
		Interval open = new OpenedIntervalBuilder().min(3).max(14).build();
		Interval close = new ClosedIntervalBuilder().min(3).max(14).build();
		assertTrue(open.isIntersected(close));
	}

	@Test
	public void testIsNotIntersectedOverlapingByLeftOnePoint() {
		Interval open = new OpenedIntervalBuilder().min(5).max(14).build();
		Interval close = new ClosedIntervalBuilder().min(2).max(5).build();
		assertFalse(open.isIntersected(close));
	}

	@Test
	public void testIsNotIntersectedOverlapingByRightOnePoint() {
		Interval open = new OpenedIntervalBuilder().min(3).max(14).build();
		Interval close = new ClosedIntervalBuilder().min(14).max(22).build();
		assertFalse(open.isIntersected(close));
	}

}
