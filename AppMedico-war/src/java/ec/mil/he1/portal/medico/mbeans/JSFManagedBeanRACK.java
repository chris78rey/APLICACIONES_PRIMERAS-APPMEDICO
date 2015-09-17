/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.portal.medico.mbeans;

import he1.utilities.SesionSeguridades;
import java.awt.event.ActionEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author christian_ruiz
 */
@ManagedBean
@ViewScoped
public class JSFManagedBeanRACK implements Serializable {

    @EJB
    private SesionSeguridades sesionSeguridades;
    private String criterio = "";

    @PostConstruct
    private void init() {
        System.out.println("@PostConstruct");
        try {
//            listaRackPAcientes = sesionSeguridades.listaRackPAcientes("-1111111111111");
        } catch (Exception ex) {
            Logger.getLogger(JSFManagedBeanRACK.class.getName()).log(Level.WARNING, null, ex);
        }

    }

    public void buttonAction(ActionEvent actionEvent) {
        try {
            listaRackPAcientes = sesionSeguridades.listaRackPAcientes(criterio);
            criterio = "";
        } catch (Exception ex) {
            Logger.getLogger(JSFManagedBeanRACK.class.getName()).log(Level.WARNING, null, ex);
        }
    }

    /**
     * Creates a new instance of JSFManagedBeanRACK
     */
    public JSFManagedBeanRACK() {
        try {

        } catch (Exception e) {
        }
    }
    private List<Map> listaRackPAcientes = new ArrayList<>();

    /**
     * @return the listaRackPAcientes
     */
    List data = new ArrayList<HashMap>();

    public List<Map> getListaRackPAcientes() {
        return listaRackPAcientes;
    }

    /**
     * @return the criterio
     */
    public String getCriterio() {
        return criterio;
    }

    /**
     * @param criterio the criterio to set
     */
    public void setCriterio(String criterio) {
        this.criterio = criterio;
    }
}
