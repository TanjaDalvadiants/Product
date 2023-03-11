import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.Product;
package ru.netology.javaqa.javaqamvn.repository;

public class ProductRepositoryTest {
    Product item1 = new Product(1, "книга", 100);
    Product item2 = new Product(2, "смартфон", 1100);
    Product item3 = new Product(3, "книга", 185);

    @Test
    public void ShouldSave() {
        ProductRepository repo = new ProductRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);

        Product[] expected = {item1, item2, item3};
        Product[] actual = repo.getItems();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void ShouldRemoveById() {
        ProductRepository repo = new ProductRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.removeById(item2.getId());

        Product[] expected = {item1, item3};
        Product[] actual = repo.getItems();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void ShouldFindAll() {
        ProductRepository repo = new ProductRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);

        Product[] expected = {item1, item2, item3};
        Product[] actual;
        actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    }

