package generators.byiterator;

import java.util.Iterator;

/**
 * Present effort
 * 
 * @author richard
 */
public class Counter implements Iterator<Integer> {

	public static Iterable<Integer> from(final int initial) {
		return new Iterable<Integer>() {
			public Iterator<Integer> iterator() {
				return new Counter(initial);
			}
		};
	}

	private int counter;

	public Counter(final int counter) {
		this.counter = counter;
	}

	public boolean hasNext() {
		return counter < Integer.MAX_VALUE;
	}

	public Integer next() {
		return counter++;
	}

	public void remove() {
		throw new UnsupportedOperationException("Unable to remove a number");
	}

}
