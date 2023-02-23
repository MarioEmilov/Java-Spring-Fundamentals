package shoplist.shoppinglist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import shoplist.shoppinglist.model.entity.Product;
import shoplist.shoppinglist.model.enums.CategoryName;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

    @Query("SELECT SUM(p.price) FROM Product p")
    BigDecimal findTotalProductsSum();

    List<Product> findAllByCategory_Name(CategoryName categoryName);
}
