package africa.semicolon.estore.data.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Seller extends User {
    @Id
    @GeneratedValue
    private Long id;
}
