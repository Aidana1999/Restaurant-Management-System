import javafx.application.Application;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
//import com.mysql.jdbc.ResultSet;
//import com.mysql.jdbc.Statement;

import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;
import javafx.util.Duration;

public class Login_Password extends Application {
	
	public void start( Stage primaryStage) throws Exception {
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
		vx.setStyle("-fx-background-image:url('file:///C:/Users/Admin/eclipse-workspace/OO_Restaurant/src/נאחלûעûûי.jpg')");
		gr.add(user,0,0);
		gr.add(tx,1,0);
		gr.add(pass, 0, 1);
		gr.add(ps, 1, 1);
		gr.add(hb1, 1, 2);
		gr.setAlignment(Pos.CENTER);
		vx.getChildren().addAll(gr);
		gr.setVgap(5);
		gr.setHgap(5);
		
        
	sk.show();}
	public static void main(String[] args) {
	      launch(args);}}