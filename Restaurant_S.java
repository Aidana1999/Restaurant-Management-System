import java.awt.Color;
import java.sql.*;
import java.util.Random;

import javax.swing.JLabel;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;
 
public class Restaurant_S extends Application {
 Statement state;
 Connection con;
   @Override
   public void start( Stage primaryStage) throws Exception {
	  
			 try {
					
				  Class.forName("com.mysql.jdbc.Driver"); 
				  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant","root","");
				  state=(Statement) con.createStatement();
				  
				  
			 }
			  catch (Exception ex) {
				 
				  System.out.println("error" );
			  }
	  
	   
			 HBox hb1=new HBox();
				HBox hb2=new HBox();
				VBox vx=new VBox();
				GridPane gr=new GridPane();
					Label user=new Label("Username");
					TextField tx=new TextField();
					tx.setPromptText("Email");
					
					Label pass=new Label("Password");
					
					PasswordField ps=new PasswordField();
					ps.setPromptText("Password");
					//hb1.getChildren().addAll(user,tx);'
					//hb2.getChildren().addAll(pass,ps);
					Button log=new Button ("Login");
					Button reg=new Button("Registration");
					hb1.getChildren().addAll(log,reg);
					//vx.getChildren().addAll(hb1,hb2,log);
					vx.setSpacing(7);
				//	hb1.setAlignment(Pos.CENTER);
					hb1.setSpacing(7);
				   vx.setAlignment(Pos.CENTER);
					Scene lp=new Scene(vx, 500,400);
					Stage sk=new Stage();
					sk.setTitle("LoginPage");
					sk.setScene(lp);
					vx.setStyle("-fx-background-image:url('file:///C:/Users/Admin/eclipse-workspace/OO_Restaurant/src/фон.jpg')");
					gr.add(user,0,0);
					gr.add(tx,1,0);
					gr.add(pass, 0, 1);
					gr.add(ps, 1, 1);
					gr.add(hb1, 1, 2);
					gr.setAlignment(Pos.CENTER);
					vx.getChildren().addAll(gr);
					gr.setVgap(5);
					gr.setHgap(5);
					
	   
	   
	   Button button = new Button("WELCOME TO OUR RESTAURANT");
	 //  button.setStyle("-fx-background-radius:35;-fx-background-color:#805CE1;-fx-text-fill:white;");
	 //  button.setPrefSize(150,30);
	 button.setStyle("-fx-text-fill:white;-fx-font-width:bold;-fx-font-size:60");   
	// button.setPadding(new Insets(200,0,0,0));
	 
	// button.setTranslateX(-20);
	// button.setTranslateY(200);
	     button.setFont(new Font("Times New Roman",35));
	     
	      //gr.getChildren().addAll(button);
	      
	 
	 button.setStyle("-fx-background-image:url('file:///C:/Users/Admin/eclipse-workspace/OO_Restaurant/src/Welcome-31.gif')");
 
	   VBox vb = new VBox ();
	   
	   
	   Button btn1 = new Button("MENU");
	   btn1.setPrefSize(150,30);
	  
	   
	   VBox asy=new VBox();
	   ImageView us81 = new ImageView(new Image("file:///C:/Users/Admin/eclipse-workspace/OO_Restaurant/src/gbUamsK8A9M.jpg",400,500,false,false));
	   
	   Button btn2 = new Button("CONTACT");
	   btn2.setPrefSize(150,30);
	   Button bet=new Button("BACK");
	   
	  Pane bp=new Pane();
	  // bet.setAlignment(Pos.BOTTOM_LEFT);
	asy.getChildren().addAll(us81,bet);
	 bet.setPrefSize(100,30);
	// bet.setStyle("-fx-background-image:url('file:///C:/Users/Admin/eclipse-workspace/OO_Restaurant/src/gbUamsK8A9M.jpg')");
	   btn2.setOnAction(e->{
		   Scene scene81=new Scene(asy,400,500);
		   sk.setScene(scene81);
				   
	   });
	  // Button btn3 = new Button("ABOUT US");
	  // btn3.setPrefSize(150,30);
	   Button btn4 = new Button("EXIT");
	   btn4.setPrefSize(150,30);
	   btn4.setOnAction(e->
	   System.exit(0));
	   vb.setPadding(new Insets(170,170,170,170));
	   Button btn5=new Button("BACK");
	   btn5.setPrefSize(150,30);
	   Button btn6 = new Button("BASKET");
	   btn6.setPrefSize(150,30);
	   vb.setStyle("-fx-background-image:url('file:///C:/Users/Admin/eclipse-workspace/midka2/sushi-rolly-nachinka-zelen-6019.jpg')");
	   vb.getChildren().addAll(btn1,btn2,btn4,btn5,btn6);
	   vb.setSpacing(5);
       btn1.setStyle("-fx-background-radius:35;-fx-background-color:white");
       btn2.setStyle("-fx-background-radius:35;-fx-background-color:white");
     //  btn3.setStyle("-fx-background-radius:35;-fx-background-color:white");
       btn4.setStyle("-fx-background-radius:35;-fx-background-color:white");
       btn5.setStyle("-fx-background-radius:35;-fx-background-color:white");
       btn6.setStyle("-fx-background-radius:35;-fx-background-color:white");
	   Scene scene = new Scene(button, 625, 450);
	   reg.setOnAction(even5->{
			if(create(tx.getText(),ps.getText()) ) {
				sk.setScene(scene);
			} else {
				Stage stage5 = new Stage ();
				Label label = new Label ("This username or email is already exist");
				label.setStyle("-fx-text-fill:white");
				VBox vbb = new VBox(label);
				vbb.setStyle("-fx-background-color:red");
				vbb.setAlignment(Pos.CENTER);
				Scene scene5 = new Scene(vbb,250,70);
				stage5.setScene(scene5);
				stage5.show();
			}
		});
	   log.setOnAction((event5) -> {
			if(check(tx.getText(),ps.getText())) {
	        sk.setScene(scene); }
			else {
				Stage stage2 = new Stage ();
				Label label = new Label ("Username or password is incorrect");
				label.setStyle("-fx-text-fill:white");
				VBox gr3 = new VBox(label);
				gr3.setStyle("-fx-background-color:red");
				gr3.setAlignment(Pos.CENTER);
				Scene scene4 = new Scene(gr3,250,70);
			    stage2.setScene(scene4);
			   stage2.show();
			}
			});
	      
	     

          Scene secondScene = new Scene(vb, 500, 500);
          bet.setOnAction((event5)->{
    		  sk.setScene(secondScene);
    		 
    	  });
          // New window (Stage)
          Stage newWindow = new Stage();
          newWindow.setTitle("Second Stage");
         // newWindow.setScene(secondScene);

          // Specifies the modality for new window.
          //newWindow.initModality(Modality.WINDOW_MODAL);

          // Specifies the owner Window (parent) for new window
          newWindow.initOwner(primaryStage);
          newWindow.setTitle("First page");
          newWindow.setScene(scene);
	   //  primaryStage.show();
          // Set position of second window, related to primary window.
          newWindow.setX(primaryStage.getX() + 200);
          newWindow.setY(primaryStage.getY() + 100);
          button.setOnAction(e->{
        	  sk.setScene(secondScene);
        	 
        	  
        	
 	     }); 
          btn5.setOnAction((event5)->{
        		  sk.setScene(scene);
        	  });
         // newWindow.show();
          
          btn1.setOnAction((event5) -> {
              Menu menu = new Menu ();
              ScrollPane p = menu.getMenu(idGet(tx.getText()));
              Scene scene3 = new Scene (p,525,420);
             
              sk.setScene(scene3);
       		});
            primaryStage=sk;	      
          sk.show();
            
	      
	      btn6.setOnAction((event5)->{
	    	  VBox vbox = new VBox();
	    	  try  {
					 ResultSet rs1=(ResultSet) state.executeQuery("select * from basket ");
					 int uid=Integer.parseInt(idGet(tx.getText()));
					 while(rs1.next()) {
						String food = rs1.getString("food");
						String price = rs1.getString("price");
						int userid = rs1.getInt("userid");
						String image=rs1.getString("inage");
						if (uid==userid) {
							vbox.getChildren().addAll(getV(uid,food,price,image));
						}
							
					 } } 
					 catch(Exception e) {
						 System.out.println(e);
					 }
	    	  
	    	  Scene scene7=new Scene(vbox,540,500);
	    	  sk.setScene(scene7);
	      });
	      
	     
	      }

