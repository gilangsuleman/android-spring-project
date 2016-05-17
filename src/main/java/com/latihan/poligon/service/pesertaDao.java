/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.latihan.poligon.service;

import com.latihan.poligon.domain.peserta;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author fikran
 */
public interface pesertaDao extends PagingAndSortingRepository<peserta, String> {
    
}
