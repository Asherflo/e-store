package africa.semicolon.estore.data.repository;

import africa.semicolon.estore.data.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
}
