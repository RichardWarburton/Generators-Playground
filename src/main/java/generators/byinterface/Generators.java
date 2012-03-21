package generators.byinterface;

import java.util.Iterator;
import java.util.Map.Entry;

public class Generators {

	public static <R, S> Iterable<R> from(final Generator<R, S> gen, final S initial) {
		return new Iterable<R>() {
			public Iterator<R> iterator() {
				return new Iterator<R>() {

					Entry<R, S> last = null;

					public boolean hasNext() {
						final S s = last == null ? initial : last.getValue();
						try {
							last = gen.step(s);
							return true;
						} catch (final RuntimeException e) {
							return false;
						}
					}

					public R next() {
						return last.getKey();
					}

					public void remove() {
						throw new UnsupportedOperationException("Unable to remove a number");
					}
				};
			}
		};
	}

}
