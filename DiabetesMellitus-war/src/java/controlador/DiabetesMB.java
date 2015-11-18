/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidades.Control;
import entidades.Diabetes;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import sessionBeans.DiabetesSB;

/**
 *
 * @author User
 */
@ManagedBean
@SessionScoped
public class DiabetesMB implements Serializable {

    private Diabetes diabetes;
    private Control controlTmp;
    private String usuario;
    private List<Control> control;
    @EJB
    private DiabetesSB diabetesSB;

    /**
     * Creates a new instance of DiabetesMB
     */
    public DiabetesMB() {
        diabetes = new Diabetes();
        controlTmp = new Control();
    }

    public Diabetes getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(Diabetes diabetes) {
        this.diabetes = diabetes;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Control getControlTmp() {
        return controlTmp;
    }

    public void setControlTmp(Control controlTmp) {
        this.controlTmp = controlTmp;
    }

    public void setDiabetesSB(DiabetesSB diabetesSB) {
        this.diabetesSB = diabetesSB;
    }

    public List<Control> getControl() {
        return control;
    }

    public void setControl(List<Control> control) {
        this.control = control;
    }

    public String reset() {
        diabetes = new Diabetes();
        controlTmp = new Control();
        return null;
    }

    public void guardarTarjetaDiabetes() {
        diabetes.setZ02fechaCaptura(new Date());
        for(Control c : diabetes.getP21control()){
            c.setDiabetes(diabetes);
        }
        int resultado = diabetesSB.guardarTarjeta(diabetes);
        if (resultado == DiabetesSB.ERROR_DESCONOCIDO) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_WARN,
                    "Error",
                    null));
        } else {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_INFO,
                    "Guardado con exito",
                    null));
        }
        reset();

    }

    public void agregarControl() {
//        controlTmp.setId(diabetes.getId() + '-' + (diabetes.getP21control().size() + 1));
//        diabetes.getP21control().add(new Control(diabetes, controlTmp.getId(), controlTmp.getP21fecha(),
//                controlTmp.getP22reingreso(), controlTmp.getP23peso(), controlTmp.getP24imc(),
//                controlTmp.getP25sistolica(), controlTmp.getP26diastolica(), controlTmp.getP27colesterol(),
//                controlTmp.getP28trigliceridos(), controlTmp.getP29glucemia(), controlTmp.getP30nofarmacologico(),
//                controlTmp.getP31farmacologico(), controlTmp.getP32grupoayuda(), controlTmp.getP33complicaciones(),
//                controlTmp.getP34referencia(), controlTmp.getP35baja(), controlTmp.getP36observaciones()));

        diabetes.getP21control().add(controlTmp);
        for(Control c: diabetes.getP21control()){
            System.out.println(c.toString());
        }
        controlTmp = new Control();

    }

    public void init() {
        diabetes = new Diabetes();
        control = new ArrayList<>();
    }

    public void createNew() {
        if (control.contains(diabetes)) {
            FacesMessage msg = new FacesMessage("Registrado", "Ya esta registrado este campo");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        } else {
            control.add(controlTmp);
            diabetes = new Diabetes();
        }
    }

    public void reinit() {
        controlTmp = new Control();

    }
}
