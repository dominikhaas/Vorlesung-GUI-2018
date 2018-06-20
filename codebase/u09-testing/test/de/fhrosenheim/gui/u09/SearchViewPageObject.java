package de.fhrosenheim.gui.u09;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import org.loadui.testfx.GuiTest;

public class SearchViewPageObject {

    private final GuiTest guiTest;

    public SearchViewPageObject(GuiTest guiTest) {
        this.guiTest = guiTest;
    }

    void search(String katze) {
        TextField textField = guiTest.find("#query");
        textField.setText(katze);
        
        Button search = guiTest.find("#search");
        guiTest.click(search, MouseButton.PRIMARY);
    }
}
