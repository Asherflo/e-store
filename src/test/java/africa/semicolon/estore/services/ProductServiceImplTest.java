package africa.semicolon.estore.services;

import africa.semicolon.estore.data.model.Category;

import africa.semicolon.estore.dto.request.ProductRequest;
import africa.semicolon.estore.dto.response.productResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ProductServiceImplTest {
    @Autowired
    private ProductService  productService;

    @Test
    public void AddProduct(){
        ProductRequest productRequest = ProductRequest.builder()
                .productName("iphone")
                .category(Category.PHONES)
                .producePrice(30_000)
                .rating(5)
                .build();
        productResponse response = productService.addProduct(productRequest);
        assertEquals("product successfully added", response.getMessage());
    }

}