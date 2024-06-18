module com.tarefa5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.tarefa5 to javafx.fxml;
    exports com.tarefa5;
}
