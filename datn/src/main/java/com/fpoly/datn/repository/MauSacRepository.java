package com.fpoly.datn.repository;

import com.fpoly.datn.entity.KichThuoc;
import com.fpoly.datn.entity.MauSac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MauSacRepository extends JpaRepository<MauSac, Integer> {
}
