package minessweeper;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;


/**
 * Created by IntelliJ IDEA.
 * User: Alaa Alkheder
 * Email:alaa-alkheder@outlook.com
 * Github:alaa-alkheder
 */


public class NewFXMain1 extends Application {
    //////////////////////////////////////////

    GridPane mainMnue = new GridPane();
    GridPane enterplayergrid = new GridPane();

    GridPane costomgrid = new GridPane();
    GridPane currentPlayer = new GridPane();
    Label name = new Label("The Current Player : ");
    Label CurrentPlayer = new Label();
    Label Score = new Label("The Current Player : ");
    Label ScorePlayer = new Label();
    Button Reset = new Button("Reset");
    Button Exit = new Button("Exit");
    CheckBox MarkCheck = new CheckBox("Costom Player");
    Label titlLabel = new Label("Minisweeper");
    Label titlLabelplayer = new Label("Entre your Player name");
    Label titlLabel1 = new Label("Entre your choises");
    Label titlLabelparameters = new Label("Entre your choises Parameters");
    RadioButton singlepleyar = new RadioButton("singleplyar");
    RadioButton humanpleyar = new RadioButton("humanpleyar");
    RadioButton randompleyar = new RadioButton("randompleyar");
    RadioButton AIpleyar = new RadioButton("AIpleyar");
    RadioButton GUIGame = new RadioButton("GUIGame");
    RadioButton consolGame = new RadioButton("consolGame");
    CheckBox costom = new CheckBox("Costom Player");
    Button SubmitMain = new Button("Submit");
    Button SubmitPlayer = new Button("Submit");
    ToggleGroup plyarGroup = new ToggleGroup();
    ToggleGroup gameGroup = new ToggleGroup();
    Label titlLabelplayer1 = new Label("Entre the First Player name");
    Label titlLabelplayer2 = new Label("Entre the second Player name");
    Label collLabel = new Label("Enter The Coll");
    Label RrowsLabel = new Label("Enter The Rows");
    Label miniLabel = new Label("Enter The Mini");
    TextField userTextField1 = new TextField("name");
    TextField userTextField2 = new TextField("name");
    TextField RowsTextField = new TextField("10");
    TextField colluserTextField = new TextField("10");
    TextField miniTextField = new TextField("10");

    /////////////////////////////////////////
    private static final int TILE_SIZE = 30;
    private int X_TILES = 15;
    private int Y_TILES = 15;
    private int H = TILE_SIZE * Y_TILES;
    private int W = TILE_SIZE * X_TILES;
    private Tile[][] grid = new Tile[X_TILES][Y_TILES];
    private Scene scene;

    public void printChangeGUI(String color, int x, int y) {
        grid[x][y].text.setFill(Color.AQUAMARINE);

    }

    private Parent createContent() {
        Pane root = new Pane();
        root.setPrefSize(W, H);

        for (int y = 0; y < Y_TILES; y++) {
            for (int x = 0; x < X_TILES; x++) {
                Tile tile = new Tile(x, y);

                grid[x][y] = tile;
                root.getChildren().add(tile);
            }
        }
        return root;
    }

    private class Tile extends StackPane {

        private int x, y;
        //private boolean hasBomb;
        private boolean isOpen = false;

        private Rectangle border = new Rectangle(TILE_SIZE - 2, TILE_SIZE - 2);
        Text text = new Text();

        public Tile(int x, int y) {
            this.x = x;
            this.y = y;
            //this.hasBomb = hasBomb;

            border.setStroke(Color.BLUE);
            border.setFill(Color.TURQUOISE);
            text.setFont(Font.font(18));

            text.setVisible(false);

            getChildren().addAll(border, text);

            setTranslateX(x * TILE_SIZE);
            setTranslateY(y * TILE_SIZE);
            setOnMouseClicked(e -> giv_index());

            // setOnMouseDragOver(e ->open());
        }

