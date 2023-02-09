package shoplist.shoppinglist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shoplist.shoppinglist.model.entity.Category;
import shoplist.shoppinglist.model.enums.CategoryName;

import java.util.Locale;
import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {
    Optional<Category> findByName(CategoryName name);
}
