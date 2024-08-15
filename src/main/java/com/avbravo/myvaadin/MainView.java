package com.avbravo.myvaadin;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {

    String password = "";
    String username = "";

    public MainView() {

        addClassName("login-rich-content");

        LoginForm loginForm = new LoginForm();
        loginForm.getElement().getThemeList().add("dark");
        add(loginForm);

        loginForm.addLoginListener(e -> {
            password = e.getPassword();
            username = e.getUsername();
            System.out.println("\t username " + username + " passwrord ");
            if ((username.equals("avbravo") && password.equals("denver"))
                    || (username.equals("aristides.villarreal") && password.equals("demo1223aA@"))) {
                UI.getCurrent().navigate(CompositionView.class);
            } else {
                Notification.show("Credenciales no validas");
            }

        });

 var buttonNotification = new Button("Notification");
   buttonNotification.addClickListener(event ->{
        Notification.show("Hello!");
      
                }
    );
    add(buttonNotification);
    
 var button = new Button("Go FormView");
    button.addClickListener(event ->{
        Notification.show("Hello!");
         UI.getCurrent().navigate(FormView.class);
                }
    );
    add(button);
    
 var buttonCompositionView = new Button("Go CompositionView");
    buttonCompositionView.addClickListener(event ->{
   UI.getCurrent().navigate(CompositionView.class);
                }
    );
    add(buttonCompositionView);
    
 var buttonAppLayoutBasic = new Button("Go app-layout-basic");
    buttonAppLayoutBasic.addClickListener(event ->{
   UI.getCurrent().navigate(AppLayoutBasic.class);
                }
    );
    add(buttonAppLayoutBasic);

     

    }
}
