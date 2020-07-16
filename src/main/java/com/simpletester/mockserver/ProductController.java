package com.simpletester.mockserver;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@ComponentScan
@RestController
public class ProductController {

    @GetMapping("/uc/getProductInfo")
    public Object addProduct(){
        List<Product> productList= getProductData();
        return productList;
    }

    private List<Product>   getProductData(){
        List<Product> productList= new ArrayList<Product>();
        return getProductData(productList);
    }

    private List<Product> getProductData(List<Product> productList) {
        productList.add(new Product("100.00","Yellow","衬衫"));
        productList.add(new Product("120.00","Red","裤子"));
        productList.add(new Product("105.00","Blue","帽子"));
        return productList;
    }

}


