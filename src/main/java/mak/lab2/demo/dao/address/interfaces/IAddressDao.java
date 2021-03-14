package mak.lab2.demo.dao.address.interfaces;

import mak.lab2.demo.model.Address;

import java.util.List;

/**
 * @author sonnyako <Makydon Sofiia>
 * @version 1.0.0
 * @since 1.0.0
 */
public interface IAddressDao {

    Address getById(String id);

    Address create(Address address);

    Address update(Address address);

    Address delete(String id);

    List<Address> getAll();
}
