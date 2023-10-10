package br.com.joao.producer.controllers;

import br.com.joao.producer.dtos.ProductDTO;
import br.com.joao.producer.services.ProductService;
import br.com.joao.producer.services.StringService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @PostMapping
    public ResponseEntity<ProductDTO> produces(@RequestBody ProductDTO dto) {
        service.createProduct(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
