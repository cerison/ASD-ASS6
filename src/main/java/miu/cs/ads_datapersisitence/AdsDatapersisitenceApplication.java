package miu.cs.ads_datapersisitence;

import miu.cs.ads_datapersisitence.model.Address;
import miu.cs.ads_datapersisitence.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AdsDatapersisitenceApplication implements CommandLineRunner {

    @Autowired
    private final AddressService addressService;

    public AdsDatapersisitenceApplication(AddressService addressService) {
        this.addressService = addressService;
    }
	
    /*
	@Bean
	// remove 'implements CommandLineRunner'
    CommandLineRunner commandLineRunner() {
        return (args) -> {

		   };
    }*/
	
    public static void main(String[] args) {
        SpringApplication.run(AdsDatapersisitenceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello Spring boot data persistence");
        System.out.println("-------------------------------");
        addAddress(new Address(1,"Fairfield"));
        addAddress(new Address(2,"Cedar Rapid"));
        System.out.println(getAllAddress());
        System.out.println("-------------------------------");
        System.out.println(getAddress(2));
        System.out.println("-------------------------------");
        deleteAddress(1);
        System.out.println(getAllAddress());
        System.out.println("-------------------------------");
    }

    public void addAddress(Address address) {
        addressService.addAddress(address);
    }

    public Address getAddress(Integer id) {
        return addressService.getAddress(id);
    }

    public List<Address> getAllAddress() {
        return addressService.getAllAddress();
    }

    public Address updateAddress(Integer id, String location) {
        return null;
    }

    public void deleteAddress(Integer id) {
        addressService.deleteAddress(id);
    }
}
