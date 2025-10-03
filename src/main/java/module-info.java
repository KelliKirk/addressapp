module com.example.addressapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.prefs;
    requires jakarta.xml.bind;

    opens ch.makery.address to javafx.fxml, javafx.graphics;
    opens ch.makery.address.view to javafx.fxml;
    opens ch.makery.address.model to javafx.base, jakarta.xml.bind;
    opens ch.makery.address.util to jakarta.xml.bind, org.glassfish.jaxb.runtime, org.glassfish.jaxb.core;
    opens images;

    exports ch.makery.address;
    exports ch.makery.address.model;
}