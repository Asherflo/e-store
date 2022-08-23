package africa.semicolon.estore.data.repository;

import africa.semicolon.estore.data.model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller,Long> {
}