   public boolean check(String uname, String upass) {
		 boolean bool=false;
		 try  {
			 ResultSet rs1=(ResultSet) state.executeQuery("select name , password from user");
			 while(rs1.next()) {
				String name = rs1.getString("name");
				String password = rs1.getString("password");
				if (uname.equalsIgnoreCase(name)& upass.equalsIgnoreCase(password)) {
					bool=true;
				}
					
			 }
		 }
		 catch(Exception e) {
			System.out.println(e); 
		 }
		 return bool;
	        }            
            
   public boolean create (String uname,String upass) {
		 boolean bool=false;
		 try  {
			 ResultSet rs1=(ResultSet) state.executeQuery("select * from user");
			 while(rs1.next()) {
				String name = rs1.getString("name");
			
				int userid=rs1.getInt("userid");
			
				Random rand = new Random();
				int usid=rand.nextInt(101);
				
		
				if (!uname.equalsIgnoreCase(name)||usid==userid) {
					try {
					 state.executeUpdate("INSERT INTO user VALUES ( " + usid + ", '" + uname + "', '"+upass+"' )");	
					bool=true; }
					catch(Exception e1) {
						System.out.println(e1);
					}
				}
					
			 }
		 }
		 catch(Exception e) {
			System.out.println( e); 
		 }
		return bool;
	 }
   public String idGet(String name1) {
		 String uid="";
		 try  {
			 ResultSet rs1=(ResultSet) state.executeQuery("select name , userid from user");
			 while(rs1.next()) {
				String name = rs1.getString("name");
				String userid = rs1.getString("userid");
				if (name1.equalsIgnoreCase(name)) {
					uid+=userid;
				}
					
			 }
		 }
		 catch(Exception e) {
			System.out.println(e); 
		 }
		 return uid;
	        }
   public VBox getV (int userid,String food,String price,String image) {
	   VBox vb = new VBox();
	   Image im = new Image(image,120,120,false,false);
	   ImageView img = new ImageView(im);
	   Label foodl = new Label(food);
	   Label pricel = new Label(price);
	   vb.getChildren().addAll(foodl,img,pricel);
	   return vb;
   }

public static void main(String[] args) {
      launch(args);
   }
 
}