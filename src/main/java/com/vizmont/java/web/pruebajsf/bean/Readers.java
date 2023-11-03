/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vizmont.java.web.pruebajsf.bean;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.apache.log4j.Logger;

/**
 *
 * @author mvizcarra
 */
@Named(value = "readerController")
@ViewScoped
public class Readers extends AbstractBean implements Serializable {

    private static final Logger logger = Logger.getLogger(Readers.class);

    public void readers() {
        logger.info("");
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Mensaje desde el Controlador Readers", "Este es un mensaje de prueba."));
    }

}
