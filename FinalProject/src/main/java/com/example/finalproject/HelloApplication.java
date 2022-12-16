package com.example.finalproject;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class HelloApplication extends Application {
    final FileChooser fileChooser = new FileChooser();


    private Map<String, BufferedImage> openImages = new HashMap<>();

    private VBox loadImage(String file) throws IOException {
        return loadImage(new File(file));
    }


    private VBox loadImage(File file) throws IOException {
        openImages.put(file.getName(), ImageIO.read(file));


        InputStream stream = new FileInputStream(file);
        Image image = new Image(stream);

        //Creating the image view
        ImageView imageView = new ImageView();
        //Setting image to the image view
        imageView.setImage(image);
        //Setting the image view parameters
        imageView.setX(10);
        imageView.setY(10);

        imageView.setFitHeight(100);
        imageView.setFitWidth(100);
        imageView.setSmooth(true);
        imageView.setCache(true);
        imageView.setPreserveRatio(true);

        VBox box = new VBox();

        box.getChildren().add(imageView);
        Text widthText = new Text("Width: " + image.getWidth());
        Text heightText = new Text("Height: " + image.getHeight());
        box.getChildren().add(widthText);
        box.getChildren().add(heightText);


        return box;
    }

    private void writeImage(String file, String type, BufferedImage bufferedImage) throws IOException {
        int p = file.lastIndexOf(".");
        file = file.substring(0, p) + "." + type;
        System.out.println("write file name" + file);

        ImageIO.write(bufferedImage, type, new File(file));
    }

    @Override
    public void start(Stage stage) throws FileNotFoundException {
        configureFileChooser(fileChooser);
        VBox root = new VBox();


        BorderPane menuBoard = new BorderPane();

        MenuBar menuBar = new MenuBar();
        menuBar.prefWidthProperty().bind(stage.widthProperty());
        menuBoard.setTop(menuBar);


        // File menu - new, save, exit
        Menu fileMenu = new Menu("File");
        MenuItem newMenuItem = new MenuItem("New");
        MenuItem saveMenuItem = new MenuItem("Save");
        MenuItem exitMenuItem = new MenuItem("Exit");
        exitMenuItem.setOnAction(actionEvent -> Platform.exit());


        fileMenu.getItems().addAll(newMenuItem, saveMenuItem,
                new SeparatorMenuItem(), exitMenuItem);

        Menu sqlMenu = new Menu("Save Image Format");
        ToggleGroup tGroup = new ToggleGroup();
        RadioMenuItem jpegItem = new RadioMenuItem("JPEG");
        jpegItem.setToggleGroup(tGroup);

        RadioMenuItem jpgItem = new RadioMenuItem("JPG");
        jpgItem.setToggleGroup(tGroup);
        jpgItem.setSelected(true);

        sqlMenu.getItems().addAll(jpegItem, jpgItem,
                new SeparatorMenuItem());

        menuBar.getMenus().addAll(fileMenu, sqlMenu);

        HBox imageBox = new HBox();

        newMenuItem.setOnAction(actionEvent -> {
            List<File> files = fileChooser.showOpenMultipleDialog(stage);
            for (File file : files) {
                VBox iBox = null;
                try {
                    iBox = loadImage(file);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                imageBox.getChildren().add(iBox);
            }
        });

        saveMenuItem.setOnAction(actionEvent -> {
            ReadOnlyObjectProperty<Toggle> toggle = tGroup.selectedToggleProperty();
            RadioMenuItem radioMenuItem = (RadioMenuItem) (toggle.get());
            System.out.println(radioMenuItem.getText());

            String type = radioMenuItem.getText();

            openImages.forEach((name, buffer) -> {
                try {
                    writeImage(name, type, buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(name);
            });

        });


        root.getChildren().add(menuBoard);
        root.getChildren().add(imageBox);


        Scene scene = new Scene(root, 595, 370);
        stage.setTitle("Displaying Image");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    private void configureFileChooser(FileChooser fileChooser) {
        fileChooser.setTitle("查看图片");
        fileChooser.setInitialDirectory(
                new File(System.getProperty("user.home"))
        );
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("All Images", "*.*"),
                new FileChooser.ExtensionFilter("JPG", "*.jpg"),
                new FileChooser.ExtensionFilter("PNG", "*.png")
        );
    }

}