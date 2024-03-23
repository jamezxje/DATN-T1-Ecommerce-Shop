package com.fpoly.datn.repository;

import com.fpoly.datn.entity.NhaCungCap;
import com.fpoly.datn.entity.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SanPhamRepository extends JpaRepository<SanPham, Integer> {
}
