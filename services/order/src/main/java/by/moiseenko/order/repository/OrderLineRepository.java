package by.moiseenko.order.repository;

import by.moiseenko.order.entity.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderLineRepository extends JpaRepository<OrderLine, Integer> {

    List<OrderLine> findAllByOrderId(Integer orderId);
}
