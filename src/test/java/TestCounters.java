import generators.byinterface.Counter8;
import generators.byinterface.VerboseCounter;
import generators.byiterator.Counter;

import org.junit.Test;

/**
 * Tests don't show correctness, just api play
 * 
 * @author richard
 */
public class TestCounters {

	@Test
	public void byiterator() {
		for (final int value : Counter.from(2)) {
			System.out.println(value);
		}
	}

	@Test
	public void byinterface() {
		for (final int value : Counter8.from(2)) {
			System.out.println(value);
		}
	}

	@Test
	public void byinterfaceverbose() {
		for (final int value : VerboseCounter.from(2)) {
			System.out.println(value);
		}
	}

}
