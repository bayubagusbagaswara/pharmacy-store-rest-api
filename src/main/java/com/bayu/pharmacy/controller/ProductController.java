package com.bayu.pharmacy.controller;

import com.bayu.pharmacy.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
}