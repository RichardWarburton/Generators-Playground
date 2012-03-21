package generators.byinterface;

import java.util.Map.Entry;

public interface Generator<R, S> {

	public Entry<R, S> step(S s);

}
