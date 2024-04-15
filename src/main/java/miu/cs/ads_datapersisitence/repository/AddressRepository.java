package miu.cs.ads_datapersisitence.repository;

import miu.cs.ads_datapersisitence.model.Address;
import miu.cs.ads_datapersisitence.model.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}