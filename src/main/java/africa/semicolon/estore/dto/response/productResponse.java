package africa.semicolon.estore.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class productResponse {
    private String message;
    private String productName;
    private String dateCreated;
}
