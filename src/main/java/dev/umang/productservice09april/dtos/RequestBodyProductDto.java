package dev.umang.productservice09april.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestBodyProductDto {
    private String title;
    private double price;
    private String description;
    private String image;
    private String category;
    /*
    private String password;
     */
}
/*
DTO for each request so that in  future, if the request
needs additional params, you can easily do it without much impact
 */