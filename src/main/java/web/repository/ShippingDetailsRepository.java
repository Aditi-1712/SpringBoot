package web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.entity.Shipping;
@Repository
public interface ShippingDetailsRepository extends JpaRepository<Shipping,Integer> {}

