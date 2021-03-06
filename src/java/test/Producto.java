/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p")
    , @NamedQuery(name = "Producto.findByIdPrducto", query = "SELECT p FROM Producto p WHERE p.idPrducto = :idPrducto")
    , @NamedQuery(name = "Producto.findByNombre", query = "SELECT p FROM Producto p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Producto.findByPvp", query = "SELECT p FROM Producto p WHERE p.pvp = :pvp")})
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_prducto")
    private Integer idPrducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pvp")
    private int pvp;

    public Producto() {
    }

    public Producto(Integer idPrducto) {
        this.idPrducto = idPrducto;
    }

    public Producto(Integer idPrducto, String nombre, int pvp) {
        this.idPrducto = idPrducto;
        this.nombre = nombre;
        this.pvp = pvp;
    }

    public Integer getIdPrducto() {
        return idPrducto;
    }

    public void setIdPrducto(Integer idPrducto) {
        this.idPrducto = idPrducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPvp() {
        return pvp;
    }

    public void setPvp(int pvp) {
        this.pvp = pvp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPrducto != null ? idPrducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.idPrducto == null && other.idPrducto != null) || (this.idPrducto != null && !this.idPrducto.equals(other.idPrducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.Producto[ idPrducto=" + idPrducto + " ]";
    }
    
}
