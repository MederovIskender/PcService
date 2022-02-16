package kg.megacom.sqlex.models.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "pc")
public class Pc {
    @Id
    int code;

    @ManyToOne
    @JoinColumn(name = "model")
    Product model;
    int speed;
    int ram;
    double hd;
    String cd;
    double price;

}
