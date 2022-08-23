package africa.semicolon.estore.data.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Item {
    @Id
    private Long id;
    @OneToOne
    private Product product;


}
