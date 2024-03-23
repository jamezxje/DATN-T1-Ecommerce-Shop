package com.fpoly.datn.config;

import com.fpoly.datn.entity.*;
import com.fpoly.datn.entity.type.TrangThai;

import java.time.LocalDateTime;
import java.util.List;

public class DataSeeder {

    public static final List<DanhMuc> DANH_MUC_SEED = List.of(
            new DanhMuc(1, "Áo cộc", TrangThai.HOAT_DONG),
            new DanhMuc(2, "Áo dài tay", TrangThai.HOAT_DONG),
            new DanhMuc(3, "Áo hoodie", TrangThai.HOAT_DONG),
            new DanhMuc(4, "Áo khoác", TrangThai.HOAT_DONG),
            new DanhMuc(5, "Quần", TrangThai.HOAT_DONG)
    );

    public static final List<NhaCungCap> NHA_CUNG_CAP_SEED = List.of(
            new NhaCungCap(1, "T1", TrangThai.HOAT_DONG),
            new NhaCungCap(2, "T1", TrangThai.HOAT_DONG),
            new NhaCungCap(3, "T1", TrangThai.HOAT_DONG),
            new NhaCungCap(4, "T1", TrangThai.HOAT_DONG),
            new NhaCungCap(5, "T1", TrangThai.HOAT_DONG)
    );

    public static final List<ThuongHieu> THUONG_HIEU_SEED = List.of(
            new ThuongHieu(1, "T1", TrangThai.HOAT_DONG),
            new ThuongHieu(2, "T1", TrangThai.HOAT_DONG),
            new ThuongHieu(3, "T1", TrangThai.HOAT_DONG),
            new ThuongHieu(4, "T1", TrangThai.HOAT_DONG),
            new ThuongHieu(5, "T1", TrangThai.HOAT_DONG)
    );

    public static final List<SanPham> SAN_PHAM_SEED = List.of(
      new SanPham(1, "SP_01", "Áo cộc tay", "Đẹp", TrangThai.HOAT_DONG, DANH_MUC_SEED.getFirst(),NHA_CUNG_CAP_SEED.getFirst(), THUONG_HIEU_SEED.getFirst(), LocalDateTime.now(), LocalDateTime.now()),
      new SanPham(2, "SP_02", "Áo dài tay", "Đẹp", TrangThai.HOAT_DONG, DANH_MUC_SEED.get(1),NHA_CUNG_CAP_SEED.get(1), THUONG_HIEU_SEED.get(1), LocalDateTime.now(), LocalDateTime.now()),
      new SanPham(3, "SP_03", "Áo hoodie", "Đẹp", TrangThai.HOAT_DONG, DANH_MUC_SEED.get(2),NHA_CUNG_CAP_SEED.get(2), THUONG_HIEU_SEED.get(2), LocalDateTime.now(), LocalDateTime.now()),
      new SanPham(4, "SP_04", "Áo khoác", "Đẹp", TrangThai.HOAT_DONG, DANH_MUC_SEED.get(3),NHA_CUNG_CAP_SEED.get(3), THUONG_HIEU_SEED.get(3), LocalDateTime.now(), LocalDateTime.now()),
      new SanPham(5, "SP_05", "Quần", "Đẹp", TrangThai.HOAT_DONG, DANH_MUC_SEED.get(4),NHA_CUNG_CAP_SEED.get(4), THUONG_HIEU_SEED.get(4), LocalDateTime.now(), LocalDateTime.now())
    );

    public static final List<ChatLieu> CHAT_LIEU_SEED = List.of(
            new ChatLieu(1, "Cotton", TrangThai.HOAT_DONG),
            new ChatLieu(2, "Cotton 2 chiều", TrangThai.HOAT_DONG),
            new ChatLieu(3, "Poly", TrangThai.HOAT_DONG),
            new ChatLieu(4, "Lụa tuyết", TrangThai.HOAT_DONG),
            new ChatLieu(5, "GSM", TrangThai.HOAT_DONG)
    );

    public static final List<MauSac> MAU_SAC_SEED = List.of(
            new MauSac(1, "Đỏ", TrangThai.HOAT_DONG),
            new MauSac(2, "Xanh", TrangThai.HOAT_DONG),
            new MauSac(3, "Vàng", TrangThai.HOAT_DONG),
            new MauSac(4, "Cam", TrangThai.HOAT_DONG),
            new MauSac(5, "Tím", TrangThai.HOAT_DONG)
    );

    public static final List<KichThuoc> KICH_THUOC_SEED = List.of(
            new KichThuoc(1, "S", TrangThai.HOAT_DONG),
            new KichThuoc(2, "M", TrangThai.HOAT_DONG),
            new KichThuoc(3, "L", TrangThai.HOAT_DONG),
            new KichThuoc(4, "XL", TrangThai.HOAT_DONG),
            new KichThuoc(5, "XXL", TrangThai.HOAT_DONG)
    );

    public static final List<ChiTietSanPham> CHI_TIET_SAN_PHAM_SEED = List.of(
      new ChiTietSanPham(1, 100, TrangThai.HOAT_DONG, CHAT_LIEU_SEED.getFirst(), MAU_SAC_SEED.getFirst(), KICH_THUOC_SEED.getFirst(), SAN_PHAM_SEED.getFirst()),
      new ChiTietSanPham(2, 100, TrangThai.HOAT_DONG, CHAT_LIEU_SEED.getFirst(), MAU_SAC_SEED.getFirst(), KICH_THUOC_SEED.getFirst(), SAN_PHAM_SEED.get(1)),
      new ChiTietSanPham(3, 100, TrangThai.HOAT_DONG, CHAT_LIEU_SEED.getFirst(), MAU_SAC_SEED.getFirst(), KICH_THUOC_SEED.getFirst(), SAN_PHAM_SEED.get(2)),
      new ChiTietSanPham(4, 100, TrangThai.HOAT_DONG, CHAT_LIEU_SEED.getFirst(), MAU_SAC_SEED.getFirst(), KICH_THUOC_SEED.getFirst(), SAN_PHAM_SEED.get(3)),
      new ChiTietSanPham(5, 100, TrangThai.HOAT_DONG, CHAT_LIEU_SEED.getFirst(), MAU_SAC_SEED.getFirst(), KICH_THUOC_SEED.getFirst(), SAN_PHAM_SEED.get(4))
    );
}
