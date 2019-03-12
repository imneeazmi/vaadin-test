package com.gmail.ie;

import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

@Route("")
@PWA(name = "Project Base for Vaadin Flow", shortName = "Project Base")
@HtmlImport("frontend://styles/shared-styles.html")
public class MainView extends Div {

    public MainView() {

        TextField email = new TextField("Email");
        email.setId("email");
        email.setRequired(true);
        email.setMaxLength(100);

        TextField firstName = new TextField("First Name");
        firstName.setId("firstname");
        firstName.setRequired(true);
        firstName.setMaxLength(100);

        TextField lastName = new TextField("Last Name");
        lastName.setId("lastname");
        lastName.setRequired(true);
        lastName.setMaxLength(100);

        Div nameWrapper = new Div(firstName, lastName);
        nameWrapper.addClassName("nameWrapper");

        PasswordField password = new PasswordField("Password");
        password.setId("password");
        password.setRequired(true);
        password.setMaxLength(20);

        PasswordField confirmPwd = new PasswordField("Confirm Password");
        confirmPwd.setMaxLength(20);
        confirmPwd.setRequired(true);
        confirmPwd.setId("newPassword");
        confirmPwd.setClassName("confirmPwd");

        FormLayout profileForm = new FormLayout(email, nameWrapper, password, confirmPwd);

        add(profileForm);

    }
}
