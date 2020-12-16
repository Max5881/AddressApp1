package ru.sapteh;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import ru.sapteh.model.Person;
import ru.sapteh.view.PersonOverviewController;


import java.io.IOException;

public class MainApp extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;

    private ObservableList<Person> personDate = FXCollections.observableArrayList();

    public MainApp() {
        personDate.add(new Person("Han","Solo"));
        personDate.add(new Person("Obivan","Kenobi"));
        personDate.add(new Person("Luk","Skaioker"));
        personDate.add(new Person("Fredy","Kruger"));
        personDate.add(new Person("Toni","Starck"));
        personDate.add(new Person("Elizaveta","Doroga"));
        personDate.add(new Person("Bobi","Bob"));
        personDate.add(new Person("Tugarin","Zmey"));
        personDate.add(new Person("Alexa","Popovich"));
    }
    public ObservableList<Person> getPersonDate() {
        return personDate;
    }

    @Override
    public void start(Stage primaryStage){
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("AddressApp");

        initRootLayout();

        showPersonOverview();
    }

    public void initRootLayout() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void showPersonOverview(){
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/PersonOverview.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();

            rootLayout.setCenter(personOverview);

            PersonOverviewController controller = loader.getController();
            controller.setMainApp(this);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public Stage getPrimaryStage(){
        return primaryStage;
    }
    public static void main(String[] args){
        launch(args);
    }
}
