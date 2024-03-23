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
public class ThuongHieu {

    @Id
    @Column(name = "thuong_hieu_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer thuongHieuId;

    @Column(name = "ten_thuong_hieu")
    private String tenThuongHieu;

    @Column(name = "trang_thai_thuong_hieu")
    private TrangThai trangThaiThuongHieu;
}
