package africa.semicolon.estore.dto.response;

import africa.semicolon.estore.data.model.Buyer;
import lombok.Data;

@Data
public class BuyerResponse {
    private String message;
    private Buyer buyer;
}

