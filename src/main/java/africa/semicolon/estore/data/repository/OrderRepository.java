package africa.semicolon.estore.data.repository;

import africa.semicolon.estore.data.model.UserOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<UserOrder,Long> {
}
