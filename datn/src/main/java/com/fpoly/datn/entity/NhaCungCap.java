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
public class NhaCungCap {

    @Id
    @Column(name = "nha_cung_cap_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer nhaCungCapId;

    @Column(name = "ten_nha_cung_cap")
    private String tenNhaCungCap;

    @Column(name = "trang_thai_nha_cung_cap")
    private TrangThai trangThaiNhaCungCap;
}
