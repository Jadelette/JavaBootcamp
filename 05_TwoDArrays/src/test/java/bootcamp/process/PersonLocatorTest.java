package bootcamp.process;

import bootcamp.data.Location;
import bootcamp.data.Person;
import org.junit.Test;
import java.util.Optional;
import static org.junit.Assert.*;

public class PersonLocatorTest {

    @Test
    public void shouldReturnCorrectLocationIfPersonIsPresent() {
        //given
        Person[][] people = {
                {new Person("Bob", "Marley"), new Person("David", "Bowie"), new Person("Freddie","Mercury")},
                {new Person("Mickey", "Mouse"), new Person("Donald", "Duck"), new Person("Blinky", "Bill")},
                {new Person("Woody", "Harrelson"), new Person("Bill", "Murray"), new Person("Jeff", "Bridges")}
             };
        PersonLocator personaLocator = new PersonLocator(people);

        Location location = new Location(0, 2);
        Optional<Location> expectedResult = Optional.of(location);
        //when
        Optional<Location> result = personaLocator.find(new Person("Freddie", "Mercury"));

        //then
        assertTrue(result.isPresent());
        assertEquals(expectedResult, result);

    }

    @Test
    public void shouldNotReturnALocationIfNameNotFound() {
        //given
        Person[][] people = {
                {new Person("Bob", "Marley"), new Person("David", "Bowie"), new Person("Freddie","Mercury")},
                {new Person("Mickey", "Mouse"), new Person("Donald", "Duck"), new Person("Blinky", "Bill")},
                {new Person("Woody", "Harrelson"), new Person("Bill", "Murray"), new Person("Jeff", "Bridges")}
        };
        PersonLocator personaLocator = new PersonLocator(people);
        //when
        Optional<Location> result = personaLocator.find(new Person("Eddie", "Murphy"));
        //then
        assertTrue(result.isEmpty());
    }
}
