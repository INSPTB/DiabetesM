/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author User
 */
@Entity
public class Control implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date p21fecha;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date p22reingreso;
    private Double p23peso;
    private Double p24imc;
    private Integer p25sistolica;
    private Integer p26diastolica;
    private Integer p27colesterol;
    private Integer p28trigliceridos;
    private Integer p29glucemia;
    private String p30nofarmacologico;
    private String p31farmacologico;
    private String p32grupoayuda;
    private String p33complicaciones;
    private Integer p34referencia;
    private Integer p35baja;
    private String p36observaciones;
    @ManyToOne
    private Diabetes diabetes;

    public Control(Diabetes rm, Long id, Date fecha, Date reingreso, Double peso, Double imc,
            Integer sistolica, Integer diastolica, Integer colesterol,
            Integer trigliceridos, Integer glucemia, String nofarmacologico,
            String farmacologico, String grupoayuda, String complicaciones,
            Integer referencia, Integer baja, String observaciones) {
        this.diabetes = rm;
        this.id = id;
        this.p21fecha = fecha;
        this.p22reingreso = reingreso;
        this.p23peso = peso;
        this.p24imc = imc;
        this.p25sistolica = sistolica;
        this.p26diastolica = diastolica;
        this.p27colesterol = colesterol;
        this.p28trigliceridos = trigliceridos;
        this.p29glucemia = glucemia;
        this.p30nofarmacologico = nofarmacologico;
        this.p31farmacologico = farmacologico;
        this.p32grupoayuda = grupoayuda;
        this.p33complicaciones = complicaciones;
        this.p34referencia = referencia;
        this.p35baja = baja;
        this.p36observaciones = observaciones;

    }

    public Control() {

    }

    public Date getP21fecha() {
        return p21fecha;
    }

    public void setP21fecha(Date p21fecha) {
        this.p21fecha = p21fecha;
    }

    public Date getP22reingreso() {
        return p22reingreso;
    }

    public void setP22reingreso(Date p22reingreso) {
        this.p22reingreso = p22reingreso;
    }

    public Double getP23peso() {
        return p23peso;
    }

    public void setP23peso(Double p23peso) {
        this.p23peso = p23peso;
    }

    public Double getP24imc() {
        return p24imc;
    }

    public void setP24imc(Double p24imc) {
        this.p24imc = p24imc;
    }

    public Integer getP25sistolica() {
        return p25sistolica;
    }

    public void setP25sistolica(Integer p25sistolica) {
        this.p25sistolica = p25sistolica;
    }

    public Integer getP26diastolica() {
        return p26diastolica;
    }

    public void setP26diastolica(Integer p26diastolica) {
        this.p26diastolica = p26diastolica;
    }

    public Integer getP27colesterol() {
        return p27colesterol;
    }

    public void setP27colesterol(Integer p27colesterol) {
        this.p27colesterol = p27colesterol;
    }

    public Integer getP28trigliceridos() {
        return p28trigliceridos;
    }

    public void setP28trigliceridos(Integer p28trigliceridos) {
        this.p28trigliceridos = p28trigliceridos;
    }

    public Integer getP29glucemia() {
        return p29glucemia;
    }

    public void setP29glucemia(Integer p29glucemia) {
        this.p29glucemia = p29glucemia;
    }

    public String getP30nofarmacologico() {
        return p30nofarmacologico;
    }

    public void setP30nofarmacologico(String p30nofarmacologico) {
        this.p30nofarmacologico = p30nofarmacologico;
    }

    public String getP31farmacologico() {
        return p31farmacologico;
    }

    public void setP31farmacologico(String p31farmacologico) {
        this.p31farmacologico = p31farmacologico;
    }

    public String getP32grupoayuda() {
        return p32grupoayuda;
    }

    public void setP32grupoayuda(String p32grupoayuda) {
        this.p32grupoayuda = p32grupoayuda;
    }

    public String getP33complicaciones() {
        return p33complicaciones;
    }

    public void setP33complicaciones(String p33complicaciones) {
        this.p33complicaciones = p33complicaciones;
    }

    public Integer getP34referencia() {
        return p34referencia;
    }

    public void setP34referencia(Integer p34referencia) {
        this.p34referencia = p34referencia;
    }

    public Integer getP35baja() {
        return p35baja;
    }

    public void setP35baja(Integer p35baja) {
        this.p35baja = p35baja;
    }

    public String getP36observaciones() {
        return p36observaciones;
    }

    public void setP36observaciones(String p36observaciones) {
        this.p36observaciones = p36observaciones;
    }

    public Diabetes getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(Diabetes diabetes) {
        this.diabetes = diabetes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
        hash = 47 * hash + Objects.hashCode(this.p23peso);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Control other = (Control) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.p23peso, other.p23peso)) {
            return false;
        }
        return true;
    }

    

    @Override
    public String toString() {
        return "entidades.Control[ id=" + id + "  ]";
    }

}
