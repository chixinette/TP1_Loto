package application;

import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;


public class Interface extends Application
{
	// Attributs de la classe 
	
	private AnchorPane root;
	private ListView listBilletClient, listGagnant;
	private ListView<String> liste;
	private ComboBox<String> cbDuree;
	private ObservableList<String> listeDuree;
	private Label label1, label2, label3, label4, label5, label6, label7, label8, label9;
	private Button bouton, bouton2, bouton3;


	public void start(Stage stage)
	{
		listBilletClient = new ListView();
		listBilletClient.setPrefSize(20, 170);

		root.setTopAnchor(listBilletClient, 200.0);
		root.setLeftAnchor(listBilletClient, 10.0);
	
		
		listGagnant = new ListView();
		listGagnant.setPrefSize(20, 170);	
		
		root.setTopAnchor(listGagnant, 200.0);
		root.setRightAnchor(listGagnant, 10.0);
		
		
		listeDuree = FXCollections.observableArrayList("1 an", "5 ans", "10 ans",
				"20 ans", "35 ans");
		cbDuree = new ComboBox<String>(listeDuree);
		cbDuree.setVisibleRowCount(3);
		cbDuree.setValue("1 an");
		
		bouton = new Button("Démarrer tirage");
		bouton.setPrefSize(100, 20);
		
		bouton2 = new Button("Réinistialliser tirage");
		bouton2.setPrefSize(150, 20);
		
		bouton3 = new Button("Quitter");
		bouton3.setPrefSize(100, 20);
		
		root = new AnchorPane();
		root.setPadding(new Insets(10));
		root.getChildren().addAll();
	    
	
		
	    stage.setScene(new Scene(root, 600, 800));
		stage.setTitle("Loterie 6/49");
		stage.show();
	}
	
	public static void main(String[] args)
	{
	launch(args);
	}

	

}
