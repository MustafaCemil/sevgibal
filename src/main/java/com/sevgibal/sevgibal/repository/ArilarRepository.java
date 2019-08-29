package com.sevgibal.sevgibal.repository;

import com.sevgibal.sevgibal.entity.Arilar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArilarRepository extends JpaRepository<Arilar, Long> {

    @Query("from arilar where isim =:isim")
    Arilar findByIsim(@Param("isim") String isim);

    @Query("from arilar")
    List<Arilar> arilarList();
}
