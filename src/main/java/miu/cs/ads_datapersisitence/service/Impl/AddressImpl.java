package miu.cs.ads_datapersisitence.service.Impl;

import miu.cs.ads_datapersisitence.model.Address;
import miu.cs.ads_datapersisitence.repository.AddressRepository;
import miu.cs.ads_datapersisitence.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressImpl implements AddressService {
    @Autowired
    AddressRepository addressRepository;

    @Override
    public List<Address> getAllAddress() {
        return addressRepository.findAll();
    }

    @Override
    public Address getAddress(Integer id) {
        return addressRepository.findById(id).orElse(null);
    }

    @Override
    public void addAddress(Address address) {
        addressRepository.save(address);
    }

    @Override
    public Address updateAddress(Integer id, String location) {
        return null;
    }

    @Override
    public void deleteAddress(Integer id) {
         addressRepository.deleteById(id);
    }
}
