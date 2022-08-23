package africa.semicolon.estore.dto.request;

import lombok.Data;

@Data
public class BuyerRequestDto {
    private String firstName;
    private String lastName;
    private String email;
    private String address;
}
