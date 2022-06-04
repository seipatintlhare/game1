package com.example.mygame;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class HelloApplication extends Application {
    int Score = 0;

    @Override
    public void start(Stage stage) throws IOException {

         Pane root = new Pane();
        /********************getting image from resource folder***************/
        Rectangle plane= new Rectangle(200,200);
        Image img1 = new Image("/plane.png");
       // Image img1= new Image("/plane.png ");

        /**********************resizing the plane*********************/
        plane.setFill(new ImagePattern(img1));
        plane.setY(200);
        plane.setX(20);


        /************************getting clouds from the resource folder**************/
        Rectangle cloudone = new   Rectangle(100, 100);
        Image imgone= new Image("/cc.png");
        cloudone.setX(500);
        cloudone.setY(0);
        cloudone.setFill(new ImagePattern(imgone));



        Rectangle cloudtwo = new Rectangle(100, 100);
        Image imgtwo= new Image("/cl.png");
        cloudtwo.setX(960);
        cloudtwo.setY(300);
        cloudtwo.setFill(new ImagePattern(imgtwo));


        Rectangle cloudthree = new Rectangle(100, 100);
        Image imgthree= new Image("/cld.png");
        cloudthree.setX(1330);
        cloudthree.setY(250);
        cloudthree.setFill(new ImagePattern(imgthree));

        Rectangle coin = new Rectangle(100, 100);
        Image imgsvn =  new Image("/coin.png");
        coin.setX(100);
        coin.setY(200);
        coin.setFill(new ImagePattern(imgsvn));

        Rectangle coin1 = new Rectangle(100, 100);
        Image imgsv =  new Image("/coin.png");
        coin.setX(1000);
        coin.setY(100);
        coin.setFill(new ImagePattern(imgsv));


        Rectangle cloudfour = new Rectangle(100, 100);
        Image imgfour= new Image("/cll.png");
        cloudfour.setX(100);
        cloudfour.setY(600);
        cloudfour.setFill(new ImagePattern(imgfour));


        Rectangle cloudfive = new Rectangle(100, 100);
        Image imgfive= new Image("/c.png");
        cloudfive.setX(1200);
        cloudfive.setY(100);
        cloudfive.setFill(new ImagePattern(imgfive));



        Rectangle cloudsix = new Rectangle(100, 100);
        Image imgsix= new Image("/clr.png");
        cloudsix.setX(1400);
        cloudsix.setY(400);
        cloudsix.setFill(new ImagePattern(imgsix));

        /**************************creating control buttons for game*************************/
        Label controls = new Label();
        Label play = new Label("Play");
        play.setId("lbPlay");
        Label stop= new Label("stop");
        stop.setId("lbStop");
        controls.setVisible(true);

        /****************************creating labels for scores******************/
        Label scoreDisplay= new Label("Score:");
        scoreDisplay.setId("dsScore");
        scoreDisplay.setLayoutX(600);
        Label storeScore = new Label();
        storeScore.setId("stScore");
        storeScore.setAlignment(Pos.CENTER_RIGHT);

        HBox box= new HBox();
        box.getChildren().addAll(scoreDisplay,storeScore);
        box.setId("box");

        HBox box2 = new HBox(20,play,stop);
        box2.setAlignment(Pos.CENTER);
       // box2.getChildren().addAll(play,stop);
        box2.setId("bottomBox");



        // Adding animation
        TranslateTransition trans = new TranslateTransition();
        trans.setAutoReverse(false);
        trans.setByX(-1600);
        trans.setCycleCount(9000);
        trans.setDuration(Duration.millis(9000));
        trans.setNode(cloudfive);

        // Adding animation
        TranslateTransition trans2 = new TranslateTransition();
        trans2.setAutoReverse(false);
        trans2.setByX(-1300);
        trans2.setCycleCount(9000);
        trans2.setDuration(Duration.millis(9000));
        trans2.setNode(cloudfour);

        // Adding animation
        TranslateTransition trans3 = new TranslateTransition();
        trans3.setAutoReverse(false);
        trans3.setByX(-1500);
        trans3.setCycleCount(9000);
        trans3.setDuration(Duration.millis(9000));
        trans3.setNode(cloudthree);

        // Adding animation
        TranslateTransition trans4 = new TranslateTransition();
        trans4.setAutoReverse(false);
        trans4.setByX(-1300);
        trans4.setCycleCount(9000);
        trans4.setDuration(Duration.millis(9000));
        trans4.setNode(cloudtwo);

        // Adding animation
        TranslateTransition trans5 = new TranslateTransition();
        trans5.setAutoReverse(false);
        trans5.setByX(-1500);
        trans5.setCycleCount(9000);
        trans5.setDuration(Duration.millis(9000));
        trans5.setNode(cloudsix);

        // Adding animation
        TranslateTransition trans6 = new TranslateTransition();
        trans6.setAutoReverse(false);
        trans6.setByX(-1300);
        trans6.setCycleCount(9000);
        trans6.setDuration(Duration.millis(9000));
        trans6.setNode(cloudone);

        // Adding animation
        TranslateTransition trans7 = new TranslateTransition();
        trans7.setAutoReverse(false);
        trans7.setByX(-1600);
        trans7.setCycleCount(9000);
        trans7.setDuration(Duration.millis(900));
        trans7.setNode(coin);

        TranslateTransition trans8 = new TranslateTransition();
        trans8.setAutoReverse(false);
        trans8.setByX(-1400);
        trans8.setCycleCount(9000);
        trans8.setDuration(Duration.millis(900));
        trans8.setNode(coin1);


        Label label = new Label();
        label.setText("Score:");
        label.setLayoutX(1100);
        label.setLayoutY(0);
        label.setVisible(true);
        root.getChildren().add(label);

        Label label1 = new Label();
        label1.setText("You wanna have some fun? press Enter!");
        label1.setLayoutX(0);
        label1.setLayoutY(0);
        label1.setVisible(true);
        label1.setFont(Font.font("BOLD", FontWeight.BOLD,15));
        root.getChildren().add(label1);

        Label scorecount = new Label();
        scorecount.setText(" ");
        scorecount.setLayoutX(1150);
        scorecount.setLayoutY(1);
        root.getChildren().add(scorecount);

        coin.translateXProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                if (plane.getBoundsInParent().intersects(coin.getBoundsInParent())){
                    Score+=100;
                    scorecount.setText(Score+" ");

                }
            }
        });
        coin1.translateXProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                if (plane.getBoundsInParent().intersects(coin1.getBoundsInParent())){
                    Score+=100;
                    scorecount.setText(Score+" ");

                }
            }
        });



        cloudone.translateXProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                if (plane.getBoundsInParent().intersects(cloudone.getBoundsInParent())){

                    Label big = new Label();
                    big.setText("GAME OVER!!");
                    big.setLayoutX(500);
                    big.setLayoutY(300);
                   // big.setAlignment(Pos.CENTER);
                    big.setId("BIG");
                    root.getChildren().add(big);
                    trans6.stop();
                    trans.stop();
                    trans2.stop();
                    trans4.stop();
                    trans3.stop();
                    trans5.stop();
                    trans7.stop();


                }
            }
        });
        cloudtwo.translateXProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                if (plane.getBoundsInParent().intersects(cloudtwo.getBoundsInParent())){

                    Label big = new Label();
                    big.setText("GAME OVER!!");
                    big.setLayoutX(500);
                    big.setLayoutY(300);
                    // big.setAlignment(Pos.CENTER);
                    big.setId("BIG");
                    root.getChildren().add(big);
                    trans6.stop();
                    trans.stop();
                    trans2.stop();
                    trans4.stop();
                    trans3.stop();
                    trans5.stop();
                    trans7.stop();


                }
            }
        });
        cloudthree.translateXProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                if (plane.getBoundsInParent().intersects(cloudthree.getBoundsInParent())){

                    Label big = new Label();
                    big.setText("GAME OVER!!");
                    big.setLayoutX(500);
                    big.setLayoutY(300);
                    // big.setAlignment(Pos.CENTER);
                    big.setId("BIG");
                    root.getChildren().add(big);
                    trans6.stop();
                    trans.stop();
                    trans2.stop();
                    trans4.stop();
                    trans3.stop();
                    trans5.stop();
                    trans7.stop();


                }
            }
        });
        cloudfour.translateXProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                if (plane.getBoundsInParent().intersects(cloudfour.getBoundsInParent())){

                    Label big = new Label();
                    big.setText("GAME OVER!!");
                    big.setLayoutX(500);
                    big.setLayoutY(300);
                    // big.setAlignment(Pos.CENTER);
                    big.setId("BIG");
                    root.getChildren().add(big);
                    trans6.stop();
                    trans.stop();
                    trans2.stop();
                    trans4.stop();
                    trans3.stop();
                    trans5.stop();
                    trans7.stop();


                }
            }
        });
        cloudfive.translateXProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                if (plane.getBoundsInParent().intersects(cloudfive.getBoundsInParent())){

                    Label big = new Label();
                    big.setText("GAME OVER!!");
                    big.setLayoutX(500);
                    big.setLayoutY(300);
                    // big.setAlignment(Pos.CENTER);
                    big.setId("BIG");
                    root.getChildren().add(big);
                    trans6.stop();
                    trans.stop();
                    trans2.stop();
                    trans4.stop();
                    trans3.stop();
                    trans5.stop();
                    trans7.stop();


                }
            }
        });
        cloudsix.translateXProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                if (plane.getBoundsInParent().intersects(cloudsix.getBoundsInParent())){

                    Label big = new Label();
                    big.setText("GAME OVER!!");
                    big.setLayoutX(500);
                    big.setLayoutY(300);
                    // big.setAlignment(Pos.CENTER);
                    big.setId("BIG");
                    root.getChildren().add(big);
                    trans6.stop();
                    trans.stop();
                    trans2.stop();
                    trans4.stop();
                    trans3.stop();
                    trans5.stop();
                    trans7.stop();

                }
            }
        });






        root.getChildren().add(plane);
        root.getChildren().add(cloudtwo);
        root.getChildren().add(cloudone);
        root.getChildren().add(cloudthree);
        root.getChildren().add(cloudfour);
        root.getChildren().add(cloudfive);
        root.getChildren().add(cloudsix);
        root.getChildren().add(coin);
        //root.getChildren().add(coin1);
        //root.getChildren().add(label);

