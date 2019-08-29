package com.sevgibal.sevgibal.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "arilar")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Arilar extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "isim")
    private String isim;

    @Column(name = "irk")
    private String irk;

    @Column(name = "agirlik")
    private Float agirlik;

    @Column(name = "aciklama")
    private String aciklama;
}
