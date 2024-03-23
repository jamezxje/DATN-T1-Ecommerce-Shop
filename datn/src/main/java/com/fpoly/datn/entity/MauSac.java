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
public class MauSac {

    @Id
    @Column(name = "mau_sac_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer mauSacId;

    @Column(name = "ten_mau_sac")
    private String tenMauSac;

    @Column(name = "trang_thai_mau_sac")
    private TrangThai trangThaiMauSac;
}
