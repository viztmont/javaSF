/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vizmont.java.web.pruebajsf.bean;

import java.util.ResourceBundle;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 * Creada: 10/09/2016
 * @author derivsoft
 */
public class AbstractBean {
    
    public static void addInfoMessage(String msg) {
        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, msg);
        FacesContext.getCurrentInstance().addMessage(null, facesMsg);
        FacesContext.getCurrentInstance().validationFailed(); // Se invalida la pagina jsf
    }    
    
    public static void addWarnMessage(String msg) {
        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_WARN, msg, msg);
        FacesContext.getCurrentInstance().addMessage(null, facesMsg);
        FacesContext.getCurrentInstance().validationFailed(); // Se invalida la pagina jsf
    }
    
    public static void addErrorMessage(String msg) {
        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, msg);
        FacesContext.getCurrentInstance().addMessage(null, facesMsg);
        FacesContext.getCurrentInstance().validationFailed(); // Se invalida la pagina jsf
    }    
    
    public static void addInfoMessageContext(String message) {
        String msg = "";
        msg = ResourceBundle.getBundle("/MyBundle",FacesContext.getCurrentInstance().getViewRoot().getLocale()).getString(message);
        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, msg);
        FacesContext.getCurrentInstance().addMessage(null, facesMsg);
        FacesContext.getCurrentInstance().validationFailed(); // Se invalida la pagina jsf

    }     
    
    public static void addErrorMessageContext(String message) {
        String msg = "";
        msg = ResourceBundle.getBundle("/MyBundle",FacesContext.getCurrentInstance().getViewRoot().getLocale()).getString(message);
        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, msg);
        FacesContext.getCurrentInstance().addMessage(null, facesMsg);
        FacesContext.getCurrentInstance().validationFailed(); // Se invalida la pagina jsf

    }    
    

}
