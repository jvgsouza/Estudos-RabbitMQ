package br.com.joao.consumer.dtos;

import java.io.Serializable;

public class ProductDTO implements Serializable {
    private Integer id;
    private String name;
    private Double price;

    @Override
    public String toString() {
        return "ProductDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
