package web.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.entity.Customer;
@Repository
public interface CustomerDetailsRepository extends JpaRepository<Customer, Integer> {
}

