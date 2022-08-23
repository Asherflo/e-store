package africa.semicolon.estore.services;

import africa.semicolon.estore.dto.request.BuyerRequestDto;
import africa.semicolon.estore.dto.response.BuyerResponse;
import org.springframework.stereotype.Service;

@Service
public interface BuyerService  {

    BuyerResponse createBuyer(BuyerRequestDto buyerRequestDto);
}
