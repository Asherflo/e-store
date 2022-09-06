package africa.semicolon.estore.services;

import africa.semicolon.estore.data.model.Product;
import africa.semicolon.estore.dto.request.DeleteRequest;
import africa.semicolon.estore.dto.response.DeleteResponse;
import africa.semicolon.estore.dto.request.ProductRequest;
import africa.semicolon.estore.dto.response.productResponse;

public interface ProductService {
    productResponse addProduct(ProductRequest productRequest);
    DeleteResponse deleteProduct(DeleteRequest request);
    productResponse updateProduct(ProductRequest productRequest);
    productResponse deleteAll (DeleteRequest request);
    Product findProduct(ProductRequest productRequest);
    Product findAllProduct(ProductRequest productRequest);

}
