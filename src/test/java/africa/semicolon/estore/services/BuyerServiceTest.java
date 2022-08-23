package africa.semicolon.estore.services;

import africa.semicolon.estore.dto.request.BuyerRequestDto;
import africa.semicolon.estore.dto.response.BuyerResponse;
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
    void testThatABuyerCanBeCreated(){
        BuyerRequestDto buyerRequestDto = new BuyerRequestDto();
        buyerRequestDto.setFirstName("sanmi");
        buyerRequestDto.setLastName("john");
        buyerRequestDto.setEmail("sanmi.john@gmail.com");
        buyerRequestDto.setAddress("12,coker road");
        BuyerResponse response =  buyerService.createBuyer(buyerRequestDto);
        assertNotNull(response);


    }
}