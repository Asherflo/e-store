package africa.semicolon.estore.data.repository;

import africa.semicolon.estore.data.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Long> {
}
