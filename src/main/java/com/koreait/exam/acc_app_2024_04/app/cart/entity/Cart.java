package com.koreait.exam.acc_app_2024_04.app.cart.entity;

import com.koreait.exam.acc_app_2024_04.app.base.entity.BaseEntity;
import com.koreait.exam.acc_app_2024_04.app.member.entity.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import static javax.persistence.FetchType.LAZY;
import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor(access = PROTECTED)
public class Cart extends BaseEntity {
    private String subject;
    private String content;
    @ManyToOne(fetch = LAZY)
    private Member author;
}
