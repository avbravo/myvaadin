/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avbravo.myvaadin;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 *
 * @author avbravo
 */
@Route("composition")
public class CompositionView  extends VerticalLayout {
    
 public CompositionView() {
     
              var buttonLogin = new Button("Login");
    buttonLogin.addClickListener(event ->{
//        Notification.show("Hello!");
         UI.getCurrent().navigate(MainView.class);
                }
    );
    add(buttonLogin);
  var toolbar = new HorizontalLayout(
    new Button("Button 1"),
    new Button("Button 2"),
    new Button("Button 3")
  );
  add(
    toolbar,
    new Paragraph("Paragraph 1"),
    new Paragraph("Paragraph 2"),
    new Paragraph("Paragraph 3")
  );
 }
}
