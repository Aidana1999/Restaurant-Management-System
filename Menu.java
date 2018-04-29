import java.awt.Color;
import java.sql.*;

import javax.swing.JLabel;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
public class Menu extends Application {
Statement state;	
Connection con;
	public void start( Stage primaryStage) throws Exception {
		
	}
	public ScrollPane getMenu (String userid) {
		
	
		GridPane tes=new GridPane();
		 try {
				
			  Class.forName("com.mysql.jdbc.Driver"); 
			  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant","root","");
			  state=(Statement) con.createStatement();
			  
			  
		 }
		  catch (Exception ex) {
			 
			  System.out.println("error" );
		  }
 

		
		
		VBox vb1 = new VBox();
		VBox vb2=new VBox();
		VBox vb3=new VBox();
		VBox vb4=new VBox();
		HBox xb=new HBox();
		HBox xb0=new HBox();
		HBox xb1=new HBox();
		HBox xb2=new HBox();HBox xb3=new HBox();HBox xb4=new HBox();HBox xb5=new HBox();HBox xb6=new HBox();HBox xb7=new HBox();
		HBox xb8=new HBox();
		HBox xb9=new HBox();
		HBox xb10=new HBox();
		HBox xb11=new HBox();
		
		Text text = new Text("Salmon tempura");
		text.setFont(Font.font("Helvetica", FontPosture.ITALIC, 15));
		ImageView us = new ImageView(new Image("file:///C:/Users/Admin/eclipse-workspace/OO_Restaurant/src/лосось%20темпура.jpeg",120,120,false,false));
		Button bt=new Button("DELIVER");
		bt.setStyle("-fx-background-radius:35;-fx-background-color:white");
		Label lb=new Label("1080 tng");
		xb0.getChildren().addAll(bt,lb);
		
		
		ImageView us1 = new ImageView(new Image("file:///C:/Users/Admin/eclipse-workspace/OO_Restaurant/src/филадельфия.jpg",120,120,false,false));
		Text text1 = new Text("Philadelphia");
		text1.setFont(Font.font("Helvetica", FontPosture.ITALIC, 15));
		Button bt1=new Button("DELIVER");
		bt1.setStyle("-fx-background-radius:35;-fx-background-color:white");
		Label lb1=new Label("1200 tng");
		xb1.getChildren().addAll(bt1,lb1);
		
		Text text2 = new Text("California ");
		text2.setFont(Font.font("Helvetica", FontPosture.ITALIC, 15));
		text2.setStyle("-fx-fill:white");
		ImageView us2 = new ImageView(new Image("file:///C:/Users/Admin/eclipse-workspace/OO_Restaurant/src/roll-kaliforniya.jpg",120,120,false,false));
		Button bt2=new Button("DELIVER");
		bt2.setStyle("-fx-background-radius:35;-fx-background-color:white");
		Label lb2=new Label("1250 tng");
		xb2.getChildren().addAll(bt2,lb2);
		
		Text text3 = new Text("Yoshi");
		text3.setFont(Font.font("Helvetica", FontPosture.ITALIC, 15));
		ImageView us3 = new ImageView(new Image("file:///C:/Users/Admin/eclipse-workspace/OO_Restaurant/src/йоши.jpg",120,120,false,false));
		Button bt3=new Button("DELIVER");
		bt3.setStyle("-fx-background-radius:35;-fx-background-color:white");
		Label lb3=new Label("1470 tng");
		xb3.getChildren().addAll(bt3,lb3);
		
		Text text4 = new Text("Kaiso");
		text4.setFont(Font.font("Helvetica", FontPosture.ITALIC, 15));
		ImageView us4 = new ImageView(new Image("file:///C:/Users/Admin/eclipse-workspace/OO_Restaurant/src/кайсо.jpeg",120,120,false,false));
		Button bt4=new Button("DELIVER");
		bt4.setStyle("-fx-background-radius:35;-fx-background-color:white");
		Label lb4=new Label("1320 tng");
		xb4.getChildren().addAll(bt4,lb4);
		
		Text text5 = new Text("Lava");
		text5.setFont(Font.font("Helvetica", FontPosture.ITALIC, 15));
		text5.setStyle("-fx-fill:white");
		ImageView us5 = new ImageView(new Image("file:///C:/Users/Admin/eclipse-workspace/OO_Restaurant/src/лава.jpg",120,120,false,false));
		Button bt5=new Button("DELIVER");
		bt5.setStyle("-fx-background-radius:35;-fx-background-color:white");
		Label lb5=new Label("1540 tng");
		xb5.getChildren().addAll(bt5,lb5);
		
		Text text6 = new Text("Las Vegas");
		text6.setFont(Font.font("Helvetica", FontPosture.ITALIC, 15));
	    ImageView us6 = new ImageView(new Image("file:///C:/Users/Admin/eclipse-workspace/OO_Restaurant/src/лас%20вегас.jpeg",120,120,false,false));
	    Button bt6=new Button("DELIVER");
	    bt6.setStyle("-fx-background-radius:35;-fx-background-color:white");
	    Label lb6=new Label("1700 tng");
	    xb6.getChildren().addAll(bt6,lb6);
	    
	    Text text7 = new Text("Hara-kiri");
		text7.setFont(Font.font("Helvetica", FontPosture.ITALIC, 15));
		ImageView us7 = new ImageView(new Image("file:///C:/Users/Admin/eclipse-workspace/OO_Restaurant/src/харакири.jpeg",120,120,false,false));
		Button bt7=new Button("DELIVER");
		bt7.setStyle("-fx-background-radius:35;-fx-background-color:white");
		Label lb7=new Label("1500 tng");
		xb7.getChildren().addAll(bt7,lb7);
		
		Text text8= new Text("Bonito");
		text8.setFont(Font.font("Helvetica", FontPosture.ITALIC, 15));
		text8.setStyle("-fx-fill:white");
		ImageView us8 = new ImageView(new Image("file:///C:/Users/Admin/eclipse-workspace/OO_Restaurant/src/bonito.jpg",120,120,false,false));
		Button bt8=new Button("DELIVER");
		bt8.setStyle("-fx-background-radius:35;-fx-background-color:white");
		Label lb8=new Label("1650 tng");
		xb8.getChildren().addAll(bt8,lb8);
		
		Text text9 = new Text("Dragon");
		text9.setFont(Font.font("Helvetica", FontPosture.ITALIC, 15));
		ImageView us9 = new ImageView(new Image("file:///C:/Users/Admin/eclipse-workspace/OO_Restaurant/src/drakon.jpeg",120,120,false,false));
		Button bt9=new Button("DELIVER");
		bt9.setStyle("-fx-background-radius:35;-fx-background-color:white;");
		Label lb9=new Label("1100 tng");
		xb9.getChildren().addAll(bt9,lb9);
		
		Text text10 = new Text("Europe");
		text10.setFont(Font.font("Helvetica", FontPosture.ITALIC, 15));
		ImageView us10 = new ImageView(new Image("file:///C:/Users/Admin/eclipse-workspace/OO_Restaurant/src/Evropa-hot-480x480.jpg",120,120,false,false));
		Button bt10=new Button("DELIVER");
		bt10.setStyle("-fx-background-radius:35;-fx-background-color:white");
		Label lb10=new Label("1900 tng");
		xb10.getChildren().addAll(bt10,lb10);
		
		Text text11 = new Text("Royal");
		text11.setFont(Font.font("Helvetica", FontPosture.ITALIC, 15));
		text11.setStyle("-fx-fill:white");
		ImageView us11 = new ImageView(new Image("file:///C:/Users/Admin/eclipse-workspace/OO_Restaurant/src/korolevskie.jpeg",120,120,false,false));
		Button bt11=new Button("DELIVER");
		bt11.setStyle("-fx-background-radius:35;-fx-background-color:white");
		Label lb11=new Label("2000 tng");//ImageView us2 = new ImageView(new Image("",120,120,false,false));
		xb11.getChildren().addAll(bt11,lb11);
		
		bt.setOnAction(event5->{
			try {
				System.out.println();
				 state.executeUpdate("INSERT INTO basket VALUES ( " + userid + ", ' Salmon tempura ' , '1080 tng' ,'file:///C:/Users/Admin/eclipse-workspace/OO_Restaurant/src/лосось%20темпура.jpeg' )");	
				 }
				catch(Exception e1) {
					System.out.println(e1);
				}
		});
		
		bt1.setOnAction(event5->{
			try {
				System.out.println();
				 state.executeUpdate("INSERT INTO basket VALUES ( " + userid + ", ' Philadelfia ' , '1200 tng' ,'file:///C:/Users/Admin/eclipse-workspace/OO_Restaurant/src/филадельфия.jpg' )");	
				 }
				catch(Exception e1) {
					System.out.println(e1);
				}
		});
		bt2.setOnAction(event5->{
			try {
				System.out.println();
				 state.executeUpdate("INSERT INTO basket VALUES ( " + userid + ", ' California ' , '1250 tng' ,'file:///C:/Users/Admin/eclipse-workspace/OO_Restaurant/src/roll-kaliforniya.jpg' )");	
				 }
				catch(Exception e1) {
					System.out.println(e1);
				}
		});
		bt3.setOnAction(event5->{
			try {
				System.out.println();
				 state.executeUpdate("INSERT INTO basket VALUES ( " + userid + ", ' Yoshi ' , '1470 tng' ,'file:///C:/Users/Admin/eclipse-workspace/OO_Restaurant/src/йоши.jpg' )");	
				 }
				catch(Exception e1) {
					System.out.println(e1);
				}
		});
		bt4.setOnAction(event5->{
			try {
				System.out.println();
				 state.executeUpdate("INSERT INTO basket VALUES ( " + userid + ", ' Kaiso ' , '1320 tng' ,'file:///C:/Users/Admin/eclipse-workspace/OO_Restaurant/src/кайсо.jpeg' )");	
				 }
				catch(Exception e1) {
					System.out.println(e1);
				}
		});
		bt5.setOnAction(event5->{
			try {
				System.out.println();
				 state.executeUpdate("INSERT INTO basket VALUES ( " + userid + ", ' Lava ' , '1540 tng' ,'file:///C:/Users/Admin/eclipse-workspace/OO_Restaurant/src/лава.jpg' )");	
				 }
				catch(Exception e1) {
					System.out.println(e1);
				}
		});
		bt6.setOnAction(event5->{
			try {
				System.out.println();
				 state.executeUpdate("INSERT INTO basket VALUES ( " + userid + ", ' Las-Vegas' , '1700 tng' ,'file:///C:/Users/Admin/eclipse-workspace/OO_Restaurant/src/лас%20вегас.jpeg' )");	
				 }
				catch(Exception e1) {
					System.out.println(e1);
				}
		});
		bt7.setOnAction(event5->{
			try {
				System.out.println();
				 state.executeUpdate("INSERT INTO basket VALUES ( " + userid + ", ' Hara-kiri ' , '1500 tng' ,'file:///C:/Users/Admin/eclipse-workspace/OO_Restaurant/src/харакири.jpeg' )");	
				 }
				catch(Exception e1) {
					System.out.println(e1);
				}
		});
		bt8.setOnAction(event5->{
			try {
				System.out.println();
				 state.executeUpdate("INSERT INTO basket VALUES ( " + userid + ", ' Bonito ' , '1650 tng' ,'file:///C:/Users/Admin/eclipse-workspace/OO_Restaurant/src/bonito.jpg' )");	
				 }
				catch(Exception e1) {
					System.out.println(e1);
				}
		});
		bt9.setOnAction(event5->{
			try {
				System.out.println();
				 state.executeUpdate("INSERT INTO basket VALUES ( " + userid + ", ' Dragon ' , '1100 tng' ,'file:///C:/Users/Admin/eclipse-workspace/OO_Restaurant/src/drakon.jpeg' )");	
				 }
				catch(Exception e1) {
					System.out.println(e1);
				}
		});
		
		bt10.setOnAction(event5->{
			try {
				System.out.println();
				 state.executeUpdate("INSERT INTO basket VALUES ( " + userid + ", ' Europe ' , '1900 tng' ,'file:///C:/Users/Admin/eclipse-workspace/OO_Restaurant/src/Evropa-hot-480x480.jpg' )");	
				 }
				catch(Exception e1) {
					System.out.println(e1);
				}
		});
		bt11.setOnAction(event5->{
			try {
				System.out.println();
				 state.executeUpdate("INSERT INTO basket VALUES ( " + userid + ", ' Royal ' , '1900 tng' ,'file:///C:/Users/Admin/eclipse-workspace/OO_Restaurant/src/korolevskie.jpeg' )");	
				 }
				catch(Exception e1) {
					System.out.println(e1);
				}
		});
		
		
		vb1.getChildren().addAll(text,us,xb0,text1,us1,xb1,text2,us2,xb2);
		vb1.setSpacing(7);
		vb2.getChildren().addAll(text3,us3,xb3,text4,us4,xb4,text5,us5,xb5);
		vb2.setSpacing(7);
		vb3.getChildren().addAll(text6,us6,xb6,text7,us7,xb7,text8,us8,xb8);
		vb3.setSpacing(7);
		vb4.getChildren().addAll(text9,us9,xb9,text10,us10,xb10,text11,us11,xb11);
		vb4.setSpacing(7);
		xb.getChildren().addAll(vb1,vb2,vb3,vb4);
		xb.setSpacing(10);
		
		Button bat=new Button("BACK");
		Stage primaryStage;
		//bat.setOnAction(e->
			//primaryStage.setScene(secondScene));
		ScrollPane root=new ScrollPane();
		root.setContent(tes);
		tes.add(xb,0, 0);
		tes.setStyle("-fx-background-image:url('file:///C:/Users/Admin/eclipse-workspace/OO_Restaurant/src/sakura.jpg')");
		
		
		//vb1.setStyle("-fx-background-image:url('file:///C:/Users/Admin/eclipse-workspace/OO_Restaurant/src/sakura.jpg')");
		
		
		
		return root;
		}
	
	
	public static void main(String[] args) {
	      launch(args);
	   }
}
