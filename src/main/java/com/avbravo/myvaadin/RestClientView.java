/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avbravo.myvaadin;

import com.avbravo.myvaadin.model.Institution;
import com.avbravo.myvaadin.services.InstitutionServices;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import jakarta.inject.Inject;
/**
 *
 * @author avbravo
 */
@Route("contacts")
public class RestClientView extends VerticalLayout {

    @Inject
    InstitutionServices institutionServices;
    
    public RestClientView() {
        var grid = new Grid<>(Institution.class);
        grid.setItems(institutionServices.findAll());

//        grid.addComponentColumn(contact
//                -> new Image(contact.getPictureUrl(), contact.getName())).setAutoWidth(true);
        
        grid.addColumn(Institution::getIdinstitution).setHeader("Name").setAutoWidth(true);
        grid.addColumn(Institution::getIdinstitution).setHeader("Company").setAutoWidth(true);

//        grid.addComponentColumn(contact
//                -> new DatePicker(contact.getLastInstitutioned(), e
//                        -> Notification.show(contact.getName() + " updated: " + e.getValue())
//                )).setHeader("Last Institutioned").setAutoWidth(true);

add(grid);
    }

}
