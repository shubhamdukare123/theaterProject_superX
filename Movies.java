package C2W_THEATER;
import java.io.*;
import javafx.application.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Movies extends Application {
    public static void main(String[] args){
        launch(args);
    }
    public void start(Stage primaryStage)throws IOException,Exception{
        
            BorderPane root = new BorderPane();
            HBox hBox1 =  new HBox();
            HBox hBox2 =  new HBox();
            HBox hBox3 =  new HBox(30);
            HBox hBox4 =  new HBox();
            HBox hBox5 =  new HBox(30);
            VBox vBox = new VBox();


            //Images Input Action
            InputStream bgInput = new FileInputStream("c2w_theater/src/C2W_THEATER/images/bgImg.PNG");
            InputStream p1Input = new FileInputStream("c2w_theater\\src\\C2W_THEATER\\images\\p1.jpeg");
            InputStream p2Input = new FileInputStream("c2w_theater\\src\\C2W_THEATER\\images\\p2.jpeg");
            InputStream p3Input = new FileInputStream("c2w_theater\\src\\C2W_THEATER\\images\\p3.jpeg");
            InputStream p4Input = new FileInputStream("c2w_theater\\src\\C2W_THEATER\\images\\p4.jpeg");
            InputStream p5Input = new FileInputStream("c2w_theater\\src\\C2W_THEATER\\images\\p5.jpeg");


           //Images Input Thriller
            InputStream p1TInput = new FileInputStream("c2w_theater\\src\\C2W_THEATER\\images\\thriller\\p1.jpeg");
            InputStream p2TInput = new FileInputStream("c2w_theater\\src\\C2W_THEATER\\images\\thriller\\p2.jpeg");
            InputStream p3TInput = new FileInputStream("c2w_theater\\src\\C2W_THEATER\\images\\thriller\\p3.jpeg");
            InputStream p4TInput = new FileInputStream("c2w_theater\\src\\C2W_THEATER\\images\\thriller\\p4.jpeg");
            InputStream p5TInput = new FileInputStream("c2w_theater\\src\\C2W_THEATER\\images\\thriller\\p5.jpeg");


            //Image Object Background
            Image bgImage = new Image(bgInput);


            //Images Objects Action
            Image p1Image = new Image(p1Input);
            Image p2Image = new Image(p2Input);
            Image p3Image = new Image(p3Input);
            Image p4Image = new Image(p4Input);
            Image p5Image = new Image(p5Input);



            //Images Objects Thriller
            Image p1TImage = new Image(p1TInput);
            Image p2TImage = new Image(p2TInput);
            Image p3TImage = new Image(p3TInput);
            Image p4TImage = new Image(p4TInput);
            Image p5TImage = new Image(p5TInput);


            //ImageView Objects
            ImageView p1IView = new ImageView(p1Image);
            ImageView p2IView = new ImageView(p2Image);
            ImageView p3IView = new ImageView(p3Image);
            ImageView p4IView = new ImageView(p4Image);
            ImageView p5IView = new ImageView(p5Image);


            //ImageView Objects Thriller
            ImageView p1TIView = new ImageView(p1TImage);
            ImageView p2TIView = new ImageView(p2TImage);
            ImageView p3TIView = new ImageView(p3TImage);
            ImageView p4TIView = new ImageView(p4TImage);
            ImageView p5TIView = new ImageView(p5TImage);


            //ImageView Resizig Width
            p1IView.setFitWidth(350);
            p2IView.setFitWidth(350);
            p3IView.setFitWidth(350);
            p4IView.setFitWidth(350);
            p4IView.setFitWidth(350);

            //ImageView Resizig Width
            p1IView.setFitHeight(200);
            p2IView.setFitHeight(200);
            p3IView.setFitHeight(200);
            p4IView.setFitHeight(200);
            p5IView.setFitHeight(200);

            //bg Image
            BackgroundImage bgImageObj = new BackgroundImage(bgImage,
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(100, 100, true, true, true, true)
            );
            Background bg = new Background(bgImageObj);
            //
            root.setBackground(bg);
            ///movies text
            Text moviesTxt = new Text("Movies");
            moviesTxt.setFont(Font.font( "Calibri", FontWeight.BOLD,FontPosture.ITALIC, 100));
            moviesTxt.setFill(Color.YELLOWGREEN);
  
            //hbox1 add
            hBox1.getChildren().addAll(moviesTxt);
            hBox1.setAlignment(Pos.BOTTOM_RIGHT);
            hBox1.setMargin(moviesTxt, new Insets(30, 30, 40, 0));

            //Adventure txt
            Text adventureTxt = new Text("Adventure");
            adventureTxt.setFont(Font.font("Calibri", FontWeight.BOLD, FontPosture.ITALIC, 60));
            adventureTxt.setFill(Color.ORANGE);
            
            //hBox2 add 
            hBox2.getChildren().addAll(adventureTxt);
            hBox2.setAlignment(Pos.BOTTOM_LEFT);
            hBox2.setMargin(adventureTxt, new Insets(0, 0, 20, 100));


            //hBox3 Images
            hBox3.getChildren().addAll(p1IView,p2IView,p3IView,p4IView, p5IView);   
            hBox3.setMargin(p1IView, new Insets(0, 0, 50, 100));


            //hBox4
            //Thriller
            Text thrillerTxt = new Text("Thrill Movies");
            thrillerTxt.setFont(Font.font("Calibri", FontWeight.BOLD, FontPosture.ITALIC, 60));
            thrillerTxt.setFill(Color.ORANGE);
            
            //hBox4 add 
            hBox4.getChildren().addAll(thrillerTxt);
            hBox4.setAlignment(Pos.BOTTOM_LEFT);
            hBox4.setMargin(thrillerTxt, new Insets(0, 0, 20, 100));

            //hBox5 Images
            hBox5.getChildren().addAll(p1TIView,p2TIView,p3TIView,p4TIView,p5TIView);   
            hBox5.setMargin(p1TIView, new Insets(0, 0, 30, 100));



            //  vBox add
            vBox.getChildren().addAll(hBox1,hBox2,hBox3,hBox4,hBox5);
            
            //BorderPane
            root.setTop(vBox);



            Scene scene = new Scene(root,1500,700);
            primaryStage.setTitle("Theater");
            primaryStage.setScene(scene);
            primaryStage.show();
      
    }
    
}
