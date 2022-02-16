package kg.megacom.sqlex.dao;

import kg.megacom.sqlex.models.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,String> {
}
