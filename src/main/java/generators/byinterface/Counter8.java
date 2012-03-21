package generators.byinterface;

import static com.google.common.collect.Maps.immutableEntry;

import java.util.Map.Entry;

/**
 * 
 * @author richard
 */
public class Counter8 {

	public static Iterable<Integer> from(final Integer initial) {
		return Generators.from(new Generator<Integer, Integer>() {
			public Entry<Integer, Integer> step(final Integer s) {
				return immutableEntry(s, s + 1);
			}
		}, initial);
		// If you assuming lambdas exist, then you can write:
		// return Generators.from(s -> immutableEntry(s,s++), initial);
	}
}
