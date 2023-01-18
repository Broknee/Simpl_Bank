module simplBank {
requires javafx.controls;
requires java.sql;
requires javafx.fxml;
requires javafx.graphics;

opens controller
 to javafx.graphics, javafx.fxml;
}