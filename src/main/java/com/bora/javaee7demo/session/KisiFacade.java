/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bora.javaee7demo.session;

import com.bora.javaee7demo.entity.Kisi;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Bora
 */
@Stateless
public class KisiFacade extends AbstractFacade<Kisi> {
    @PersistenceContext(unitName = "demoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public KisiFacade() {
        super(Kisi.class);
    }
    
}
