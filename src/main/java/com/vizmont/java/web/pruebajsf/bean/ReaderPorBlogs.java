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

/**
 *
 * @author mvizcarra
 */
@Named(value = "readerPorBlogController")
@ViewScoped
public class ReaderPorBlogs extends AbstractBean implements Serializable {

    public void readersPorblogs() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Mensaje desde el Controlador Readers por Blogs", "Este es un mensaje de prueba."));
    }

}
