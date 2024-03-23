package com.fpoly.datn.entity;

import com.fpoly.datn.entity.type.TrangThai;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChiTietSanPham {

    @Id
    @Column(name = "chi_tiet_san_pham_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer chiTietSanPhamId;

    @Column(name = "so_luong")
    private Integer soLuong;

    @Column(name = "trang_thai_chi_tiet_san_pham")
    private TrangThai trangThaiChiTietSanPham;

    @ManyToOne
    @JoinColumn(name = "chat_lieu_id", nullable = false)
    private ChatLieu chatLieu;

    @ManyToOne
    @JoinColumn(name = "mau_sac_id", nullable = false)
    private MauSac mauSac;

    @ManyToOne
    @JoinColumn(name = "kich_thuoc_id", nullable = false)
    private KichThuoc kichThuoc;

    @ManyToOne
    @JoinColumn(name = "san_pham_id", nullable = false)
    private SanPham sanPham;
}
