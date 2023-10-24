module com.example.crudapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.crudapp to javafx.fxml;
    exports com.example.crudapp;
}