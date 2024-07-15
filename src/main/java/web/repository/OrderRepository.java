package web.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.entity.Orders;
@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer> {}

