package ru.netology.javaqa.javaqamvn.repository;

import domain.Product;

public class ProductManager {
    private ProductRepository repo;

    public ProductManager(ProductRepository repository) {
        this.repo = repository;
    }


    public void add(Product items) {


        repo.save(items);

    }


    public Product[] searchBy(String text) {
        Product[] result = new Product[0]; // тут будем хранить подошедшие запросу продукты
        int x = 0;
        for (Product product : repo.findAll()) {
            if (matches(product, text)) {
                // "добавляем в конец" массива result продукт product
                Product[] tmp = new Product[result.length + 1];
                for (int i = 0; i < result.length; i = i + 1) {
                    tmp[i] = result[i];
                }

                tmp[tmp.length - 1] = product;
                result = tmp;
            }
        }
        return result;


}

    // метод определения соответствия товара product запросу search
    public boolean matches(Product product, String search) {
        if (product.getName().contains(search)) {
            return true;
        } else {
            //return false;
        }
        // или в одну строку:
         return product.getName().contains(search);

    }
}
