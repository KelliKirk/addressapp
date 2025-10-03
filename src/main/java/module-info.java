module com.example.addressapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens ch.makery.address to javafx.fxml, javafx.graphics;
    opens ch.makery.address.view to javafx.fxml;

    exports ch.makery.address;
}