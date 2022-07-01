package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class Main extends Application {
	
	@Override
	public void start(Stage escenario) throws Exception {
		
		TextField usuario = new TextField("Usuario...");
		TextField clave = new TextField("Contraseña...");
		Button login = new Button("Iniciar  sesión");
		//Label titulo = new Label("Mensajería");
		
		usuario.setFont(Font.font("Agency FB", FontWeight.BLACK, 14));
		//user.setFocusTraversable(false);
		usuario.setMaxWidth(180);
		usuario.setMinHeight(30);
		
		clave.setFont(Font.font("Agency FB", FontWeight.BLACK, 14));
		//clave.setFocusTraversable(false);
		clave.setMaxWidth(180);
		
		login.setFont(Font.font("Bauhaus 93", FontWeight.NORMAL, 14));
		login.setMinHeight(30);
		
		//titulo.setFont(Font.font("Bauhaus 93", FontWeight.EXTRA_BOLD, 18));
		//titulo.setStyle("-fx-text-fill: orange");
		
		usuario.setOnMousePressed(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				if(usuario.getText().equals("Usuario...")) {
					usuario.deleteText(0, 10);
				}
			}
		});
		
		clave.setOnMousePressed(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				if(clave.getText().equals("Contraseña...")) {
					clave.deleteText(0, 13);
				}					
			}	
		});
		
		VBox izq = new VBox(15);
		izq.setAlignment(Pos.CENTER);
		izq.getChildren().addAll(usuario,clave,login);
			
		
		Scene escena = new Scene(izq, 400, 250);
		//escenario.getIcons().add(new Image(""));
		escenario.setTitle("MensajeríaMQTT");
		escenario.setScene(escena);
		escenario.show();
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}