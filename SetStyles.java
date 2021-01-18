package sample;

public class SetStyles {

    /**
     * @method setStyleForLabel create the appearance of all labels (First and Last name, test, user, date, type of employee)
     * @method setStyleForRadButtons create the appearance of all Radio Buttons (COVID-test and user-type)
     * @method setStyleForText create the appearance of all Text Fields ( field for first and last name)
     * @method setStyleForButtons  create the appearance of all Buttons ( OK and HELP at the main window)
     */

    public static void setStyleForLabel(javafx.scene.control.Label name, int value, javafx.geometry.Pos position, javafx.scene.paint.Paint color, javafx.scene.text.Font font) {
        javafx.scene.layout.GridPane.setRowIndex(name,value);
        javafx.scene.layout.GridPane.setColumnIndex(name, 2);
        name.setAlignment(position);
        name.wrapTextProperty();
        name.setTextFill(color);
        name.setFont(font);
    }

    public static void setStyleForRadButtons(javafx.scene.control.ToggleGroup gr, int value, javafx.scene.control.RadioButton rb) {
        javafx.scene.layout.GridPane.setRowIndex(rb,value);
        javafx.scene.layout.GridPane.setColumnIndex(rb,2);
        rb.setToggleGroup(gr);
    }

    public static void setStyleForText (javafx.scene.control.TextField text, int value)  {
        javafx.scene.layout.GridPane.setRowIndex(text,value);
        javafx.scene.layout.GridPane.setColumnIndex(text,2);
    }

    public static void setStyleForButtons(javafx.scene.control.Button button, int row, int column) {
        javafx.scene.layout.GridPane.setRowIndex(button,row);
        javafx.scene.layout.GridPane.setColumnIndex(button,column);
    }



}


