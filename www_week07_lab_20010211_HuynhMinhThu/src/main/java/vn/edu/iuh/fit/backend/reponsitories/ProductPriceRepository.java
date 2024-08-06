package vn.edu.iuh.fit.backend.reponsitories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.backend.models.ProductPrice;

public interface ProductPriceRepository extends JpaRepository<ProductPrice, Long> {
}
