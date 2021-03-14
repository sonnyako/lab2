package mak.lab2.demo.service.address.impls;

import mak.lab2.demo.dao.address.impls.AddressDaoImpl;
import mak.lab2.demo.model.Address;
import mak.lab2.demo.service.address.interfaces.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sonnyako <Makydon Sofiia>
 * @version 1.0.0
 * @since 1.0.0
 */
@Service
public class AddressServiceImpl implements IAddressService {

    @Autowired
  AddressDaoImpl addressDao;

    @Override
    public Address getById(String id) {
        return addressDao.getById(id);
    }

    @Override
    public Address create(Address address) {
        return addressDao.create(address);
    }

    @Override
    public Address update(Address address) {
        return addressDao.update(address);
    }

    @Override
    public Address delete(String id) {
        return addressDao.delete(id);
    }

    @Override
    public List<Address> getAll() {
        return addressDao.getAll();
    }
}
