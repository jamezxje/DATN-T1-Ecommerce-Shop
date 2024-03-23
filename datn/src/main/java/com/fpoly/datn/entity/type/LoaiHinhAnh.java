package com.fpoly.datn.entity.type;

public enum LoaiHinhAnh {

    PNG("png"),
    WEBP("webp"),
    JPG("jpg"),
    JPEG("jpeg");

    private final String loaiHinhAnh;

    LoaiHinhAnh(String loaiHinhAnh) {
        this.loaiHinhAnh = loaiHinhAnh;
    }
}
