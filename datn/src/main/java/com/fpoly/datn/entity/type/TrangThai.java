package com.fpoly.datn.entity.type;

import lombok.Getter;

@Getter
public enum TrangThai {
    HOAT_DONG("hoat_dong"),
    KHONG_HOAT_DONG("khong_hoat_dong");

    private final String trangThai;

    TrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}
