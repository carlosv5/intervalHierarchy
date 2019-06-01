package tdd.intervalHierarchy;

import org.junit.Test;

import junit.framework.TestCase;
import tdd.builders.OpenedIntervalBuilder;

public class OpenedIntervalTest extends TestCase {

	@Test
	public void testIsIntersectedOverlapingByLeft() {
		Interval one = new OpenedIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenedIntervalBuilder().min(1).max(7).build();
		assertTrue(one.isIntersected(another));
	}

	@Test
	public void testIsIntersectedOverlapingByLeftWithEquals() {
		Interval one = new OpenedIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenedIntervalBuilder().min(3).max(7).build();
		assertTrue(one.isIntersected(another));
	}

	@Test
	public void testIsIntersectedOverlapingByRight() {
		Interval one = new OpenedIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenedIntervalBuilder().min(7).max(17).build();
		assertTrue(one.isIntersected(another));
	}

	@Test
	public void testIsIntersectedOverlapingByBoth() {
		Interval one = new OpenedIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenedIntervalBuilder().min(0).max(17).build();
		assertTrue(one.isIntersected(another));
	}

	@Test
	public void testIsIntersectedOverlapingByInside() {
		Interval one = new OpenedIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenedIntervalBuilder().min(5).max(10).build();
		assertTrue(one.isIntersected(another));
	}

	@Test
	public void testIsTheSame() {
		Interval one = new OpenedIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenedIntervalBuilder().min(3).max(14).build();
		assertTrue(one.isTheSame(another));
	}

	@Test
	public void testIsIntersectedOverlapingByEquals() {
		Interval one = new OpenedIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenedIntervalBuilder().min(3).max(14).build();
		assertTrue(one.isIntersected(another));
	}

	@Test
	public void testIsNotTheSameInRight() {
		Interval one = new OpenedIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenedIntervalBuilder().min(0).max(3).build();
		assertFalse(one.isTheSame(another));
	}

	@Test
	public void testIsIntersectedNotOverlapingByLeft() {
		Interval one = new OpenedIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenedIntervalBuilder().min(0).max(3).build();
		assertFalse(one.isIntersected(another));
	}

	@Test
	public void testIsNotTheSameInLeft() {
		Interval one = new OpenedIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenedIntervalBuilder().min(14).max(22).build();
		assertFalse(one.isTheSame(another));
	}

	@Test
	public void testIsIntersectedNotOverlapingByRight() {
		Interval one = new OpenedIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenedIntervalBuilder().min(14).max(22).build();
		assertFalse(one.isIntersected(another));
	}

	@Test
	public void testIsIntersectedOverlapingByLeftOnePoint() {
		Interval one = new OpenedIntervalBuilder().min(5).max(14).build();
		Interval another = new OpenedIntervalBuilder().min(2).max(5).build();
		assertFalse(one.isIntersected(another));
	}

	@Test
	public void testIsIntersectedOverlapingByRightOnePoint() {
		Interval one = new OpenedIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenedIntervalBuilder().min(14).max(22).build();
		assertFalse(one.isIntersected(another));
	}

	@Test
	public void testIsNotIntersectedOverlapingByLeftOnePoint() {
		Interval one = new OpenedIntervalBuilder().min(5).max(14).build();
		Interval another = new OpenedIntervalBuilder().min(2).max(5).build();
		assertFalse(one.isIntersected(another));
	}

	@Test
	public void testIsNotIntersectedOverlapingByRightOnePoint() {
		Interval one = new OpenedIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenedIntervalBuilder().min(14).max(22).build();
		assertFalse(one.isIntersected(another));
	}

}
