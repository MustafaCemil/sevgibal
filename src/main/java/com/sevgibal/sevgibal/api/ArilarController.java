package com.sevgibal.sevgibal.api;

import com.sevgibal.sevgibal.dto.ArilarDto;
import com.sevgibal.sevgibal.service.ArilarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/arilar")
public class ArilarController {

    private ArilarService arilarService;

    public ArilarController(ArilarService arilarService){
        this.arilarService = arilarService;
    }

    @RequestMapping(value = "/ekleme",method = RequestMethod.POST)
    public ResponseEntity<ArilarDto> ekleme(@Valid @RequestBody ArilarDto arilarDto){
        try {
            return new ResponseEntity(arilarService.kayit(arilarDto), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.CONFLICT);
        }
    }

    @RequestMapping(value = "/guncelle/{id}", method = RequestMethod.PUT)
    public ResponseEntity<ArilarDto> guncelleme(@PathVariable("id") Long id, @Valid @RequestBody ArilarDto arilarDto){
        try {
            return new ResponseEntity(arilarService.guncelle(arilarDto, id),HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity(HttpStatus.NOT_MODIFIED);
        }
    }

    @RequestMapping(value = "/sil/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Boolean> silme(@PathVariable("id") Long id){
        try {
            return new ResponseEntity(arilarService.silme(id),HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "/kayitBul/{id}", method = RequestMethod.GET)
    public ResponseEntity<ArilarDto> kayitBul(@PathVariable("id") Long id){
        try {
            return new ResponseEntity(arilarService.kayitBul(id),HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
