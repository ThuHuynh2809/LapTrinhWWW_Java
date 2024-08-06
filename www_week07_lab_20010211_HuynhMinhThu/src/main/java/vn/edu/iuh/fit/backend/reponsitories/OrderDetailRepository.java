package vn.edu.iuh.fit.backend.reponsitories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.backend.models.OrderDetail;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
}
