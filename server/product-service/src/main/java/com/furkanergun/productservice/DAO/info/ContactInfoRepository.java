package com.furkanergun.productservice.DAO.info;

import com.furkanergun.productservice.entity.info.ContactInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactInfoRepository extends JpaRepository<ContactInfo, Integer> {
}
