package com.abcd.product_shop;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@NoArgsConstructor@AllArgsConstructor
public class Product {
    @NotNull(message = "Id is requred")
    @Min(value =1, message = "id must be 1-100")
    private int id;
    @NotBlank(message = "name Can't blank")
    // @Size(min = 1,max = 100,message = "Id must be between 1-100")

    private String name;
    @NotEmpty(message = "must be requied")
    private String category;
    @NotNull(message = "Stock is required")
    @PositiveOrZero(message = "stock can not be negative")
    private int stock;
   // @NotNull(message =  " price is required")
    //@DecimalMin(value = "0.1",message = "price must be more then 0")
   // @DecimalMax(value = "0.99",message = "price must be more then 1000")
    private double price;
}
