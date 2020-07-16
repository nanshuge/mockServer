package com.simpletester.mockserver;

import lombok.Getter;
import lombok.Setter;

class Product {
    @Getter
    @Setter
    Long id;
    @Getter
    @Setter
    String price;
    @Getter
    @Setter
    String color;
    @Getter
    @Setter
    String productName;

    public Product(String _price, String _color,String _productName){
        this.id=System.currentTimeMillis();
        this.price=_price;
        this.color=_color;
        this.productName=_productName;
    }
}