package com.fpoly.datn.controller.dashboard;

import com.fpoly.datn.entity.DanhMuc;
import com.fpoly.datn.service.DanhMucService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/danh_muc")
@RequiredArgsConstructor
public class DanhMucController {

    private final DanhMucService danhMucService;

    @GetMapping
    public List<DanhMuc> findAllDanhMuc(){
        List<DanhMuc> danhMucList =danhMucService.findAllDanhMuc();
        return danhMucList;
    }

    @PostMapping
    public ResponseEntity<DanhMuc> saveDanhMuc(@RequestBody DanhMuc danhMuc){
        DanhMuc danhMucSaved = danhMucService.saveDanhMuc(danhMuc);
        return new ResponseEntity<>(danhMucSaved, HttpStatus.CREATED);
    }
}
