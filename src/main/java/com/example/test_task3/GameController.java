package com.example.test_task3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Pair;

import static com.example.test_task3.Card.equalsCard;

public class GameController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView backCard;

    @FXML
    private ImageView gamindCard1;

    @FXML
    private ImageView gamindCard2;

    @FXML
    private ImageView gamindCard3;

    @FXML
    private ImageView gamindCard4;


    @FXML
    private ImageView botCard1;

    @FXML
    private ImageView botCard2;

    @FXML
    private ImageView botCard3;

    @FXML
    private ImageView botCard4;

    @FXML
    private ImageView botCard5;

    @FXML
    private ImageView botCard6;

    @FXML
    private ImageView botCard7;

    @FXML
    private ImageView botCard8;

    @FXML
    private Button eightButton;

    @FXML
    private Button fanButton;

    @FXML
    private Button jackButton;

    @FXML
    private Button kingButton;

    @FXML
    private Button ladyButton;

    @FXML
    private Button nineButton;

    @FXML
    private ImageView playerFanCard1;

    @FXML
    private ImageView playerFanCard2;

    @FXML
    private ImageView playerFanCard3;

    @FXML
    private ImageView playerFanCard4;

    @FXML
    private ImageView playerFanCard5;

    @FXML
    private ImageView playerFanCard6;

    @FXML
    private ImageView playerFanCard7;

    @FXML
    private ImageView playerFanCard8;

    @FXML
    private ImageView preGamingPlayerCard1;

    @FXML
    private ImageView preGamingPlayerCard2;

    @FXML
    private ImageView preGamingPlayerCard3;

    @FXML
    private ImageView preGamingPlayerCard4;

    @FXML
    private Button rulesButton;

    @FXML
    private Button sevenButton;

    @FXML
    private Button sixButton;

    @FXML
    private Button startGameButton;

    @FXML
    private Button tenButton;

    @FXML
    void initialize() {

        Player player = new Player();
        ArrayList<Pair<Integer, Suit>> playerFan = player.getFan();

        ArrayList<ImageView> playersFanImages = new ArrayList<>();
        playersFanImages.add(playerFanCard1);
        playersFanImages.add(playerFanCard2);
        playersFanImages.add(playerFanCard3);
        playersFanImages.add(playerFanCard4);
        playersFanImages.add(playerFanCard5);
        playersFanImages.add(playerFanCard6);
        playersFanImages.add(playerFanCard7);
        playersFanImages.add(playerFanCard8);



        ArrayList<Integer> abilityOfPre = new ArrayList<>();
        abilityOfPre.add(0);
        abilityOfPre.add(1);
        abilityOfPre.add(2);
        abilityOfPre.add(3);


        ArrayList<ImageView> preFan = new ArrayList<>();
        preFan.add(preGamingPlayerCard1);
        preFan.add((preGamingPlayerCard2));
        preFan.add((preGamingPlayerCard3));
        preFan.add(preGamingPlayerCard4);



//        ArrayList<Pair<ImageView,Integer>> preFan = new ArrayList<>();
//        preFan.add(new Pair<>(preGamingPlayerCard1,0));
//        preFan.add(new Pair<>(preGamingPlayerCard2,0));
//        preFan.add(new Pair<>(preGamingPlayerCard3,0));
//        preFan.add(new Pair<>(preGamingPlayerCard4,0));


        ArrayList<Pair<ImageView,Integer>> gameFan = new ArrayList<>();
        gameFan.add(new Pair<>(gamindCard1,0));
        gameFan.add(new Pair<>(gamindCard2,1));
        gameFan.add(new Pair<>(gamindCard3,2));
        gameFan.add(new Pair<>(gamindCard4,3));

        playerFanCard1.setOnMouseClicked(event -> {

            for (Integer integer: abilityOfPre){
                if (integer >= 0 && integer < 5){
                    FileInputStream input = null;
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(0).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(0).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    Image image = new Image(input);

                    preFan.get(integer).setImage(image);
                    //preFan.set(integer);
                    abilityOfPre.set(integer,11);

                    playerFanCard1.setVisible(false);

                    break;
                }
            }
        });

        playerFanCard2.setOnMouseClicked(event ->{
            for (Integer integer: abilityOfPre){
                if (integer >= 0 && integer < 5){
                    FileInputStream input = null;
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(1).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(1).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    Image image = new Image(input);

                    preFan.get(integer).setImage(image);
                    abilityOfPre.set(integer,12);

                    playerFanCard2.setVisible(false);

                    break;
                }
            }
        });

        playerFanCard3.setOnMouseClicked(event ->{
            for (Integer integer: abilityOfPre){
                if (integer >= 0 && integer < 5){
                    FileInputStream input = null;
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(2).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(2).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    Image image = new Image(input);

                    preFan.get(integer).setImage(image);
                    abilityOfPre.set(integer,13);

                    playerFanCard3.setVisible(false);

                    break;
                }
            }

        });

        playerFanCard4.setOnMouseClicked(event ->{
            for (Integer integer: abilityOfPre){
                if (integer >= 0 && integer < 5){
                    FileInputStream input = null;
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(3).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(3).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    Image image = new Image(input);

                    preFan.get(integer).setImage(image);
                    abilityOfPre.set(integer,14);

                    playerFanCard4.setVisible(false);

                    break;
                }
            }
        });

        playerFanCard5.setOnMouseClicked(event ->{
            for (Integer integer: abilityOfPre){
                if (integer >= 0 && integer < 5){
                    FileInputStream input = null;
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(4).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(4).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    Image image = new Image(input);

                    preFan.get(integer).setImage(image);
                    abilityOfPre.set(integer,15);

                    playerFanCard5.setVisible(false);

                    break;
                }
            }
        });

        playerFanCard6.setOnMouseClicked(event ->{
            for (Integer integer: abilityOfPre){
                if (integer >= 0 && integer < 5){
                    FileInputStream input = null;
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(5).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(5).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    Image image = new Image(input);

                    preFan.get(integer).setImage(image);
                    abilityOfPre.set(integer,16);

                    playerFanCard6.setVisible(false);

                    break;
                }
            }
        });

        playerFanCard7.setOnMouseClicked(event ->{
            for (Integer integer: abilityOfPre){
                if (integer >= 0 && integer < 5){
                    FileInputStream input = null;
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(6).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(6).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    Image image = new Image(input);

                    preFan.get(integer).setImage(image);
                    abilityOfPre.set(integer,17);

                    playerFanCard7.setVisible(false);

                    break;
                }
            }
        });

        playerFanCard8.setOnMouseClicked(event ->{
            for (Integer integer: abilityOfPre){
                if (integer >= 0 && integer < 5){
                    FileInputStream input = null;
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(7).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(7).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    Image image = new Image(input);

                    preFan.get(integer).setImage(image);
                    abilityOfPre.set(integer,18);

                    playerFanCard8.setVisible(false);

                    break;
                }
            }
        });


        preGamingPlayerCard1.setOnMouseClicked(event ->{
            int pos = abilityOfPre.get(0);
            switch (pos) {
                case (11):

                    FileInputStream input = null;
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(0).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(0).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    Image image = new Image(input);

                    playersFanImages.get(0).setImage(image);
                    playerFanCard1.setVisible(true);
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/cardShirt.png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);
                    preGamingPlayerCard1.setImage(image);
                    abilityOfPre.set(0,0);
                    break;

                case (12):

                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(1).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(1).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);

                    playersFanImages.get(1).setImage(image);
                    playerFanCard2.setVisible(true);
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/cardShirt.png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);
                    preGamingPlayerCard1.setImage(image);
                    abilityOfPre.set(0,0);
                    break;

                case (13):

                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(2).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(2).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);

                    playersFanImages.get(2).setImage(image);
                    playerFanCard3.setVisible(true);
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/cardShirt.png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);
                    preGamingPlayerCard1.setImage(image);
                    abilityOfPre.set(0,0);
                    break;

                case (14):

                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(3).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(3).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);

                    playersFanImages.get(3).setImage(image);
                    playerFanCard4.setVisible(true);
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/cardShirt.png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);
                    preGamingPlayerCard1.setImage(image);
                    abilityOfPre.set(0,0);
                    break;

                case (15):

                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(4).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(4).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);

                    playersFanImages.get(4).setImage(image);
                    playerFanCard5.setVisible(true);
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/cardShirt.png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);
                    preGamingPlayerCard1.setImage(image);
                    abilityOfPre.set(0,0);
                    break;

                case (16):

                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(5).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(5).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);

                    playersFanImages.get(5).setImage(image);
                    playerFanCard6.setVisible(true);
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/cardShirt.png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);
                    preGamingPlayerCard1.setImage(image);
                    abilityOfPre.set(0,0);
                    break;

                case (17):

                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(6).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(6).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);

                    playersFanImages.get(6).setImage(image);
                    playerFanCard7.setVisible(true);
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/cardShirt.png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);
                    preGamingPlayerCard1.setImage(image);
                    abilityOfPre.set(0,0);
                    break;

                case (18):

                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(7).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(7).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);

                    playersFanImages.get(7).setImage(image);
                    playerFanCard8.setVisible(true);
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/cardShirt.png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);
                    preGamingPlayerCard1.setImage(image);
                    abilityOfPre.set(0,0);
                    break;

            }
        });

        preGamingPlayerCard2.setOnMouseClicked(event ->{
            int pos = abilityOfPre.get(1);
            switch (pos) {
                case (11):

                    FileInputStream input = null;
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(0).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(0).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    Image image = new Image(input);

                    playersFanImages.get(0).setImage(image);
                    playerFanCard1.setVisible(true);
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/cardShirt.png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);
                    preGamingPlayerCard2.setImage(image);
                    abilityOfPre.set(1,1);
                    break;

                case (12):

                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(1).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(1).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);

                    playersFanImages.get(1).setImage(image);
                    playerFanCard2.setVisible(true);
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/cardShirt.png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);
                    preGamingPlayerCard2.setImage(image);
                    abilityOfPre.set(1,1);
                    break;

                case (13):

                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(2).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(2).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);

                    playersFanImages.get(2).setImage(image);
                    playerFanCard3.setVisible(true);
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/cardShirt.png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);
                    preGamingPlayerCard2.setImage(image);
                    abilityOfPre.set(1,1);
                    break;

                case (14):

                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(3).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(3).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);

                    playersFanImages.get(3).setImage(image);
                    playerFanCard4.setVisible(true);
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/cardShirt.png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);
                    preGamingPlayerCard2.setImage(image);
                    abilityOfPre.set(1,1);
                    break;

                case (15):

                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(4).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(4).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);

                    playersFanImages.get(4).setImage(image);
                    playerFanCard5.setVisible(true);
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/cardShirt.png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);
                    preGamingPlayerCard2.setImage(image);
                    abilityOfPre.set(1,1);
                    break;

                case (16):

                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(5).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(5).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);

                    playersFanImages.get(5).setImage(image);
                    playerFanCard6.setVisible(true);
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/cardShirt.png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);
                    preGamingPlayerCard2.setImage(image);
                    abilityOfPre.set(1,1);
                    break;

                case (17):

                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(6).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(6).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);

                    playersFanImages.get(6).setImage(image);
                    playerFanCard7.setVisible(true);
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/cardShirt.png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);
                    preGamingPlayerCard2.setImage(image);
                    abilityOfPre.set(1,1);
                    break;

                case (18):

                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(7).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(7).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);

                    playersFanImages.get(7).setImage(image);
                    playerFanCard8.setVisible(true);
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/cardShirt.png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);
                    preGamingPlayerCard2.setImage(image);
                    abilityOfPre.set(1,1);
                    break;

            }

        });

        preGamingPlayerCard3.setOnMouseClicked(event ->{
            int pos = abilityOfPre.get(2);
            switch (pos) {
                case (11):

                    FileInputStream input = null;
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(0).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(0).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    Image image = new Image(input);

                    playersFanImages.get(0).setImage(image);
                    playerFanCard1.setVisible(true);
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/cardShirt.png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);
                    preGamingPlayerCard3.setImage(image);
                    abilityOfPre.set(2,2);
                    break;

                case (12):

                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(1).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(1).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);

                    playersFanImages.get(1).setImage(image);
                    playerFanCard2.setVisible(true);
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/cardShirt.png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);
                    preGamingPlayerCard3.setImage(image);
                    abilityOfPre.set(2,2);
                    break;

                case (13):

                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(2).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(2).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);

                    playersFanImages.get(2).setImage(image);
                    playerFanCard3.setVisible(true);
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/cardShirt.png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);
                    preGamingPlayerCard3.setImage(image);
                    abilityOfPre.set(2,2);
                    break;

                case (14):

                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(3).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(3).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);

                    playersFanImages.get(3).setImage(image);
                    playerFanCard4.setVisible(true);
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/cardShirt.png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);
                    preGamingPlayerCard3.setImage(image);
                    abilityOfPre.set(2,2);
                    break;

                case (15):

                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(4).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(4).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);

                    playersFanImages.get(4).setImage(image);
                    playerFanCard5.setVisible(true);
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/cardShirt.png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);
                    preGamingPlayerCard3.setImage(image);
                    abilityOfPre.set(2,2);
                    break;

                case (16):

                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(5).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(5).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);

                    playersFanImages.get(5).setImage(image);
                    playerFanCard6.setVisible(true);
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/cardShirt.png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);
                    preGamingPlayerCard3.setImage(image);
                    abilityOfPre.set(2,2);
                    break;

                case (17):

                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(6).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(6).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);

                    playersFanImages.get(6).setImage(image);
                    playerFanCard7.setVisible(true);
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/cardShirt.png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);
                    preGamingPlayerCard3.setImage(image);
                    abilityOfPre.set(2,2);
                    break;

                case (18):

                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(7).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(7).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);

                    playersFanImages.get(7).setImage(image);
                    playerFanCard8.setVisible(true);
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/cardShirt.png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);
                    preGamingPlayerCard3.setImage(image);
                    abilityOfPre.set(2,2);
                    break;

            }

        });

        preGamingPlayerCard4.setOnMouseClicked(event ->{
            int pos = abilityOfPre.get(3);
            switch (pos) {
                case (11):

                    FileInputStream input = null;
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(0).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(0).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    Image image = new Image(input);

                    playersFanImages.get(0).setImage(image);
                    playerFanCard1.setVisible(true);
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/cardShirt.png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);
                    preGamingPlayerCard4.setImage(image);
                    abilityOfPre.set(3,3);
                    break;

                case (12):

                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(1).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(1).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);

                    playersFanImages.get(1).setImage(image);
                    playerFanCard2.setVisible(true);
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/cardShirt.png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);
                    preGamingPlayerCard4.setImage(image);
                    abilityOfPre.set(3,3);
                    break;

                case (13):

                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(2).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(2).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);

                    playersFanImages.get(2).setImage(image);
                    playerFanCard3.setVisible(true);
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/cardShirt.png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);
                    preGamingPlayerCard4.setImage(image);
                    abilityOfPre.set(3,3);
                    break;

                case (14):

                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(3).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(3).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);

                    playersFanImages.get(3).setImage(image);
                    playerFanCard4.setVisible(true);
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/cardShirt.png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);
                    preGamingPlayerCard4.setImage(image);
                    abilityOfPre.set(3,3);
                    break;

                case (15):

                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(4).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(4).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);

                    playersFanImages.get(4).setImage(image);
                    playerFanCard5.setVisible(true);
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/cardShirt.png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);
                    preGamingPlayerCard4.setImage(image);
                    abilityOfPre.set(3,3);
                    break;

                case (16):

                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(5).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(5).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);

                    playersFanImages.get(5).setImage(image);
                    playerFanCard6.setVisible(true);
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/cardShirt.png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);
                    preGamingPlayerCard4.setImage(image);
                    abilityOfPre.set(3,3);
                    break;

                case (17):

                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(6).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(6).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);

                    playersFanImages.get(6).setImage(image);
                    playerFanCard7.setVisible(true);
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/cardShirt.png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);
                    preGamingPlayerCard4.setImage(image);
                    abilityOfPre.set(3,3);
                    break;

                case (18):

                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/"
                                        + playerFan.get(7).getKey().toString()
                                        + "_of_"
                                        + playerFan.get(7).getValue().toString().toLowerCase() + ".png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);

                    playersFanImages.get(7).setImage(image);
                    playerFanCard8.setVisible(true);
                    try {
                        input = new FileInputStream(
                                "src/main/resources/com/example/test_task3/Stuff/cardShirt.png"
                        );

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    image = new Image(input);
                    preGamingPlayerCard4.setImage(image);
                    abilityOfPre.set(3,3);
                    break;

            }

        });


        startGameButton.setOnAction(event -> {
            //startGameButton.setVisible(false);




            for (int integer = 0; integer < 8; integer++){

                FileInputStream input = null;
                try {
                    input = new FileInputStream(
                            "src/main/resources/com/example/test_task3/Stuff/"
                            + playerFan.get(integer).getKey().toString()
                            + "_of_"
                            + playerFan.get(integer).getValue().toString().toLowerCase() + ".png"
                    );

                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
                Image image = new Image(input);

                playersFanImages.get(integer).setImage(image);
            }












        });

        fanButton.setOnAction(event -> {

            FileInputStream input = null;
            try {
                input = new FileInputStream("src/main/resources/com/example/test_task3/Stuff/2_of_clubs.png");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            Image image = new Image(input);

            playerFanCard1.setImage(image);






//            Player player = new Player();
//            for (int i = 0; i<8;i++){
//                System.out.println(player.getFan().get(i));
//            }System.out.println("--------------");
//
//            Card card1 = new Card(6, Suit.CLUBS);
//            Card card2 = new Card(6, Suit.CLUBS);
//            System.out.println(equalsCard(card2,card1));
//            System.out.println(card2.getRank() == card1.getRank());
//            System.out.println(card2.getSuit() == card1.getSuit());

        });

        rulesButton.setOnAction(event -> {
           FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("Rules.fxml"));

           try {
               loader.load();
           } catch (IOException e) {
               throw new RuntimeException(e);
           }

           Parent root = loader.getRoot();
           Stage stage = new Stage();
           stage.setScene(new Scene(root));

           stage.showAndWait();
       });


        sixButton.setOnAction(event -> {

            for (int i = 0; i < 4; i++){

            }


        });
    }

}
