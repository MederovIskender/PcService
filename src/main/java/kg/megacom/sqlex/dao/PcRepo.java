package kg.megacom.sqlex.dao;

import kg.megacom.sqlex.models.dto.PcEx1;
import kg.megacom.sqlex.models.dto.ProductEx1Dto;
import kg.megacom.sqlex.models.entities.Pc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PcRepo extends JpaRepository<Pc,Integer> {

 List<Pc> findAllByPriceLessThan(double price);

 @Query("select new kg.megacom.sqlex.models.dto.ProductEx1Dto(p.model.model, p.speed, p.hd) from Pc p where p.price<?1")
 List<ProductEx1Dto> findAllDtosLessThan(double price);


 @Query("select p.model.model as model, p.speed as speed, p.hd as hd from Pc p where p.price<?1")
 List<PcEx1> getAllPriceLessThan(double price);
}

