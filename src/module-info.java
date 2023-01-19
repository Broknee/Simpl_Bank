module simplBank {
requires javafx.controls;
requires java.sql;
requires javafx.fxml;
requires javafx.graphics;
requires java.desktop;

opens controller
 to javafx.graphics, javafx.fxml;
}