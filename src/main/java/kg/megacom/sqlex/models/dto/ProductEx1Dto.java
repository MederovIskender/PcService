package kg.megacom.sqlex.models.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;


public class ProductEx1Dto {
    String model;
    int speed;
    double hd;

    public ProductEx1Dto(String model, int speed, double hd) {
        this.model = model;
        this.speed = speed;
        this.hd = hd;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getHd() {
        return hd;
    }

    public void setHd(double hd) {
        this.hd = hd;
    }
}
