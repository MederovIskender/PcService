package kg.megacom.sqlex.controllers;

import kg.megacom.sqlex.models.dto.PcEx1;
import kg.megacom.sqlex.models.dto.ProductEx1Dto;
import kg.megacom.sqlex.models.entities.Pc;
import kg.megacom.sqlex.services.PcService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("api/v1/pc")
public class PcController {

    private PcService pcService;

    public PcController(PcService pcService) {
        this.pcService = pcService;
    }

    @GetMapping("/ex1")
    public List<Pc> getAllPcsLessThanPrice(@RequestParam double price) {
        return pcService.getAllPcLessThanPrice(price);
    }
    @GetMapping("/ex1dto")
    public List<ProductEx1Dto> getAll(@RequestParam double price){
        return pcService.getAll(price);
    }

    @GetMapping("/interface")
    public List<PcEx1>getAllPC(@RequestParam double price){
        return pcService.getAllInterface(price);
    }
    @GetMapping("/hashmap")
    List<HashMap<String,Object>>getAllHash(@RequestParam Double price){
        return pcService.getHash(price);
    }
    @GetMapping("/mapper")
    List<ProductEx1Dto>getDtofromMapper(@RequestParam double price){
        return pcService.getDtoFromMapper(price);
    }
}