//        root.setTop(box);
//        root.setBottom(box2);

//        if (rex.getBoundsInParent().intersects(regCoin.getBoundsInParent())) {
//            int  newScore=0;
//            score+=20;
//            storeScore.setText(score+" ");
//            //pauseGame();
//        }


        String style= getClass().getResource("/style.css").toExternalForm();
        root.getStylesheets().add(style);
        Scene scene = new Scene(root, 700, 600);
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                double y=200;
                double x=200;
                switch(keyEvent.getCode()){
                    case UP :
                        y-=100;
                        plane.setY(y);
                        plane.setX(40);
                        break;

                    case DOWN :
                        y+=100;
                        plane.setY(y);
                        plane.setX(40);
                        break;

                    case ENTER:
                        trans.stop();
                        trans2.stop();
                        trans4.stop();
                        trans3.stop();
                        trans5.stop();
                        trans6.stop();
                        trans7.stop();
                        break;

                    case LEFT:
                        x-=100;
                        plane.setX(x);

                        //plane.setY(40);

                    case RIGHT:
                        x+=100;
                        plane.setX(x);
                        //plane.setY(40);


                    case SPACE:
//                        if(box.isPressed()){
//                            trans.play();
//
//                        }
//                        else {
//                            trans.stop();
//                        }

                        trans.play();
                        trans2.play();
                        trans4.play();
                        trans3.play();
                        trans5.play();
                        trans6.play();
                        trans7.play();


                }
            }


        });
        stage.setScene(scene);
        stage.show();




    }
   // public void Game() {

   // }

    public static void main(String[] args) {
        launch();
    }
}