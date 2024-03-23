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
public class ChatLieu {

    @Id
    @Column(name = "chat_lieu_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer chatLieuId;

    @Column(name = "ten_chat_lieu")
    private String tenChatLieu;

    @Column(name = "trang_thai_chat_lieu")
    private TrangThai trangThaiChatLieu;
}
