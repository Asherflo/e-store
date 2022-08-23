package africa.semicolon.estore.data.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Buyer extends User{


    private String firstName;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Cart cart;
    private String lastName;
    private  String address;
    @Id
    @GeneratedValue
    private Long id;


}
