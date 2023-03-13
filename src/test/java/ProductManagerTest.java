import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domain.Product;
import ru.netology.javaqa.javaqamvn.repository.ProductManager;
import ru.netology.javaqa.javaqamvn.repository.ProductRepository;


public class ProductManagerTest {
    ProductRepository repo = new ProductRepository();
    ProductManager manager = new ProductManager(repo);

    Product item1 = new Product(1, "книга", 100);
    Product item2 = new Product(2, "смартфон", 1100);
    Product item3 = new Product(3, "книга", 185);
    Product item4 = new Product(4, "книга", 189);

    @BeforeEach
    public void setup() {
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
    }

    @Test
    public void ShouldFindByTextSmartphone() {
        ProductRepository repo = new ProductRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);


        Product[] expected = {item2};
        Product[] actual = manager.searchBy("смартфон");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldFindMaches() {
        ProductRepository repo = new ProductRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);


        Product[] expected = new Product[0];
        Product[] actual = manager.searchBy("пульт");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindByTextBook() {
        ProductRepository repo = new ProductRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);


        Product[] expected = {item1, item3, item4};
        Product[] actual = manager.searchBy("книга");

        Assertions.assertArrayEquals(expected, actual);

    }


}
