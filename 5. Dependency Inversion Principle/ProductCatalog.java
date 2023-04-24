import java.util.List;

public class ProductCatalog {

    ProductRepository productRepository;

    public ProductCatalog(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void listAllProducts() {
        List<String> products = productRepository.getAllProductNames();
        //List all products here
    }

}
