package com.fpoly.datn.entity;

import com.fpoly.datn.entity.type.TrangThai;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class DanhMuc {

    @Id
    @Column(name = "danh_muc_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer danhMucId;

    @Column(name = "ten_danh_muc")
    private String tenDanhMuc;

    @Column(name = "trang_thai_danh_muc")
    private TrangThai trangThaiDanhMuc;
}
