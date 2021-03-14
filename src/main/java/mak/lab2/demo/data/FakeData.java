package mak.lab2.demo.data;

import mak.lab2.demo.model.Address;
import mak.lab2.demo.model.CityType;
import mak.lab2.demo.model.Company;
import mak.lab2.demo.model.StreetType;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author sonnyako <Makydon Sofiia>
 * @version 1.0.0
 * @since 1.0.0
 */
@Repository
public class FakeData {

    private List<Address> addresses = new ArrayList(
        Arrays.asList(
            new Address("1","Chernivtsi region","Kitsman district","Kitsman", CityType.TOWNSHIP,"Parkova",
                StreetType.STREET,"5","59300"),
        new Address("2","Chernivtsi region","Chernivtsi district","Chernivtsi", CityType.CITY,"Parkova",
                    StreetType.STREET,"5","59300"),
            new Address("3","Kyiv region","Kyiv district","Kyiv", CityType.TOWNSHIP,"Khreshchatyk",
                StreetType.STREET,"5","59300"))
        );
    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
