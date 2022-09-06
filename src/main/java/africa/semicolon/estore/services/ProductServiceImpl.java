package africa.semicolon.estore.services;

import africa.semicolon.estore.data.model.Product;
import africa.semicolon.estore.data.repository.ProductRepository;
import africa.semicolon.estore.dto.request.DeleteRequest;
import africa.semicolon.estore.dto.response.DeleteResponse;
import africa.semicolon.estore.dto.request.ProductRequest;
import africa.semicolon.estore.dto.response.productResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService{
    private ProductRepository productRepository;

    @Override
    public productResponse addProduct(ProductRequest productRequest) {
      Product product = new Product();
        log.info("somet -> {}", product);
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.map(productRequest,Product.class);
      Product savedProduct = productRepository.save(product);
        log.info("something -> {}", savedProduct);
        productResponse response = new productResponse();
        log.info("somethin -> {}", response);
        response.setProductName(savedProduct.getProductName());
        log.info("response name {}", response.getProductName());
        response.setMessage("product successfully added");
//        response.setDateCreated(DateTimeFormatter.ofPattern("EEEE, dd/MM/yyy, hh:mm, a").format(savedProduct.getDateRegistered()));
        return response;

    }

    @Override
    public DeleteResponse deleteProduct(DeleteRequest request) {
        Product product = productRepository.findByProductName(request.getProductName());
        productRepository.delete(product);
        DeleteResponse deleteResponse = new DeleteResponse();
        deleteResponse.setMessage("product deleted");

        return deleteResponse;
    }

    @Override
    public productResponse updateProduct(ProductRequest productRequest) {
        Product product = productRepository.findByProductName(productRequest.getProductName());
        if(product == null){
            throw  new IllegalStateException("PRODUCT NOT AVAILABLE");
        }
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.map(productRequest,Product.class);
        productRepository.save(product);
        productResponse response = new productResponse();
        response.setMessage("product successfully updated");
        return response;
    }

    @Override
    public productResponse deleteAll(DeleteRequest request) {
        productRepository.deleteAll();
        productResponse response = new productResponse();
        response.setMessage("all product successfully deleted");
        return response;
    }

    @Override
    public Product findProduct(ProductRequest productRequest) {
        Product product = productRepository.findByProductName(productRequest.getProductName());
        if(product.getProductName().equals(productRequest.getProductName())){
            return product;
        }else return null;
    }

    @Override
    public Product findAllProduct(ProductRequest productRequest) {
        return (Product) productRepository.findAll();
    }

}
