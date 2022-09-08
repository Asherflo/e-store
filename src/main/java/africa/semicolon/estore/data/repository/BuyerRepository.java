package africa.semicolon.estore.data.repository;

import africa.semicolon.estore.data.model.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BuyerRepository extends JpaRepository<Buyer,Long> {
    Optional<Buyer> findAllById();

    Optional<Buyer> findByEmail();
    Optional<Buyer> deleteBuyer(Buyer buyer);
}
