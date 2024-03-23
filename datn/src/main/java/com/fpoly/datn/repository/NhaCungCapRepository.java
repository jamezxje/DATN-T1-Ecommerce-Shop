package com.fpoly.datn.repository;

import com.fpoly.datn.entity.MauSac;
import com.fpoly.datn.entity.NhaCungCap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhaCungCapRepository extends JpaRepository<NhaCungCap, Integer> {
}
