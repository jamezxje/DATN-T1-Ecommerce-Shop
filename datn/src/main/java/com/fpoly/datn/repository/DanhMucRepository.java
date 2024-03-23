package com.fpoly.datn.repository;

import com.fpoly.datn.entity.ChatLieu;
import com.fpoly.datn.entity.DanhMuc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DanhMucRepository extends JpaRepository<DanhMuc, Integer> {
}
