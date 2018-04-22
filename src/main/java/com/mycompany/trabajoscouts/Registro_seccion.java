/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabajoscouts;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author ADRIAN LUACES
 */
@Entity
public class Registro_seccion implements Serializable {

    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date fechAltaSecc;
    @Temporal(TemporalType.DATE)
    private Date fechBajaSecc;
    @Temporal(TemporalType.DATE)
    private Date fechPromesa;
    @ManyToOne
    private Usuario usuario;
    @ManyToOne
    private Seccion seccion;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @return the seccion
     */
    public Seccion getSeccion() {
        return seccion;
    }
    
    /**
     * @param fechAltaSecc the fechAltaSecc to set
     */
    public void setFechAltaSecc(Date fechAltaSecc) {
        this.fechAltaSecc = fechAltaSecc;
    }

    /**
     * @return the fechBajaSecc
     */
    public Date getFechBajaSecc() {
        return fechBajaSecc;
    }

    /**
     * @param fechBajaSecc the fechBajaSecc to set
     */
    public void setFechBajaSecc(Date fechBajaSecc) {
        this.fechBajaSecc = fechBajaSecc;
    }

    /**
     * @return the fechPromesa
     */
    public Date getFechPromesa() {
        return fechPromesa;
    }

    /**
     * @param fechPromesa the fechPromesa to set
     */
    public void setFechPromesa(Date fechPromesa) {
        this.fechPromesa = fechPromesa;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registro_seccion)) {
            return false;
        }
        Registro_seccion other = (Registro_seccion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.trabajoscouts.Registro_seccion[ id=" + id + " ]";
    }

    /**
     * @return the fechAltaSecc
     */
    public Date getFechAltaSecc() {
        return fechAltaSecc;
    }

    
}
