package com.monsha.estore.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {
    Long id;
    String name;
    String description;
    double price;
    int quantity;
}
