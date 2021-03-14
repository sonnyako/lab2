package mak.lab2.demo.controller.rest;

import mak.lab2.demo.model.Address;
import mak.lab2.demo.service.address.impls.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author sonnyako <Makydon Sofiia>
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController
@RequestMapping("api/addresses")
public class AddressRestController {
    @Autowired
    AddressServiceImpl service;

    @RequestMapping("/get/all")
    public List<Address> getAddresses() {
        return service.getAll();
    }

    @GetMapping("/get/{id}")
    public Address getById(@PathVariable("id") String id) {
        return service.getById(id);
    }

    @GetMapping("/delete/{id}")
    public Address deleteById(@PathVariable("id") String id) {
        return service.delete(id);
    }
    @PostMapping("/create/")
    public  Address create(@RequestBody Address address){
        return service.create(address);
    }
    @PostMapping("/update/")
    public  Address update(@RequestBody Address address){
        return service.update(address);
    }
}
