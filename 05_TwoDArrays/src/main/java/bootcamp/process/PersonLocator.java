package bootcamp.process;

import bootcamp.data.Location;
import bootcamp.data.Person;

import java.util.Arrays;
import java.util.Optional;

public class PersonLocator {
    private final Person[][] people;

    //TODO Constructor
    public PersonLocator(Person[][] people) {
        this.people = people;
    }

    public Optional<Location> find(final Person personToFind) {
        Location location = null;


            for (Person[] arr : people) {
                for (Person person : arr)
                    if (personToFind.equals(person)) {
                        location = new Location(Arrays.asList(people).indexOf(arr), Arrays.asList(arr).indexOf(person));
                        break;
                    }
        }

         return Optional.ofNullable(location);

        }
    }

