/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.NamedQuery;

/**
 *
 * @author User
 */
@Entity
@NamedQuery(name = "Diabetes.findById", query = "SELECT d from Diabetes d where d.id=:id")
public class Diabetes implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String p01unidad;
    private Integer p02jurisdiccion;
    private String p03localidad;
    private String p04entidadFederativa;
    private Integer p05expediente;
    private String p06nombre;
    private String p06aPaterno;
    private String p06aMaterno;
    private String p07curp;
    private Integer p08edad;
    private String p09sexo;
    private Double p10talla;
    private Integer pEtniaIndigena;
    private Double p11peso;
    private Double p12imc;
    private String p13domicilio1;
    private String p14domicilio2;
    private Integer pEnfCardio;
    private Integer pHTA;
    private Integer pDiabetes;
    private Integer pEnfCerebVascular;
    private Integer pDislipidemias;
    private Integer p15abuelos;
    private Integer p15padres;
    private Integer p15tios;
    private Integer p15hermanos;
    private Integer p15otros;
    private Integer p15obesidad;
    private Integer p15alcoholismo;
    private Integer p15dislipidemias;
    private Integer p15sedentarismo;
    private Integer pEnfCardioP;
    private Integer pHTAP;
    private Integer pDiabetesP;
    private Integer pTabaquismo;
    private Integer pDislipidemiasP;
    private Integer pPostMenopausia;
    private Integer pTerapiaDeReemplazo;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date p16fecha;
    private Integer p17deteccionConsulta;
    private Integer p17deteccionIntegral;
    private Integer p18tratamientoPrevio;
    private Integer p19diabetesTipo1;
    private Integer p20diabetesTipo2;
    private Integer pIngreso;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date pFechaIngreso;
    private Integer pReingreso;
    private Integer pDM;
    private Integer pHArt;
    private Integer pObesidad;
    private Integer pDislipidemiasD;
    private Integer pSindromeMeta;
    private Integer pPesquisa;
    private Integer pPorSintomas;
    private Integer pTratamientoPrevio;
    @OneToMany(mappedBy = "diabetes", cascade = CascadeType.ALL)
    private List<Control> p21control;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date z02fechaCaptura;

    public Diabetes() {
        p21control = new ArrayList<Control>();
    }

    public String getP01unidad() {
        return p01unidad;
    }

    public void setP01unidad(String p01unidad) {
        this.p01unidad = p01unidad;
    }

    public Integer getP02jurisdiccion() {
        return p02jurisdiccion;
    }

    public void setP02jurisdiccion(Integer p02jurisdiccion) {
        this.p02jurisdiccion = p02jurisdiccion;
    }

    public String getP03localidad() {
        return p03localidad;
    }

    public void setP03localidad(String p03localidad) {
        this.p03localidad = p03localidad;
    }

    public String getP04entidadFederativa() {
        return p04entidadFederativa;
    }

    public void setP04entidadFederativa(String p04entidadFederativa) {
        this.p04entidadFederativa = p04entidadFederativa;
    }

    public Integer getP05expediente() {
        return p05expediente;
    }

    public void setP05expediente(Integer p05expediente) {
        this.p05expediente = p05expediente;
    }

    public String getP06nombre() {
        return p06nombre;
    }

    public void setP06nombre(String p06nombre) {
        this.p06nombre = p06nombre;
    }

    public String getP06aPaterno() {
        return p06aPaterno;
    }

    public void setP06aPaterno(String p06aPaterno) {
        this.p06aPaterno = p06aPaterno;
    }

    public String getP06aMaterno() {
        return p06aMaterno;
    }

    public void setP06aMaterno(String p06aMaterno) {
        this.p06aMaterno = p06aMaterno;
    }

    public String getP07curp() {
        return p07curp;
    }

    public void setP07curp(String p07curp) {
        this.p07curp = p07curp;
    }

    public Integer getP08edad() {
        return p08edad;
    }

    public void setP08edad(Integer p08edad) {
        this.p08edad = p08edad;
    }

    public String getP09sexo() {
        return p09sexo;
    }

    public void setP09sexo(String p09sexo) {
        this.p09sexo = p09sexo;
    }

    public Double getP10talla() {
        return p10talla;
    }

    public void setP10talla(Double p10talla) {
        this.p10talla = p10talla;
    }

    public Integer getpEtniaIndigena() {
        return pEtniaIndigena;
    }

    public void setpEtniaIndigena(Integer pEtniaIndigena) {
        this.pEtniaIndigena = pEtniaIndigena;
    }

    public Double getP11peso() {
        return p11peso;
    }

    public void setP11peso(Double p11peso) {
        this.p11peso = p11peso;
    }

    public Double getP12imc() {
        return p12imc;
    }

    public void setP12imc(Double p12imc) {
        this.p12imc = p12imc;
    }

    public String getP13domicilio1() {
        return p13domicilio1;
    }

    public void setP13domicilio1(String p13domicilio1) {
        this.p13domicilio1 = p13domicilio1;
    }

    public String getP14domicilio2() {
        return p14domicilio2;
    }

    public void setP14domicilio2(String p14domicilio2) {
        this.p14domicilio2 = p14domicilio2;
    }

    public Integer getpEnfCardio() {
        return pEnfCardio;
    }

    public void setpEnfCardio(Integer pEnfCardio) {
        this.pEnfCardio = pEnfCardio;
    }

    public Integer getpHTA() {
        return pHTA;
    }

    public void setpHTA(Integer pHTA) {
        this.pHTA = pHTA;
    }

    public Integer getpDiabetes() {
        return pDiabetes;
    }

    public void setpDiabetes(Integer pDiabetes) {
        this.pDiabetes = pDiabetes;
    }

    public Integer getpEnfCerebVascular() {
        return pEnfCerebVascular;
    }

    public void setpEnfCerebVascular(Integer pEnfCerebVascular) {
        this.pEnfCerebVascular = pEnfCerebVascular;
    }

    public Integer getpDislipidemias() {
        return pDislipidemias;
    }

    public void setpDislipidemias(Integer pDislipidemias) {
        this.pDislipidemias = pDislipidemias;
    }

    public Integer getP15abuelos() {
        return p15abuelos;
    }

    public void setP15abuelos(Integer p15abuelos) {
        this.p15abuelos = p15abuelos;
    }

    public Integer getP15padres() {
        return p15padres;
    }

    public void setP15padres(Integer p15padres) {
        this.p15padres = p15padres;
    }

    public Integer getP15tios() {
        return p15tios;
    }

    public void setP15tios(Integer p15tios) {
        this.p15tios = p15tios;
    }

    public Integer getP15hermanos() {
        return p15hermanos;
    }

    public void setP15hermanos(Integer p15hermanos) {
        this.p15hermanos = p15hermanos;
    }

    public Integer getP15otros() {
        return p15otros;
    }

    public void setP15otros(Integer p15otros) {
        this.p15otros = p15otros;
    }

    public Integer getpEnfCardioP() {
        return pEnfCardioP;
    }

    public void setpEnfCardioP(Integer pEnfCardioP) {
        this.pEnfCardioP = pEnfCardioP;
    }

    public Integer getpHTAP() {
        return pHTAP;
    }

    public void setpHTAP(Integer pHTAP) {
        this.pHTAP = pHTAP;
    }

    public Integer getpDiabetesP() {
        return pDiabetesP;
    }

    public void setpDiabetesP(Integer pDiabetesP) {
        this.pDiabetesP = pDiabetesP;
    }

    public Integer getpTabaquismo() {
        return pTabaquismo;
    }

    public void setpTabaquismo(Integer pTabaquismo) {
        this.pTabaquismo = pTabaquismo;
    }

    public Integer getpDislipidemiasP() {
        return pDislipidemiasP;
    }

    public void setpDislipidemiasP(Integer pDislipidemiasP) {
        this.pDislipidemiasP = pDislipidemiasP;
    }

    public Integer getpPostMenopausia() {
        return pPostMenopausia;
    }

    public void setpPostMenopausia(Integer pPostMenopausia) {
        this.pPostMenopausia = pPostMenopausia;
    }

    public Integer getpTerapiaDeReemplazo() {
        return pTerapiaDeReemplazo;
    }

    public void setpTerapiaDeReemplazo(Integer pTerapiaDeReemplazo) {
        this.pTerapiaDeReemplazo = pTerapiaDeReemplazo;
    }

    public Integer getP15obesidad() {
        return p15obesidad;
    }

    public void setP15obesidad(Integer p15obesidad) {
        this.p15obesidad = p15obesidad;
    }

    public Integer getP15alcoholismo() {
        return p15alcoholismo;
    }

    public void setP15alcoholismo(Integer p15alcoholismo) {
        this.p15alcoholismo = p15alcoholismo;
    }

    public Integer getP15dislipidemias() {
        return p15dislipidemias;
    }

    public void setP15dislipidemias(Integer p15dislipidemias) {
        this.p15dislipidemias = p15dislipidemias;
    }

    public Integer getP15sedentarismo() {
        return p15sedentarismo;
    }

    public void setP15sedentarismo(Integer p15sedentarismo) {
        this.p15sedentarismo = p15sedentarismo;
    }

    public Date getP16fecha() {
        return p16fecha;
    }

    public void setP16fecha(Date p16fecha) {
        this.p16fecha = p16fecha;
    }

    public Integer getP17deteccionConsulta() {
        return p17deteccionConsulta;
    }

    public void setP17deteccionConsulta(Integer p17deteccionConsulta) {
        this.p17deteccionConsulta = p17deteccionConsulta;
    }

    public Integer getP17deteccionIntegral() {
        return p17deteccionIntegral;
    }

    public void setP17deteccionIntegral(Integer p17deteccionIntegral) {
        this.p17deteccionIntegral = p17deteccionIntegral;
    }

    public Integer getP18tratamientoPrevio() {
        return p18tratamientoPrevio;
    }

    public void setP18tratamientoPrevio(Integer p18tratamientoPrevio) {
        this.p18tratamientoPrevio = p18tratamientoPrevio;
    }

    public Integer getP19diabetesTipo1() {
        return p19diabetesTipo1;
    }

    public void setP19diabetesTipo1(Integer p19diabetesTipo1) {
        this.p19diabetesTipo1 = p19diabetesTipo1;
    }

    public Integer getP20diabetesTipo2() {
        return p20diabetesTipo2;
    }

    public void setP20diabetesTipo2(Integer p20diabetesTipo2) {
        this.p20diabetesTipo2 = p20diabetesTipo2;
    }

    public Integer getpIngreso() {
        return pIngreso;
    }

    public void setpIngreso(Integer pIngreso) {
        this.pIngreso = pIngreso;
    }

    public Date getpFechaIngreso() {
        return pFechaIngreso;
    }

    public void setpFechaIngreso(Date pFechaIngreso) {
        this.pFechaIngreso = pFechaIngreso;
    }

    public Integer getpReingreso() {
        return pReingreso;
    }

    public void setpReingreso(Integer pReingreso) {
        this.pReingreso = pReingreso;
    }

    public Integer getpDM() {
        return pDM;
    }

    public void setpDM(Integer pDM) {
        this.pDM = pDM;
    }

    public Integer getpHArt() {
        return pHArt;
    }

    public void setpHArt(Integer pHArt) {
        this.pHArt = pHArt;
    }

    public Integer getpObesidad() {
        return pObesidad;
    }

    public void setpObesidad(Integer pObesidad) {
        this.pObesidad = pObesidad;
    }

    public Integer getpDislipidemiasD() {
        return pDislipidemiasD;
    }

    public void setpDislipidemiasD(Integer pDislipidemiasD) {
        this.pDislipidemiasD = pDislipidemiasD;
    }

    public Integer getpSindromeMeta() {
        return pSindromeMeta;
    }

    public void setpSindromeMeta(Integer pSindromeMeta) {
        this.pSindromeMeta = pSindromeMeta;
    }

    public Integer getpPesquisa() {
        return pPesquisa;
    }

    public void setpPesquisa(Integer pPesquisa) {
        this.pPesquisa = pPesquisa;
    }

    public Integer getpPorSintomas() {
        return pPorSintomas;
    }

    public void setpPorSintomas(Integer pPorSintomas) {
        this.pPorSintomas = pPorSintomas;
    }

    public Integer getpTratamientoPrevio() {
        return pTratamientoPrevio;
    }

    public void setpTratamientoPrevio(Integer pTratamientoPrevio) {
        this.pTratamientoPrevio = pTratamientoPrevio;
    }

    public List<Control> getP21control() {
        return p21control;
    }

    public void setP21control(List<Control> p21control) {
        this.p21control = p21control;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getZ02fechaCaptura() {
        return z02fechaCaptura;
    }

    public void setZ02fechaCaptura(Date z02fechaCaptura) {
        this.z02fechaCaptura = z02fechaCaptura;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.id);
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
        final Diabetes other = (Diabetes) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "entidades.Diabetes[ id=" + id + " ]";
    }

}
