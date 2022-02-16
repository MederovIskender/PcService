package kg.megacom.sqlex.mappers;

import kg.megacom.sqlex.models.dto.ProductEx1Dto;
import kg.megacom.sqlex.models.entities.Pc;
import org.springframework.stereotype.Component;

@Component
public class PcMapper {
    public ProductEx1Dto productEx1Dto(Pc pc){
        ProductEx1Dto productEx1Dto = new ProductEx1Dto("",3,3);
        productEx1Dto.setSpeed(pc.getSpeed());
        productEx1Dto.setHd(pc.getHd());
        productEx1Dto.setModel(pc.getModel().getModel());
        return productEx1Dto;
    }
}
