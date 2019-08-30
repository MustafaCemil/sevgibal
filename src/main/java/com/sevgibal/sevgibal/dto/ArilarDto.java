package com.sevgibal.sevgibal.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArilarDto{

    private Long id;
    private String isim;
    private String irk;
    private Float agirlik;
    private String aciklama;
}
