package africa.semicolon.estore.dto.response;

import africa.semicolon.estore.data.model.Buyer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BuyerResponse {
    private String message;
    private Buyer buyer;
    private String status;
    private Object data;

}

