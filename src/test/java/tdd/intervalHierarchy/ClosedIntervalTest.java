package tdd.intervalHierarchy;

import org.junit.Test;

import junit.framework.TestCase;

public class ClosedIntervalTest extends TestCase {

	@Test
	public void testIsIntersectedOverlapingByLeft() {
		OpenedInterval one = new ClosedIntervalBuilder().min(3).max(14).build();
		OpenedInterval another = new ClosedIntervalBuilder().min(1).max(7).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByLeftWithEquals() {
		OpenedInterval one = new ClosedIntervalBuilder().min(3).max(14).build();
		OpenedInterval another = new ClosedIntervalBuilder().min(3).max(7).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByEquals() {
		OpenedInterval one = new ClosedIntervalBuilder().min(3).max(14).build();
		OpenedInterval another = new ClosedIntervalBuilder().min(3).max(14).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByRight() {
		OpenedInterval one = new ClosedIntervalBuilder().min(3).max(14).build();
		OpenedInterval another = new ClosedIntervalBuilder().min(7).max(17).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByBoth() {
		OpenedInterval one = new ClosedIntervalBuilder().min(3).max(14).build();
		OpenedInterval another = new ClosedIntervalBuilder().min(0).max(17).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByInside() {
		OpenedInterval one = new ClosedIntervalBuilder().min(3).max(14).build();
		OpenedInterval another = new ClosedIntervalBuilder().min(5).max(10).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingByLeft() {
		OpenedInterval one = new ClosedIntervalBuilder().min(3).max(14).build();
		OpenedInterval another = new ClosedIntervalBuilder().min(0).max(2).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingByRight() {
		OpenedInterval one = new ClosedIntervalBuilder().min(3).max(14).build();
		OpenedInterval another = new ClosedIntervalBuilder().min(16).max(22).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByLeftOnePoint() {
		OpenedInterval one = new ClosedIntervalBuilder().min(5).max(14).build();
		OpenedInterval another = new ClosedIntervalBuilder().min(2).max(5).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByRightOnePoint() {
		OpenedInterval one = new ClosedIntervalBuilder().min(3).max(14).build();
		OpenedInterval another = new ClosedIntervalBuilder().min(14).max(22).build();
		assertTrue(one.isIntersected(another));
	}
	
	
}
