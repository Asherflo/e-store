package africa.semicolon.estore.data.repository;

import africa.semicolon.estore.data.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
   Product findByProductName(String productName);
}