        public void giv_index()//change the type of indexs 
        {
            //if (isOpen)
            System.out.println(x);
            System.out.println(y);

        }

    }

    @Override
    public void start(Stage stage) throws Exception {
costomgrid.setPadding(new Insets(15, 15, 15, 15));
costomgrid.add(name, 0 ,1);
costomgrid.add(titlLabel, 2, 0);
costomgrid.add(CurrentPlayer, 1, 1);
        
        costomgrid.setPadding(new Insets(15, 15, 15, 15));
        enterplayergrid.setPadding(new Insets(15, 15, 15, 15));
        mainMnue.setPadding(new Insets(15, 15, 15, 15));
        singlepleyar.setToggleGroup(plyarGroup);
        humanpleyar.setToggleGroup(plyarGroup);
        randompleyar.setToggleGroup(plyarGroup);
        AIpleyar.setToggleGroup(plyarGroup);
        consolGame.setToggleGroup(gameGroup);
        GUIGame.setToggleGroup(gameGroup);
        //gameGroup.selectedToggleProperty().addListener((observable, oldVal, newVal) -> System.out.println(newVal + " was selected"));// tink print what i selected of grop
        mainMnue.add(titlLabel, 2, 0);
        mainMnue.add(titlLabel1, 2, 1);
        mainMnue.add(singlepleyar, 0, 3);
        mainMnue.add(humanpleyar, 0, 4);
        mainMnue.add(SubmitMain, 2, 7);
        mainMnue.add(randompleyar, 0, 5);
        mainMnue.add(AIpleyar, 0, 6);
        mainMnue.add(GUIGame, 3, 4);
        mainMnue.add(consolGame, 3, 5);
        mainMnue.add(costom, 3, 6);
        /**
         * ******************************************
         */
        enterplayergrid.add(titlLabel, 1, 0);
        enterplayergrid.add(titlLabelplayer, 1, 1);
        enterplayergrid.add(titlLabelplayer1, 0, 2);
        enterplayergrid.add(userTextField1, 1, 2);
        enterplayergrid.add(titlLabelplayer2, 0, 3);
        enterplayergrid.add(userTextField2, 1, 3);
        enterplayergrid.add(SubmitPlayer, 1, 4);
        /**
         * *******************************************
         */
        costomgrid.add(titlLabel, 2, 0);
        costomgrid.add(titlLabelparameters, 2, 1);
        costomgrid.add(collLabel, 1, 2);
        costomgrid.add(RrowsLabel, 1, 3);
        costomgrid.add(miniLabel, 1, 4);
        costomgrid.add(colluserTextField, 2, 2);
        costomgrid.add(RowsTextField, 2, 3);
        costomgrid.add(miniTextField, 2, 4);
        //}
        Scene scene = new Scene(enterplayergrid, 350, 300);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);

        Scene scene1 = new Scene(mainMnue, 350, 300);
        Stage Stage = new Stage();
        Stage.setTitle("Hello World!");
        Stage.setScene(scene1);
         Stage.show();
        Scene scene2 = new Scene(costomgrid, 350, 300);
        Stage Stagecostom = new Stage();
        Stagecostom.setTitle("Hello World!");
        Stagecostom.setScene(scene2);

        scene = new Scene(createContent());

        stage.setScene(scene);

        SubmitMain.setOnAction(new EventHandler<ActionEvent>() {

            public void getindex()
            {
                
            }
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
                if (costom.isSelected()) {
                    Stagecostom.show();
                }

                if (consolGame.isSelected()) {
                    /*     Stage.close();
                     a.currentGame = new ConsoleGame();
                     a.currentGame.addPlyar(1);
                     a.currentG vme.setTypeCollecting(false);
                     a.StartGame();
                     Stagecostom.show();*/

                }
                if (singlepleyar.isSelected() || humanpleyar.isSelected()) {
                    primaryStage.show();
                }
              //  Stage.close();

                //  stage.show();
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
