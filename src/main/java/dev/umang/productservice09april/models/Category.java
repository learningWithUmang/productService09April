package dev.umang.productservice09april.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Category extends BaseModel{
    private String title;
    //Category : Product
    @OneToMany(mappedBy = "category")
    private List<Product> products;
}

/*
Did we tell spring about the db url?
db unsername?
db password?
data source?
 */
