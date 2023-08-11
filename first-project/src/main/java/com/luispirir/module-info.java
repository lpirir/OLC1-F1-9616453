module first-project {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.luispirir to javafx.fxml;
    exports com.luispirir;
}