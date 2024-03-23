package com.fpoly.datn.entity;

import com.fpoly.datn.entity.type.LoaiHinhAnh;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class HinhAnh {

    @Id
    @Column(name = "hinh_anh_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hinhAnhId;

    @Column(name = "ten_hinh_anh")
    private String tenHinhAnh;

    @Column(name = "loai_hinh_anh")
    private LoaiHinhAnh loaiHinhAnh;

    @Column(name = "hinh_anh_url")
    private String hinhAnhUrl;

    @Column(name = "hinh_anh_alt")
    private String hinhAnhAlt;

    public HinhAnh(String tenHinhAnh, LoaiHinhAnh loaiHinhAnh, String hinhAnhUrl, String hinhAnhAlt) {
        this.tenHinhAnh = tenHinhAnh;
        this.loaiHinhAnh = loaiHinhAnh;
        this.hinhAnhUrl = hinhAnhUrl;
        this.hinhAnhAlt = hinhAnhAlt;
    }
}
