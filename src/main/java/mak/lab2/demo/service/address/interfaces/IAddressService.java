package mak.lab2.demo.service.address.interfaces;

import mak.lab2.demo.model.Address;
import mak.lab2.demo.model.Company;

import java.util.List;

/**
 * @author sonnyako <Makydon Sofiia>
 * @version 1.0.0
 * @since 1.0.0
 */
public interface IAddressService {

    Address getById(String id);
    Address create(Address address);
    Address update(Address address);
    Address delete(String id);
    List<Address> getAll();
}
