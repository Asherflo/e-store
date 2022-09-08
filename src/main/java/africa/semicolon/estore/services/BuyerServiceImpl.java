package africa.semicolon.estore.services;

import africa.semicolon.estore.data.model.Buyer;
import africa.semicolon.estore.data.model.Cart;
import africa.semicolon.estore.data.repository.BuyerRepository;
import africa.semicolon.estore.dto.request.BuyerRequestDto;
import africa.semicolon.estore.dto.response.BuyerResponse;
import africa.semicolon.estore.exception.BuyerException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class BuyerServiceImpl implements BuyerService{

    private final BuyerRepository buyerRepository;

    @Override
    public BuyerResponse createBuyer(BuyerRequestDto buyerRequestDto) throws BuyerException {
        Buyer  buyer = new Buyer();
        Cart cart = new Cart();
        buyer.setFirstName(buyerRequestDto.getFirstName());
//        buyer.setEmail(buyerRequestDto.getEmail());
        buyer.setLastName(buyerRequestDto.getLastName());
        buyer.setAddress(buyerRequestDto.getAddress());
        buyer.setEmail(buyerRequestDto.getEmail());
        buyer.setCart(cart);
//        buyer.setProduct(buyer.getProduct());
        Buyer savedBuyer = buyerRepository.save(buyer);
        BuyerResponse response = new BuyerResponse();
        response.setMessage("Successfully created");
        response.setBuyer(savedBuyer);
        return response;

    }

    @Override
    public Buyer findById(Long buyerId) throws BuyerException {
        return  buyerRepository.findById(buyerId).orElseThrow(()->new BuyerException("Buyer does not exist"));


    }

    @Override
    public Optional<Buyer> findAllById() {
        return buyerRepository.findAllById();
    }

    @Override
    public Optional<Buyer> findByEmail() throws BuyerException {
        return Optional.ofNullable(buyerRepository.findByEmail().orElseThrow(() -> new BuyerException("Email already exist")));
    }

    @Override
    public BuyerResponse deleteBuyer(BuyerRequestDto buyerRequestDto) throws BuyerException {
        Buyer  buyer = new Buyer();
        buyer.setEmail(buyerRequestDto.getEmail());
        buyer.setLastName(buyerRequestDto.getLastName());
        Buyer savedDetails  = buyerRepository.deleteBuyer(buyer).orElseThrow(()->new BuyerException("Buyer does not exist"));
        BuyerResponse response = new BuyerResponse();
        response.setMessage("buyer  successful deleted");
        response.setBuyer(savedDetails);
        return  response;
    }
}
