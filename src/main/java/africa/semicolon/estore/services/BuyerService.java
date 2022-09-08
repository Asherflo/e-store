package africa.semicolon.estore.services;

import africa.semicolon.estore.data.model.Buyer;
import africa.semicolon.estore.dto.request.BuyerRequestDto;
import africa.semicolon.estore.dto.response.BuyerResponse;
import africa.semicolon.estore.exception.BuyerException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface BuyerService  {

    BuyerResponse createBuyer(BuyerRequestDto buyerRequestDto) throws BuyerException;
    Buyer findById(Long buyerId) throws BuyerException;
    Optional<Buyer> findAllById();

    Optional<Buyer> findByEmail() throws BuyerException;

    BuyerResponse deleteBuyer(BuyerRequestDto buyerRequestDto) throws BuyerException;
}
