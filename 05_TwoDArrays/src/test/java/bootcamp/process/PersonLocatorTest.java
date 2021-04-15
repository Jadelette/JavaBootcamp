package bootcamp.process;

import bootcamp.data.Location;
import bootcamp.data.Person;
import org.junit.Before;
import org.junit.Test;
import java.util.Optional;
import static org.junit.Assert.*;

public class PersonLocatorTest {
    Person[][] people = {
            {new Person("Bob", "Marley"), new Person("David", "Bowie"), new Person("Freddie","Mercury")},
            {new Person("Mickey", "Mouse"), new Person("Donald", "Duck"), new Person("Roger", "Rabbit")},
            {new Person("Woody", "Harrelson"), new Person("Bill", "Murray"), new Person("Jeff", "Bridges")}
    };

    PersonLocator personaLocator;

   @Before
    public void setUp() {
    personaLocator = new PersonLocator(people);
   }

    @Test
    public void shouldReturnCorrectLocationIfPersonIsPresent() {
        Optional<Location> expectedResult = Optional.of( new Location(0, 2));

        Optional<Location> result = personaLocator.find(new Person("Freddie", "Mercury"));

        assertTrue(result.isPresent());
        assertEquals(expectedResult, result);

    }

    @Test
    public void shouldNotReturnALocationIfNameNotFound() {
        Optional<Location> result = personaLocator.find(new Person("Eddie", "Murphy"));

        assertTrue(result.isEmpty());
    }
}
