package africa.semicolon.estore.data.repository;

import africa.semicolon.estore.data.model.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuyerRepository extends JpaRepository<Buyer,Long> {
}
