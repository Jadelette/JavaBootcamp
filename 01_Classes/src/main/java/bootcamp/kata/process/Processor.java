/**
 * @author Omar Bashir
 */
package bootcamp.kata.process;

import bootcamp.kata.data.Params;
import bootcamp.kata.data.Results;

public class Processor {
    public Results process(final Params params) {
        Results results = new Results(params.getX(), params.getY());

        return results;
    }
}
