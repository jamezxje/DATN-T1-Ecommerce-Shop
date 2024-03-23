package com.fpoly.datn.config;

import com.fpoly.datn.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import static com.fpoly.datn.config.DataSeeder.*;

@Component
@RequiredArgsConstructor
public class ApplicationStartupRunner implements CommandLineRunner {

    private final ChatLieuRepository chatLieuRepository;
    private final ChiTietSanPhamRepository chiTietSanPhamRepository;
    private final DanhMucRepository danhMucRepository;
    private final KichThuocRepository kichThuocRepository;
    private final MauSacRepository mauSacRepository;
    private final NhaCungCapRepository nhaCungCapRepository;
    private final SanPhamRepository sanPhamRepository;
    private final ThuongHieuRepository thuongHieuRepository;

    @Override
    public void run(String... args) throws Exception {

        chatLieuRepository.saveAll(CHAT_LIEU_SEED);
        danhMucRepository.saveAll(DANH_MUC_SEED);
        kichThuocRepository.saveAll(KICH_THUOC_SEED);
        mauSacRepository.saveAll(MAU_SAC_SEED);
        nhaCungCapRepository.saveAll(NHA_CUNG_CAP_SEED);
        thuongHieuRepository.saveAll(THUONG_HIEU_SEED);
        sanPhamRepository.saveAll(SAN_PHAM_SEED);
        chiTietSanPhamRepository.saveAll(CHI_TIET_SAN_PHAM_SEED);
    }
}
