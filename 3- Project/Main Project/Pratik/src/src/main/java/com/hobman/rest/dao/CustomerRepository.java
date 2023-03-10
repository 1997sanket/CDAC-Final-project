package com.hobman.rest.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hobman.rest.models.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
	
	public Customer findByCustId(long custid);
	public Customer findByEmail(String email);
	public Customer findByFirstName(String firstName);
	

}
