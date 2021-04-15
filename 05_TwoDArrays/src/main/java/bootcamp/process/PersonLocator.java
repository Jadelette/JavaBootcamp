package bootcamp.process;

import bootcamp.data.Location;
import bootcamp.data.Person;

import java.util.Arrays;
import java.util.Optional;

public class PersonLocator {
  private final Person[][] people;

  public PersonLocator(Person[][] people) {
    this.people = people;
  }

  public Optional<Location> find(final Person personToFind) {
    Location location = null;
    for (Person[] personArr : people) {
      for (Person person : personArr)
        if (personToFind.equals(person)) {
          location = new Location(
              Arrays.asList(people).indexOf(personArr),
              Arrays.asList(personArr).indexOf(person)
          );
          break;
        }
    }

    return Optional.ofNullable(location);
  }
}

