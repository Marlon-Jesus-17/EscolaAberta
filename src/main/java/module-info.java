module escolaaberta {
    requires io.swagger.v3.oas.annotations;
    requires io.swagger.v3.oas.models;
    requires jakarta.persistence;
    requires java.compiler;
    requires static lombok;
    requires org.mapstruct;
    requires spring.beans;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.data.jpa;
    requires spring.tx;
    requires spring.web;
    requires javafx.controls;
    requires javafx.fxml;

    exports com.marlebas.escolaaberta;

    opens com.marlebas.escolaaberta to spring.core, spring.context, spring.beans;
    opens com.marlebas.escolaaberta.models.curso to jakarta.persistence, org.hibernate.orm.core, spring.core;
    opens com.marlebas.escolaaberta.models.escola to jakarta.persistence, org.hibernate.orm.core, spring.core;
    opens com.marlebas.escolaaberta.controllers.ui to javafx.fxml, spring.beans;



}