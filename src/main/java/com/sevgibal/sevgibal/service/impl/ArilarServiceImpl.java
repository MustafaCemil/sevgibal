package com.sevgibal.sevgibal.service.impl;

import com.sevgibal.sevgibal.dto.ArilarDto;
import com.sevgibal.sevgibal.entity.Arilar;
import com.sevgibal.sevgibal.repository.ArilarRepository;
import com.sevgibal.sevgibal.service.ArilarService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ArilarServiceImpl implements ArilarService {

    private ArilarRepository arilarRepository;
    private ModelMapper modelMapper;

    public ArilarServiceImpl(ArilarRepository arilarRepository, ModelMapper modelMapper){
        this.arilarRepository = arilarRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Page<ArilarDto> listele(Pageable pageable) {
        return null;
    }

    @Override
    public ArilarDto kayit(ArilarDto arilarDto) {
        Arilar arilar = modelMapper.map(arilarDto,Arilar.class);
        arilar = arilarRepository.save(arilar);
        return modelMapper.map(arilar,ArilarDto.class);
    }

    @Override
    public ArilarDto guncelle(ArilarDto arilarDto, Long id) {
        Arilar arilar = arilarRepository.getOne(id);

        arilar.setAciklama(arilarDto.getAciklama());
        arilar.setAgirlik(arilarDto.getAgirlik());
        arilar.setIrk(arilarDto.getIrk());
        arilar.setIsim(arilarDto.getIsim());

        arilar = arilarRepository.save(arilar);
        return modelMapper.map(arilar,ArilarDto.class);
    }

    @Override
    public Boolean silme(Long id) {
        arilarRepository.deleteById(id);
        return true;
    }

    @Override
    public ArilarDto kayitBul(Long id) {
        Arilar arilar = arilarRepository.getOne(id);
        return modelMapper.map(arilar,ArilarDto.class);
    }
}
