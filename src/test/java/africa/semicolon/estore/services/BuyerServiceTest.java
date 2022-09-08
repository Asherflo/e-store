package africa.semicolon.estore.services;

import africa.semicolon.estore.data.model.Buyer;
import africa.semicolon.estore.dto.request.BuyerRequestDto;
import africa.semicolon.estore.dto.response.BuyerResponse;
import africa.semicolon.estore.exception.BuyerException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BuyerServiceTest {
    @Autowired
    private  BuyerService buyerService;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    @DisplayName("Create Buyer Test")
    void testThatABuyerCanBeCreated() throws BuyerException {
        BuyerRequestDto buyerRequestDto = new BuyerRequestDto();
        buyerRequestDto.setFirstName("oyetan");
        buyerRequestDto.setLastName("gabriel");
        buyerRequestDto.setEmail("sanm@gmail.com");
        buyerRequestDto.setAddress("12,coker road");
        BuyerResponse response =  buyerService.createBuyer(buyerRequestDto);
        assertNotNull(response);
    }
    @Test
    @DisplayName("find Buyer by ID")
    void testThatABuyerIdCanBeRetrieve() throws BuyerException {
        Buyer buyer = buyerService.findById(2l);
        assertEquals("RTY",buyer.getFirstName());
    }
//    @Test
//    @DisplayName("To find all Buyer by ID")
//    void testToFindAllBuyerById(){
//        Buyer buyer = (Buyer) buyerService.findAllById();
//        assertEquals();
//    }
}