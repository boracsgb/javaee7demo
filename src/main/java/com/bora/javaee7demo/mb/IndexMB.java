package com.bora.javaee7demo.mb;

import com.bora.javaee7demo.entity.Kisi;
import com.bora.javaee7demo.entity.Telefon;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Named(value = "indexMB")
@SessionScoped
public class IndexMB implements Serializable {
    
    private Kisi kisi = new Kisi();
    private Telefon cepTel = new Telefon();
    private Telefon evTel = new Telefon();

    
    public IndexMB() {
    }

    public Kisi getKisi() {
        return kisi;
    }

    public void setKisi(Kisi kisi) {
        this.kisi = kisi;
    }

    public Telefon getCepTel() {
        return cepTel;
    }

    public void setCepTel(Telefon cepTel) {
        this.cepTel = cepTel;
    }

    public Telefon getEvTel() {
        return evTel;
    }

    public void setEvTel(Telefon evTel) {
        this.evTel = evTel;
    }
    
    public void ekle()
    {
       List<Telefon> telefonList = new ArrayList<>();
       telefonList.add(evTel);
       telefonList.add(cepTel);
       
       kisi.setTelefonList(telefonList);
       
    }
    
}
