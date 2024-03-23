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
public class KichThuoc {

    @Id
    @Column(name = "kich_thuoc_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer kichThuocId;

    @Column(name = "gia_tri_kich_thuoc")
    private String giaTriKichThuoc;

    @Column(name = "trang_thai_kich_thuoc")
    private TrangThai trangThaiKichThuoc;
}
