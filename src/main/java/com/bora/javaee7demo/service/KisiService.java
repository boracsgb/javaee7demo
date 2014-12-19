/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bora.javaee7demo.service;

import com.bora.javaee7demo.entity.Kisi;
import com.bora.javaee7demo.session.KisiFacade;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class KisiService {
    
    @EJB
    private KisiFacade kisiFacade;
    
    
    public void ekle(Kisi p_kisi)
    {
       kisiFacade.create(p_kisi);
    }
    
}
