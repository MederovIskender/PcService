package kg.megacom.sqlex.services.impl;

import kg.megacom.sqlex.dao.PcRepo;
import kg.megacom.sqlex.mappers.PcMapper;
import kg.megacom.sqlex.models.dto.PcEx1;
import kg.megacom.sqlex.models.dto.ProductEx1Dto;
import kg.megacom.sqlex.models.entities.Pc;
import kg.megacom.sqlex.services.PcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@Service
public class PcServiceImpl implements PcService {


    private PcRepo pcRepo;
    private PcMapper Pcmapper;

    public PcServiceImpl(PcRepo pcRepo, PcMapper pcMapper) {
        this.pcRepo = pcRepo;
        this.Pcmapper = pcMapper;
    }

    @Override
    public List<Pc> getAllPcLessThanPrice(double price) {return pcRepo.findAllByPriceLessThan(price);
    }


    @Override
    public List<ProductEx1Dto> getAll(double price) {
        return pcRepo.findAllDtosLessThan(price);
    }

    @Override
    public List<PcEx1> getAllInterface(double price) {
        return pcRepo.getAllPriceLessThan(price);
    }

    @Override
    public List<HashMap<String, Object>> getHash(Double price) {
        List<Pc> pcList = getAllPcLessThanPrice(price);
        List<HashMap<String,Object>> pcHashList = new ArrayList<>();
        pcList.stream().forEach(x->{
            HashMap<String,Object>hashMap = new HashMap<>();
            hashMap.put("model",x.getModel().getModel());
            hashMap.put("speed", x.getSpeed());
            hashMap.put("hd", x.getHd());
            pcHashList.add(hashMap);
        });
        return pcHashList;
    }

    @Override
    public List<ProductEx1Dto> getDtoFromMapper(double price) {
        List<Pc> pcList = pcRepo.findAllByPriceLessThan(price);
        List<ProductEx1Dto> productEx1Dtos = new ArrayList<>();
        for (Pc pc : pcList) {
            productEx1Dtos.add(Pcmapper.productEx1Dto(pc));
        }
        return productEx1Dtos;
    }
}
