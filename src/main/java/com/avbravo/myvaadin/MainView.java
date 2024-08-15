package com.avbravo.myvaadin;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

@Route
public class MainView extends VerticalLayout {
 String password ="";
          String username ="";
    public MainView() {

        addClassName("login-rich-content");

        LoginForm loginForm = new LoginForm();
        loginForm.getElement().getThemeList().add("dark");
        add(loginForm);
        
        loginForm.addLoginListener(e -> {
          password = e.getPassword();
       username = e.getUsername();
   System.out.println("\t username "+username + " passwrord ");
   

        });


        System.out.println("\t username "+username + " passwrord ");
        Button button = new Button("Click me",
                event -> add(new Paragraph("Clicked!")));

        add(button);

        TextField firstName = new TextField("First name");
        TextField lastName = new TextField("Last name");
        TextField username = new TextField("Username");
        PasswordField password = new PasswordField("Password");
        PasswordField confirmPassword = new PasswordField("Confirm password");

        FormLayout formLayout = new FormLayout();
        formLayout.add(firstName, lastName, username, password,
                confirmPassword);
        formLayout.setResponsiveSteps(
                // Use one column by default
                new ResponsiveStep("0", 1),
                // Use two columns, if layout's width exceeds 500px
                new ResponsiveStep("500px", 2));
// Stretch the username field over 2 columns
        formLayout.setColspan(username, 2);
        add(formLayout);

        // Create a listing component for a bean type
        Grid<Person> grid = new Grid<>(Person.class);

// Sets items using vararg beans
        grid.setItems(
                new Person("George Washington", 1732),
                new Person("John Adams", 1735),
                new Person("Thomas Jefferson", 1743),
                new Person("James Madison", 1751)
        );
        add(grid);

    }
}
