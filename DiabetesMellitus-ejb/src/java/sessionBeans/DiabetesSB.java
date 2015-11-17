/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBeans;

import entidades.Diabetes;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author User
 */
@Stateless
@LocalBean
public class DiabetesSB {

    public static int EXITO = 1;
    public static int ENTIDAD_EXISTENTE = 0;
    public static int ERROR_DESCONOCIDO = 2;
    @PersistenceContext(unitName = "DiabetesMellitus-ejbPU")
    private EntityManager em;

    public Diabetes obtenerTarjetaPorExpediente(Long expediente) {
        Query q = em.createNamedQuery("Diabetes.findById");
        q.setParameter("id", expediente);
        List<Diabetes> rm = q.getResultList();
        if (rm.isEmpty()) {
            return null;
        } else {
            return rm.get(0);
        }
    }

    public int guardarTarjeta(Diabetes r) {
        
        try {
            em.persist(r);
            System.out.println("Guardando " + r);
            return EXITO;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ERROR_DESCONOCIDO;

        }
    }

    public List<Diabetes> obtenerSeguimientosMenores() {
        Query q = em.createNamedQuery("Diabetes.findAll");
        return q.getResultList();
    }
}
