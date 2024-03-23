package com.fpoly.datn.service;

import com.fpoly.datn.entity.DanhMuc;

import java.util.List;

public interface DanhMucService {

    List<DanhMuc> findAllDanhMuc();

    DanhMuc findDanhMucByDanhMucId(Integer danhMucId);

    DanhMuc saveDanhMuc(DanhMuc danhMuc);

    void deleteDanhMucByDanhMucId(Integer danhMucId);

}
