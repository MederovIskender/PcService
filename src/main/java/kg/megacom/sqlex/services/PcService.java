package kg.megacom.sqlex.services;

import kg.megacom.sqlex.models.dto.PcEx1;
import kg.megacom.sqlex.models.dto.ProductEx1Dto;
import kg.megacom.sqlex.models.entities.Pc;

import java.util.HashMap;
import java.util.List;
public interface PcService {
    List<Pc> getAllPcLessThanPrice(double price);

    List<ProductEx1Dto> getAll(double price);

    List<PcEx1> getAllInterface(double price);

    List<HashMap<String, Object>> getHash(Double price);

    List<ProductEx1Dto> getDtoFromMapper(double price);
}
