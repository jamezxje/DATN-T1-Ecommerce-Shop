package com.fpoly.datn.service.impl;

import com.fpoly.datn.entity.DanhMuc;
import com.fpoly.datn.repository.DanhMucRepository;
import com.fpoly.datn.service.DanhMucService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DanhMucServiceImpl implements DanhMucService {

    private final DanhMucRepository danhMucRepository;
    @Override
    public List<DanhMuc> findAllDanhMuc() {
        return danhMucRepository.findAll();
    }

    @Override
    public DanhMuc findDanhMucByDanhMucId(Integer danhMucId) {
        return danhMucRepository.findById(danhMucId).orElseThrow(()-> new RuntimeException("Danh muc not found"));
    }

    @Override
    public DanhMuc saveDanhMuc(DanhMuc danhMuc) {
        DanhMuc danhMucSaved = danhMucRepository.save(danhMuc);
        return danhMucSaved;
    }

    @Override
    public void deleteDanhMucByDanhMucId(Integer danhMucId) {
        this.danhMucRepository.deleteById(danhMucId);
    }
}
