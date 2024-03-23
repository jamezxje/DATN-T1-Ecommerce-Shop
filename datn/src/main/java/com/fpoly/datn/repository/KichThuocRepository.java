package com.fpoly.datn.repository;

import com.fpoly.datn.entity.DanhMuc;
import com.fpoly.datn.entity.KichThuoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KichThuocRepository extends JpaRepository<KichThuoc, Integer> {
}
