package com.fpoly.datn.service;

import com.fpoly.datn.entity.ChiTietSanPham;

import java.util.List;

public interface ChiTietSanPhamService {

    List<ChiTietSanPham> findAllChiTietSanPham();
    void saveChiTietSanPham(ChiTietSanPham chiTietSanPham);
}
