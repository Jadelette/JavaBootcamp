package bootcamp.directory;

import bootcamp.data.Address;
import bootcamp.data.Person;
import bootcamp.data.PersonAddressPair;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class AddressDirectory {
    private final Map<Person, Address> directory = null; //FIXME

    public AddressDirectory(final List<PersonAddressPair> addressList) {
        //TODO convert addressList to a TreeMap assigned to directory.
    }

    public Optional<Address> getAddress(final Person person) {
        //FIXME
        return null;
    }

    public void updateAddress(final PersonAddressPair personAddress) {
        //FIXME
    }

    public void remove(final Person person) {
        //FIXME
    }
}
