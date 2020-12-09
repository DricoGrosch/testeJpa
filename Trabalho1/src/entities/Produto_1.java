/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author drico
 */
@Entity
@Table(name = "produto")
@NamedQueries({
    @NamedQuery(name = "Produto_1.findAll", query = "SELECT p FROM Produto_1 p"),
    @NamedQuery(name = "Produto_1.findById", query = "SELECT p FROM Produto_1 p WHERE p.id = :id"),
    @NamedQuery(name = "Produto_1.findByCategoriaId", query = "SELECT p FROM Produto_1 p WHERE p.categoriaId = :categoriaId"),
    @NamedQuery(name = "Produto_1.findByDescricao", query = "SELECT p FROM Produto_1 p WHERE p.descricao = :descricao"),
    @NamedQuery(name = "Produto_1.findByQtdestoque", query = "SELECT p FROM Produto_1 p WHERE p.qtdestoque = :qtdestoque")})
public class Produto_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "categoria_id")
    private Integer categoriaId;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "qtdestoque")
    private Float qtdestoque;

    public Produto_1() {
    }

    public Produto_1(Integer id) {
        this.id = id;
    }

    public Produto_1(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Integer categoriaId) {
        this.categoriaId = categoriaId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getQtdestoque() {
        return qtdestoque;
    }

    public void setQtdestoque(Float qtdestoque) {
        this.qtdestoque = qtdestoque;
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
        if (!(object instanceof Produto_1)) {
            return false;
        }
        Produto_1 other = (Produto_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Produto_1[ id=" + id + " ]";
    }
    
}
