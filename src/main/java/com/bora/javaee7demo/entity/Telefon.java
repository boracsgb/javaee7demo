/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bora.javaee7demo.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Bora
 */
@Entity
@Table(catalog = "demo_database", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Telefon.findAll", query = "SELECT t FROM Telefon t"),
    @NamedQuery(name = "Telefon.findByNo", query = "SELECT t FROM Telefon t WHERE t.no = :no"),
    @NamedQuery(name = "Telefon.findByTelno", query = "SELECT t FROM Telefon t WHERE t.telno = :telno")})
public class Telefon implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer no;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(nullable = false, length = 30)
    private String telno;
    @JoinColumn(name = "kisi_no", referencedColumnName = "no", nullable = false)
    @ManyToOne(optional = false)
    private Kisi kisi;

    public Telefon() {
    }

    public Telefon(Integer no) {
        this.no = no;
    }

    public Telefon(Integer no, String telno) {
        this.no = no;
        this.telno = telno;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    public Kisi getKisi() {
        return kisi;
    }

    public void setKisi(Kisi kisi) {
        this.kisi = kisi;
    }

  

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (no != null ? no.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Telefon)) {
            return false;
        }
        Telefon other = (Telefon) object;
        if ((this.no == null && other.no != null) || (this.no != null && !this.no.equals(other.no))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bora.javaee7demo.entity.Telefon[ no=" + no + " ]";
    }
    
}
