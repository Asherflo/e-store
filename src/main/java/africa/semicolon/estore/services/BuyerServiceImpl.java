package africa.semicolon.estore.services;

import africa.semicolon.estore.data.model.Buyer;
import africa.semicolon.estore.data.model.Cart;
import africa.semicolon.estore.data.repository.BuyerRepository;
import africa.semicolon.estore.dto.request.BuyerRequestDto;
import africa.semicolon.estore.dto.response.BuyerResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Service
public class BuyerServiceImpl implements BuyerService{

    private final BuyerRepository buyerRepository;

    @Override
    public BuyerResponse createBuyer(BuyerRequestDto buyerRequestDto) {
        Buyer  buyer = new Buyer();
        Cart cart = new Cart();
        buyer.setFirstName(buyerRequestDto.getFirstName());
//        buyer.setEmail(buyerRequestDto.getEmail());
        buyer.setLastName(buyerRequestDto.getLastName());
        buyer.setAddress(buyerRequestDto.getAddress());
        buyer.setCart(cart);
//        buyer.setProduct(buyer.getProduct());
        Buyer savedBuyer = buyerRepository.save(buyer);
        BuyerResponse response = new BuyerResponse();
        response.setMessage("Successfully created");
        response.setBuyer(savedBuyer);
        return response;

    }
}
