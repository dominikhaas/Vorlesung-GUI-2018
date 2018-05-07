package de.fhrosenheim.gui.u09;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Übung 09 - Suche ohne FXML
 * 
 * @author dominik.haas
 */
public class SearchApplication extends Application {
    
    @Override
    public void start(Stage primaryStage) {      
        SearchView root = new SearchView(new SearchService(), new ConsoleSearchResultSink());
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Search");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
