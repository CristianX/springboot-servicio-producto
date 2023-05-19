package com.formacionbdi.springboot.app.productos.springbootservicioproducto.models.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "productos")
public class Producto implements Serializable {

    /**
     * 
    */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private Double precio;

    @Column(name = "create_at")
    @Temporal(TemporalType.DATE) // Solo guarda año, mes y día
    private Date createAt;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return this.precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Date getCreateAt() {
        return this.createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    // Generar Serializable (Buena Práctica) iNTERFAZ QUE PERMITE CONVERTIR ESTE
    // OBJECTO EN BYTES Y GUARDARLA EN UNA SESIÓN HTTP
    private static final long serialVersionUID = 3600660286L;
}
