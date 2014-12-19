package com.bora.javaee7demo.mb;

import com.bora.javaee7demo.entity.Kisi;
import com.bora.javaee7demo.entity.Telefon;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;


@Named(value = "indexMB")
@SessionScoped
public class IndexMB implements Serializable {
    
    private Kisi kisi = new Kisi();
    private Telefon cepTel = new Telefon();
    private Telefon evTel = new Telefon();

    
    public IndexMB() {
    }
    
}
