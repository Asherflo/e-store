package africa.semicolon.estore.dto.request;

import africa.semicolon.estore.data.model.Category;
import lombok.*;

import java.util.List;
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {
    private String productName;
    private Category category;
    private  int rating ;
    private int producePrice;

}
