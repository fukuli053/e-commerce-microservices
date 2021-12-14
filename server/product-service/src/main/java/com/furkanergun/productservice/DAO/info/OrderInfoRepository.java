package com.furkanergun.productservice.DAO.info;

import com.furkanergun.productservice.entity.info.OrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderInfoRepository extends JpaRepository<OrderInfo, Integer> {
}
