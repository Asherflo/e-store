package africa.semicolon.estore.controller;

import africa.semicolon.estore.data.model.Buyer;
import africa.semicolon.estore.dto.request.BuyerRequestDto;
import africa.semicolon.estore.dto.response.BuyerResponse;
import africa.semicolon.estore.exception.BuyerException;
import africa.semicolon.estore.services.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("buyer")
public class BuyerController {
    @Autowired
    private BuyerService buyerService;
    @PostMapping("/create")
    public ResponseEntity<?>CreateBuyer(@RequestBody BuyerRequestDto buyerRequestDto) throws BuyerException {
        BuyerResponse buyerResponse = buyerService.createBuyer(buyerRequestDto);
        BuyerResponse apiResponse = BuyerResponse.builder()
                .status("success")
                .message("Buyer created successfully")
                .data(buyerResponse)
                .build();
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @GetMapping("/id/{id}")
    public Buyer getBuyerById(@PathVariable Long buyerId) throws BuyerException {
        return buyerService.findById(buyerId);
    }
    @GetMapping("/getAll")
    public Optional<Buyer> getAllBuyerById(){
        return  buyerService.findAllById();
    }


}
