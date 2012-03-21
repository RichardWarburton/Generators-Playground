package generators.byinterface;

import static com.google.common.collect.Maps.immutableEntry;

import java.util.Map.Entry;

public class VerboseCounter implements Generator<Integer, Integer> {

	public static Iterable<Integer> from(final Integer initial) {
		return Generators.from(new VerboseCounter(), initial);
	}

	public Entry<Integer, Integer> step(final Integer s) {
		return immutableEntry(s, s + 1);
	}

}
