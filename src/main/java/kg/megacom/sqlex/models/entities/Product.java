package kg.megacom.sqlex.models.entities;

import kg.megacom.sqlex.enums.ProductType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name="product")
public class Product {

    @Id
    String model;
    String maker;
    @Enumerated(value=EnumType.STRING)
    ProductType type;

}
