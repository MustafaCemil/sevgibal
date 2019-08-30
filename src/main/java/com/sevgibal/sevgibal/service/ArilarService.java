package com.sevgibal.sevgibal.service;

import com.sevgibal.sevgibal.dto.ArilarDto;
import com.sevgibal.sevgibal.entity.Arilar;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface ArilarService {

    Page<ArilarDto> listele(Pageable pageable);

    ArilarDto kayit(ArilarDto arilarDto);

    ArilarDto guncelle(ArilarDto arilarDto,  Long id);

    Boolean silme(Long id);

    ArilarDto kayitBul(Long id);
}
