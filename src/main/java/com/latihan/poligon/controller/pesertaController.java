/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.latihan.poligon.controller;

import com.latihan.poligon.domain.peserta;
import com.latihan.poligon.service.pesertaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * 
 */
@RestController
@RequestMapping("/api/peserta")
public class pesertaController {

    @Autowired
    private pesertaDao pesertaDao;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public peserta finPesertaById(@PathVariable String id) {
        return pesertaDao.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void save(@RequestBody peserta p) {
        pesertaDao.save(p);
    }

    @RequestMapping(method = RequestMethod.GET)
    public Page<peserta> findAll(Pageable pageable) {
        return pesertaDao.findAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id) {
        peserta p = pesertaDao.findOne(id);
        if (p != null) {
            pesertaDao.delete(p);
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void edit(@PathVariable String id, @RequestBody peserta p) throws Exception {
        peserta peserta = pesertaDao.findOne(id);
        if (peserta != null) {
            p.setId(id);
            pesertaDao.save(p);
        } else {
            throw new Exception("object dengan id : " + id + "tidak diturunkan");
        }

    }
}