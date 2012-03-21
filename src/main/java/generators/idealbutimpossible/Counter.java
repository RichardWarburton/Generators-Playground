package generators.idealbutimpossible;

public class Counter {

	/**
	 * This is in a library somewhere
	 * 
	 * @param o
	 */
	static void yield(final Object o) {

	}

	/**
	 * This is what I wish to be able to write, but its impossible to
	 */
	public static Iterable<Integer> from(final int initial) {
		int i = initial;
		while (i < Integer.MAX_VALUE) {
			yield(i++);
		}
		// This shouldn't be required:
		return null;
	}

}
