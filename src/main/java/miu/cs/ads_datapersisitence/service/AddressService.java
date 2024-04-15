package miu.cs.ads_datapersisitence.service;

import miu.cs.ads_datapersisitence.model.Address;
import java.util.List;

public interface AddressService {
    public List<Address> getAllAddress();
    public Address getAddress(Integer id);
    public void addAddress(Address address);
    public Address updateAddress(Integer id, String location);
    public void deleteAddress(Integer id);
    
}
