package application;
	


import javafx.scene.text.Font;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javafx.application.Application; 
import javafx.geometry.Insets; 
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene; 
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text; 
import javafx.stage.Stage; 
import javafx.collections.ObservableList; 
import javafx.scene.input.MouseEvent; 
import javafx.event.EventHandler;
import javafx.scene.paint.Color;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Manager Hotel");
		Label text1= new Label ("Welcome to Manager Hotel");
		Button addbutton= new Button("ADD");
		Button editbutton=new Button("EDIT");
		Button deletebutton=new Button("DELETE");
		text1.setStyle(" -fx-base: white;");
		addbutton.setOnMouseClicked((new EventHandler<MouseEvent>() { 
	         public void handle(MouseEvent event) { 
	        	 addbutton.setStyle("-fx-font: 22 arial; -fx-base: #F0E8B8;");
	                Stage addStage = new Stage();
	                GridPane gridPane = new GridPane();    
	                gridPane.setPadding(new Insets(20, 20, 20, 20)); 
	                gridPane.setVgap(5); 
	                gridPane.setHgap(5);
	                gridPane.setAlignment(Pos.CENTER); 
	                gridPane.setStyle("-fx-font: 22 arial; -fx-base: #F0E8B8;");
	                Label lname =new Label("Last Name:");
	                Label name =new Label("First Name:");
	                Label date =new Label("Date:");
	                Label month =new Label("Month:");
	                Label days =new Label("Days:");
	                Label room =new Label("Room:");
	                Label price =new Label("Price:");
	                Label phone =new Label("Phone:");
	                File file=new File ("MariaCustomer.txt");
	                
	                
	                TextField t1=new TextField();
	                TextField t2=new TextField();
	                TextField t3=new TextField();
	                TextField t4=new TextField();
	                TextField t5=new TextField();
	                TextField t6=new TextField();
	                TextField t7=new TextField();
	                TextField t8=new TextField();
	               
	                Button backStage= new Button("BACK");
	                gridPane.add(backStage, 0,10);
	                backStage.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
		                public void handle(MouseEvent e) {
		                	start(addStage);
		                  }
	                 });
	                
	                Button createcustomer=new Button("Create");
	                DropShadow shadow = new DropShadow();
	                createcustomer.setPrefSize(120, 50);
	                createcustomer.setStyle("-fx-font: 22 arial; -fx-base: white;");
	                backStage.setPrefSize(120, 50);
	                backStage.setStyle("-fx-font: 22 arial; -fx-base: white;");

	                gridPane.add(lname, 0, 0);
	                gridPane.add(name, 0, 1);
	                gridPane.add(date, 0, 2);
	                gridPane.add(month, 0, 3);
	                gridPane.add(days, 0, 4);
	                gridPane.add(room, 0, 5);
	                gridPane.add(price, 0, 6);
	                gridPane.add(phone, 0, 7);
	                
	                gridPane.add(t1, 1, 0);
	                gridPane.add(t2, 1, 1);
	                gridPane.add(t3, 1, 2);
	                gridPane.add(t4, 1, 3);
	                gridPane.add(t5, 1, 4);
	                gridPane.add(t6, 1, 5);
	                gridPane.add(t7, 1, 6);
	                gridPane.add(t8, 1, 7);
	                
	                
	                backStage.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
		                public void handle(MouseEvent e) {
		                	backStage.setEffect(shadow);
		                  }
	                 });
	                backStage.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
		                public void handle(MouseEvent e) {
		                	backStage.setEffect(null);
		                  }
	                 });
	                
	                createcustomer.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
		                public void handle(MouseEvent e) {
		                	createcustomer.setEffect(shadow);
		                  }
	                 });
	                createcustomer.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
		                public void handle(MouseEvent e) {
		                	createcustomer.setEffect(null);
		                  }
	                 });
	                createcustomer.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
		                public void handle(MouseEvent e) {
		                try {	
		                	if(file.exists()) {
								
							}else {
							
								file.createNewFile();
							
							}
							FileWriter write=new FileWriter (file,true);
							write.write(t1.getText()+":"+t2.getText()+":"+t3.getText()+":"+t4.getText()+":"+t5.getText()+":"+t6.getText()+":"+t7.getText()+":"+t8.getText()+"\r\n");
							write.close();
							t1.setText("");
							t2.setText("");
							t3.setText("");
							t4.setText("");
							t5.setText("");
							t6.setText("");
							t7.setText("");
							t8.setText("");
							
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							JOptionPane.showMessageDialog(null, "Saved");
		                }
	                 });
	                gridPane.add(createcustomer,1,10);

	                Scene addScene = new Scene(gridPane,500,500);
	                addStage.setScene(addScene);
	                addStage.show();
	                primaryStage.close();
	                
	          } 
	       })); 
		editbutton.setOnMouseClicked((new EventHandler<MouseEvent>() { 
	         public void handle(MouseEvent event) { 
	        	 editbutton.setStyle("-fx-font: 22 arial; -fx-base: #b6e7c9;");
	          } 
	       }));
		deletebutton.setOnMouseClicked((new EventHandler<MouseEvent>() { 
	         public void handle(MouseEvent event) { 
	        	 deletebutton.setStyle("-fx-font: 22 arial; -fx-base: #b6e7c9;");
	          } 
	       }));
		
		
		
	    VBox vBox = new VBox(); 
	    vBox.setStyle("-fx-font: 22 arial; -fx-base: #787878;");
	    text1.setTextFill(Color.WHITE);
	    text1.setFont(new Font("Italic", 40));
	    addbutton.setStyle("-fx-base: white;");
	    editbutton.setStyle("-fx-base: white;");
	    deletebutton.setStyle("-fx-base: white;");

	    vBox.setSpacing(30);   
	    vBox.setMargin(text1, new Insets(20, 20, 20, 20));  
	    vBox.setMargin(addbutton, new Insets(20, 20, 20, 20)); 
	    vBox.setMargin(editbutton, new Insets(20, 20, 20, 20));  
	    vBox.setMargin(deletebutton, new Insets(20, 20, 20, 20));  
	    ObservableList list = vBox.getChildren(); 
	    list.addAll(text1,addbutton,editbutton,deletebutton);
	    vBox.setAlignment(Pos.CENTER);
	    Scene scene = new Scene(vBox,600,600);
	    primaryStage.setScene(scene);
	    primaryStage.show();
	}
	
	public static void main(String[] args) {
		
		launch(args);

	}
}
