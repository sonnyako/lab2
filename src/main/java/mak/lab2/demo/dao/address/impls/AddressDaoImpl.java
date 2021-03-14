package mak.lab2.demo.dao.address.impls;

import mak.lab2.demo.dao.address.interfaces.IAddressDao;
import mak.lab2.demo.data.FakeData;
import mak.lab2.demo.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author sonnyako <Makydon Sofiia>
 * @version 1.0.0
 * @since 1.0.0
 */
@Repository
public class AddressDaoImpl implements IAddressDao {

    @Autowired
    FakeData fakeData;

    @Override
    public Address getById(String id) {
        return this.getAll().stream()
            .filter(address -> address.getId().equals(id))
            .findFirst().orElse(null);
    }

    @Override
    public Address create(Address address) {
        String id=String.valueOf(this.getAll().stream()
            .mapToInt(value ->Integer.valueOf(value.getId())).max().orElse(0)+1);
        address.setId(id);
        this.getAll().add(address);
        return address;
    }

    @Override
    public Address update(Address address) {
        this.delete(address.getId());
        this.getAll().add(address);
        return address;
    }

    @Override
    public Address delete(String id) {
        Address address = this.getById(id);
        this.getAll().remove(address);
        return address;
    }

    @Override
    public List<Address> getAll() {
        return fakeData.getAddresses();
    }
}
