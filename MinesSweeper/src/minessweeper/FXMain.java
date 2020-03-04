/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minessweeper;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.ToggleGroup;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

public class FXMain extends Application {

    //////////////////////////////////////////
    boolean test = false, test1 = false;
    int timedelay = 5000;

    class start extends Thread {

        @Override
        public void run() {
            Minesweeper.StartGame();
        }

    }

    start s = new start();

///////////////////////////
    //////////////////
    ///////////////

    GridPane mainMnue = new GridPane();
    GridPane enterplayergrid = new GridPane();
    GridPane scoreboardgrid = new GridPane();

    GridPane costomgrid = new GridPane();
    GridPane currentPlayer = new GridPane();
    Label name = new Label("The Current Player : ");
    Label CurrentPlayer = new Label("");
    Label spaselabel = new Label("                           ");
    Label spaselabel1 = new Label("                           ");
    Label Score = new Label("The Score Player : ");
    Label shieldplayer = new Label("shield player ");
    Label shieldplayer1 = new Label(" ");
    Label ScorePlayer = new Label("");
    Label titlLabelplayer1 = new Label("Entre the First Player name");
    Label titlLabelplayer2 = new Label("Entre the second Player name");
    Label collLabel = new Label("Enter The Coll");
    Label RrowsLabel = new Label("Enter The Rows");
    Label miniLabel = new Label("Enter The Mini");
    Label shieldcountLabel = new Label("Enter The Count Shield ");
    Label titlLabel = new Label("Minisweeper");
    Label titlLabe2 = new Label("Minisweeper");
    Label titlLabe3 = new Label("Minisweeper");
    Label titlLabe4 = new Label("Minisweeper");
    Label timerlabel = new Label("");
    Label titlLabeMarkedMinosScore = new Label("IF You Open Mine you Lose : ");
    Label titlLabeMarkedPlusScore = new Label("IF You Open Empty square you Eearn :");
    Label titlLabeOpenedEmptyScore = new Label("If you Mark on Mine Square you Earn : ");
    Label titlLabeOpenedMineScore = new Label("IF You Mark on Empty square you Eearn : ");
    Label titlLabebounsLevel = new Label("When you Win You Earn : ");
    Label titlLabelplayer = new Label("Entre your Player name");
    Label titlLabel1 = new Label("Entre your choises");
    Label titlLabelparameters = new Label("Entre your choises Parameters");
    Label titlLabelTimer = new Label("Timer");
    Label titlLabelTimer1 = new Label();
    Label titlLabelTimerenter = new Label("Enter Delay Time : ");
    Label ScoreboardLabel = new Label("Score Board ");
    /////////////////////***************
    Label idlabel = new Label("  ID       ");
    Label idlabel1 = new Label("");
    Label idlabel2 = new Label("");
    Label idlabel3 = new Label("");
    Label idlabel4 = new Label("");
    Label idlabel5 = new Label("");               
    Label firstplayernamelabel = new Label("  Player 1                ");
    Label firstplayernamelabel1 = new Label("");
    Label firstplayernamelabel2 = new Label("");
    Label firstplayernamelabel3 = new Label("");
    Label firstplayernamelabel4 = new Label("");
    Label firstplayernamelabel5 = new Label("");
    Label secundplayernamelabel = new Label("  Score              ");
    Label secundplayernamelabel1 = new Label("");
    Label secundplayernamelabel2 = new Label("");
    Label secundplayernamelabel3 = new Label("");
    Label secundplayernamelabel4 = new Label("");
    Label secundplayernamelabel5 = new Label("");
    Label StartDatelabel = new Label("              Start Date               ");
    Label StartDatelabel1 = new Label("");
    Label StartDatelabel2 = new Label("");
    Label StartDatelabel3 = new Label("");
    Label StartDatelabel4 = new Label("");

    Label StartDatelabel5 = new Label("");
    Label endDatelabel = new Label("                  End Date                  ");
    Label endDatelabel1 = new Label("");
    Label endDatelabel2 = new Label("");
    Label endDatelabel3 = new Label("");
    Label endDatelabel4 = new Label("");
    Label endDatelabel5 = new Label("");
    Label ExplorecoustomGamelabel5 = new Label("         Explore  ");
    Button ExplorecoustomGame1 = new Button("Explore");
    Button ExplorecoustomGame2 = new Button("Explore");
    Button ExplorecoustomGame3 = new Button("Explore");
    Button ExplorecoustomGame4 = new Button("Explore");
    Button ExplorecoustomGame5 = new Button("Explore");

    //////////////////////
    RadioButton singlepleyar = new RadioButton("Single Plyar");
    RadioButton humanpleyar = new RadioButton("Human Pleyar");
    RadioButton randompleyar = new RadioButton("Random Pleyar");
    RadioButton AIpleyar = new RadioButton("AI Pleyar");
    RadioButton GUIGame = new RadioButton("GUI Game");
    RadioButton consolGame = new RadioButton("Consol Game");
    RadioButton filtername = new RadioButton("Name Filter");
    RadioButton filterstartdate = new RadioButton("Start Date Filter");
    RadioButton filterenddate = new RadioButton("End Date Filter");
    CheckBox costom = new CheckBox("Costom Player");
    CheckBox scoreCheck = new CheckBox("Score");
    CheckBox MarkCheck = new CheckBox("Mark");
    CheckBox MusicCheck = new CheckBox("Music");
    CheckBox scoreMinus = new CheckBox("Player Lose Win Get Minus score");
    CheckBox priventshie1d1 = new CheckBox("Prevent Shield");
    CheckBox priventshie1d2 = new CheckBox("Prevent Shield");

    Button SubmitMain = new Button("Submit");
    Button SubmitPlayer = new Button("Submit");
    Button SubmitCostom = new Button("Submit");
    Button Reset = new Button("Reset");
    Button Exit = new Button(" Exit  ");
    Button Load = new Button(" Load  ");
    Button save = new Button(" Save  ");
    Button Explore = new Button(" Explore  ");
    Button score = new Button(" Score  ");
    ToggleGroup plyarGroup = new ToggleGroup();
    ToggleGroup gameGroup = new ToggleGroup();
    ToggleGroup filterGroup = new ToggleGroup();

    TextField userTextField1 = new TextField("First Player Name");
    TextField TimerTextField = new TextField("10");
    TextField userTextField2 = new TextField("Secund Player Name");
    TextField RowsTextField = new TextField("10");
    TextField colluserTextField = new TextField("10");//
    TextField miniTextField = new TextField("10");
    TextField saveTextField = new TextField("temp                  ");

    TextField TextFieldMarkedMinosScore = new TextField("1");
    TextField TextFieldMarkedPlusScore = new TextField("5");
    TextField TextFieldOpenedEmptyScore = new TextField("10");
    TextField TextFieldOpenedMineScore = new TextField("250");
    TextField TextFieldbounsLevel = new TextField("100");
    TextField TextFieldShield1 = new TextField("0");
    TextField TextFieldShield2 = new TextField("0");
    TextField TextFieldShieldcount = new TextField("10");
    Grid Minesweeper = new Grid();
    int row = 10, coll = 10, mine = 10, sheild = 0, delay = 10;
    String name1 = "", name2 = "", nameCurrent;
    int MarkedMinosScore;
    int MarkedPlusScore;
    int OpenedEmptyScore;
    int OpenedMineScore;
    int bounsLevel;
    int countStartShield1 = 0;
    int countStartShield2 = 0;
    int countshieldGrid = 10;
    boolean startShield = false;
    Alert alert1 = new Alert(Alert.AlertType.INFORMATION);

///////////////////////////////////////////
    final URL resours = getClass().getResource("a.mp3");
    final Media media = new Media(resours.toString());
    final MediaPlayer mediaplayer = new MediaPlayer(media);
    Alert alert = new Alert(Alert.AlertType.CONFIRMATION.WARNING);

    /////////////////////////////////////////
    private static final int TILE_SIZE = 30;
    int X_TILES = row;
    int Y_TILES = coll;
    int H = TILE_SIZE * Y_TILES;
    int W = TILE_SIZE * X_TILES;
    public Tile[][] grid = new Tile[X_TILES][Y_TILES];
    public Tile1[][] grid1 = new Tile1[X_TILES][Y_TILES];
    ;
    private Scene scene;
    int currentStart = 0;

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

    private Parent createContent1() {
        Pane root = new Pane();
        root.setPrefSize(W, H);

        for (int y = 0; y < Y_TILES; y++) {
            for (int x = 0; x < X_TILES; x++) {
                Tile1 tile = new Tile1(x, y);

                grid1[x][y] = tile;
                root.getChildren().add(tile);
            }
        }
        return root;
    }

    public class ExploreGame extends Thread {

        List<PlayerMove> move;

        public ExploreGame(List<PlayerMove> currentmove) {
            move = currentmove;
        }

        @Override
        public void run() {

            for (PlayerMove x : move) {
                if ("LIGHTPINK".equals(x.player.colorPlayer)) {
                    CurrentPlayer.setTextFill(Color.LIGHTPINK);
                } else {
                    CurrentPlayer.setTextFill(Color.TURQUOISE);
                }
                javafx.application.Platform.runLater(()
                        -> shieldplayer1.setText("" + x.curentShield)
                );
//                        if (Minesweeper.currentGame.checkTypeCollecting) {
                if (x.player.getScore() < 10) {
                    javafx.application.Platform.runLater(()
                            -> ScorePlayer.setText("" + x.currentscore)
                    );

                } else {
                    javafx.application.Platform.runLater(()
                            -> ScorePlayer.setText("")
                    );
                }
//                        }
                javafx.application.Platform.runLater(()
                        -> CurrentPlayer.setText(x.player.name)
                );
                try {
                    Thread.sleep(200);
                } catch (InterruptedException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (x.Time == 9) {
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    try {
                        for (int i = 0; i < x.Time; i++) {
                            Thread.sleep(1000);
                            String g = "" + i;
                            javafx.application.Platform.runLater(()
                                    -> timerlabel.setText(g)
                            );
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    Square PrintSquare = x.square;
                    if (PrintSquare.squareColor.equals("LIGHTPINK")) {
                        grid1[PrintSquare.y][PrintSquare.x].border.setFill(Color.LIGHTPINK);
                    } else {
                        grid1[PrintSquare.y][PrintSquare.x].border.setFill(Color.TURQUOISE);
                    }

                    switch (PrintSquare.status) {
                        case Marked: {
                            grid1[PrintSquare.y][PrintSquare.x].text.setText("!");
                        }
                        break;
                        case OpenedMine: {
                            grid1[PrintSquare.y][PrintSquare.x].text.setText("*");

                        }
                        break;
                        case OpenedNumber: {
                            grid1[PrintSquare.y][PrintSquare.x].text.setText(PrintSquare.value);
                            if (PrintSquare.shielded.IsShield()) {
                                grid1[PrintSquare.y][PrintSquare.x].text.setText(PrintSquare.value + "D");
                            }
                        }
                        break;
                        case OpenedEmpty: {
                            // grid[PrintSquare.x][PrintSquare.y].text.setText(PrintSquare.value);
                            if (PrintSquare.shielded.IsShield()) {
                                grid1[PrintSquare.y][PrintSquare.x].text.setText("D");
                            }
                        }
                        break;
                        case Closed: {
                            grid1[PrintSquare.y][PrintSquare.x].text.setText("");
                            grid1[PrintSquare.y][PrintSquare.x].border.setFill(Color.GREY);
                        }
                        break;
                    }
                }
            }
        }
    }

    public class Printwindow extends Thread {

        @Override
        public void run() {
            while (true) {
                try {
                    if (!Minesweeper.currentGame.players.isEmpty()) {
                        if (Minesweeper.currentGame.players.peek() == null) {
                            System.out.println("nuuuuuuuuuuuuuuuuuuuuull");
                        } else {

                            String s = " " + Minesweeper.currentGame.players.peek().name;
                            //   System.out.println("22222222222222222" + Minesweeper.currentGame.players.peek().getNamee());
//                           CurrentPlayer.setText(Minesweeper.currentGame.players.peek().name);

                        }

                        if ("LIGHTPINK".equals(Minesweeper.currentGame.players.peek().colorPlayer)) {
                            CurrentPlayer.setTextFill(Color.LIGHTPINK);
                        } else {
                            CurrentPlayer.setTextFill(Color.TURQUOISE);
                        }
                        if (!Minesweeper.currentGame.players.isEmpty() && Minesweeper.currentGame.checkTypeCollecting) {
                            if (Minesweeper.currentGame.players.peek().getScore() < 10) {
                                javafx.application.Platform.runLater(()
                                        -> ScorePlayer.setText("" + Minesweeper.currentGame.players.getFirst().getScore())
                                );
                            } else {
                                javafx.application.Platform.runLater(()
                                        -> ScorePlayer.setText("")
                                );
                            }
                        }
                        javafx.application.Platform.runLater(()
                                -> CurrentPlayer.setText(Minesweeper.currentGame.players.peek().name)
                        );

                        Thread.sleep(300);
                        Square PrintSquare = new Square();
                        for (int i = currentStart; i < Minesweeper.currentGame.moves.size(); i++) {
                            Thread.sleep(25);
                            PrintSquare = Minesweeper.currentGame.moves.get(i).square;
                            if (PrintSquare.squareColor.equals("LIGHTPINK")) {
                                grid[PrintSquare.y][PrintSquare.x].border.setFill(Color.LIGHTPINK);
                            } else {
                                grid[PrintSquare.y][PrintSquare.x].border.setFill(Color.TURQUOISE);
                            }

                            switch (PrintSquare.status) {
                                case Marked: {
                                    grid[PrintSquare.y][PrintSquare.x].text.setText("!");
                                }
                                break;
                                case OpenedMine: {
                                    grid[PrintSquare.y][PrintSquare.x].text.setText("*");

                                }
                                break;
                                case OpenedNumber: {
                                    grid[PrintSquare.y][PrintSquare.x].text.setText(PrintSquare.value);
                                    if (PrintSquare.shielded.IsShield()) {
                                        grid[PrintSquare.y][PrintSquare.x].text.setText(PrintSquare.value + "D");
                                    }
                                }
                                break;
                                case OpenedEmpty: {
                                    // grid[PrintSquare.x][PrintSquare.y].text.setText(PrintSquare.value);
                                    if (PrintSquare.shielded.IsShield()) {
                                        grid[PrintSquare.y][PrintSquare.x].text.setText("D");
                                    }
                                }
                                break;
                                case Closed: {
                                    grid[PrintSquare.y][PrintSquare.x].text.setText("");
                                    grid[PrintSquare.y][PrintSquare.x].border.setFill(Color.GREY);
                                }
                                break;

                            }

                        }
                        currentStart = Minesweeper.currentGame.moves.size();
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

    }

    public class Timer extends Thread {

        NormalGame c = new NormalGame();
        NormalGame.GameRules e = c.new DefaultRules();

        @Override
        public void run() {

            String asas;
            while (!Minesweeper.currentGame.players.isEmpty()) {
                int i;
//                 javafx.application.Platform.runLater(()->
//                        CurrentPlayer.setText(Minesweeper.currentGame.players.peek().name)
//                        );
                javafx.application.Platform.runLater(()
                        -> shieldplayer1.setText("" + Minesweeper.currentGame.players.peek().shieldPlayer)
                );
                test1 = false;
                for (i = 0; i < delay; i++) {
                    String g = "" + i;
                    javafx.application.Platform.runLater(()
                            -> timerlabel.setText(g)
                    );
//                    CurrentPlayer.setText(Minesweeper.currentGame.players.getLast().name);
                    try {
                        Thread.sleep(1000);

                    } catch (InterruptedException ex) {

                    }

                    if (test) {
                        Minesweeper.t = i;
                        Minesweeper.StartGame();
                        test = false;
                        test1 = true;
                        break;
                    }
                    System.out.println(Minesweeper.currentGame.players.peek().getNamee());
                    System.out.println(" index" + i);//
                    if (Minesweeper.NextPlayer(Minesweeper.currentGame.players) instanceof RandomPlayer || Minesweeper.NextPlayer(Minesweeper.currentGame.players) instanceof AIPlayer) {
                        if (i > timedelay / 1000) {
                            Minesweeper.t = i;
                            Minesweeper.StartGame();
                            test1 = true;
                            break;
                        }
                    }
                }

                if (test1 != true) {
                    PlayerMove currmove = new PlayerMove();
                    currmove.player = Minesweeper.currentGame.players.getLast();
                    currmove.Time = 9;
                    currmove.row = Minesweeper.x;
                    currmove.coll = Minesweeper.y;
                    Minesweeper.currentGame.moves.add(currmove);
                    e.DecideNextPlayer(Minesweeper.currentGame.players);
                    if (Minesweeper.NextPlayer(Minesweeper.currentGame.players) instanceof GuiPlayer) {
                    } else {
                        if (test == true) {
                            Minesweeper.t = i;
                            Minesweeper.StartGame();
                        }
                    }

                }
                ObjectOutput output;
                        Date o = new Date();
                        System.out.println(o.toString());
//                         String g=o.toString();
                        String s = "Game Save\\QuickSave" + Minesweeper.n1 + " && " + Minesweeper.n2 + ".bin";
                        try {

                            output = new ObjectOutputStream(new FileOutputStream(s));
                            output.writeObject(Minesweeper);
                            output.close();
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) {
                            Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                        }
            }
            ScoreBoard s = new ScoreBoard();
            List<ScoreBoard> score = new LinkedList<>();

            FileChooser chooser = new FileChooser();
            ObjectInputStream input;
            try {
                File sel = new File(" ScoreBoard.bin");
                if (sel == null) {
                    return;
                }
                if (sel.exists()) {
                    
             
                input = new ObjectInputStream(new FileInputStream(sel));
                Object b = input.readObject();
                if (b != null) {
                    score = (List<ScoreBoard>) b;
                } }
            } catch (IOException ex) {
                Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
            }  
            if (Minesweeper.playerWin != null) {
                alert1.setHeaderText("Win");
                alert1.setContentText(Minesweeper.playerWin.name);
                javafx.application.Platform.runLater(()
                        -> alert1.show()
                );
            }

            Date o = new Date();

            Minesweeper.DateEnd = o;

            s.name1 = Minesweeper.n1;
            s.name2 = Minesweeper.n2;
            s.DateStart = Minesweeper.DateStart;
            s.DateEnd = Minesweeper.DateEnd;
            s.path = "Explore Game\\" + Minesweeper.n1 + " && " + Minesweeper.n2 + ".bin";
            s.ID = score.size() + 1;//Add id
            s.playerwin = Minesweeper.playerWin;
            score.add(s);

            ScoreBoard temp[] = new ScoreBoard[score.size()];
            for (int i = 0; i < score.size(); i++) {
                temp[i] = score.get(i);
            }

            for (int i = 0; i < score.size(); i++) {
                for (int j = i + 1; j < score.size(); j++) {
                    if (temp[i].playerwin.currentScoure <= temp[j].playerwin.currentScoure) {
                        ScoreBoard tempp = temp[j];
                        temp[j] = temp[i];
                        temp[i] = tempp;
                    }
                }
            }

            score = new LinkedList<>();
            for (int i = 0; i < temp.length; i++) {
                score.add(temp[i]);
            }
            if (score.size() > 5) {
                score.remove(score.size() - 1);
            }
            ObjectOutput output;
            String e = " ScoreBoard.bin";
            try {
                output = new ObjectOutputStream(new FileOutputStream(e));
                output.writeObject(score);
                output.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    private class Tile extends StackPane {

        private int x, y;
        //private boolean hasBomb;
        private boolean isOpen = false;

        private Rectangle border = new Rectangle(TILE_SIZE - 2, TILE_SIZE - 2);
        Text text = new Text();

        public Tile(int x, int y) {
            this.x = y;
            this.y = x;
            //this.hasBomb = hasBomb;

            border.setStroke(Color.BLUE);
            border.setFill(Color.GREY);
            text.setFont(Font.font(18));

            // text.setVisible(false);
            getChildren().addAll(border, text);

            setTranslateX(x * TILE_SIZE);
            setTranslateY(y * TILE_SIZE);
            setOnMouseClicked(e -> giv_index());

            // setOnMouseDragOver(e ->open());
        }

        public void giv_index()//change the type of indexs 
        {

            Indexes a = new Indexes();
            a.x = x;
            a.y = y;

            if (MarkCheck.isSelected()) {
                a.typemove = MoveType.Mark;
                MarkCheck.setSelected(false);
            } else {
                a.typemove = MoveType.Reveal;
            }
            if (!Minesweeper.currentGame.players.isEmpty()) {
//                CurrentPlayer.setText(Minesweeper.currentGame.players.getLast().name);
//                shieldplayer1.setText("" + Minesweeper.currentGame.players.getLast().shieldPlayer);
                Minesweeper.currentGame.currentPlayer = Minesweeper.NextPlayer((Minesweeper.currentGame.players));
                Minesweeper.currentGame.currentPlayer.SetIndexGUI(a);
                ////////////////////////////////////////////////////////

//                System.out .println("Scoooooooore"+Minesweeper.currentGame.players.getLast().getScore());
                if (!(Minesweeper.checkAcceptMove(a.x, a.y, a.typemove))) {
                    if (Minesweeper.NextPlayer(Minesweeper.currentGame.players) instanceof GuiPlayer) {
                        test = true;
                    }
                    // Minesweeper.StartGame();

                }

            } /* else {
             if(Minesweeper.currentGame.moves.get(Minesweeper.currentGame.moves.size()).player.pStatus == PlayerStatus.Win){
             alert.setHeaderText(Minesweeper.currentGame.moves.get(Minesweeper.currentGame.moves.size()).player.getName()+"   Win");
             alert.setContentText("WIN");
             alert.show();}else{
             alert.setHeaderText(Minesweeper.currentGame.moves.get(Minesweeper.currentGame.moves.size()).player.getName()+"   Win");
             alert.setContentText("Lose");
             alert.show();
             }
             }*/

        }
    }

    private class Tile1 extends StackPane {

        private int x, y;
        //private boolean hasBomb;
        private boolean isOpen = false;

        private Rectangle border = new Rectangle(TILE_SIZE - 2, TILE_SIZE - 2);
        Text text = new Text();

        public Tile1(int x, int y) {
            this.x = y;
            this.y = x;
            //this.hasBomb = hasBomb;

            border.setStroke(Color.BLUE);
            border.setFill(Color.GREY);
            text.setFont(Font.font(18));

            // text.setVisible(false);
            getChildren().addAll(border, text);

            setTranslateX(x * TILE_SIZE);
            setTranslateY(y * TILE_SIZE);

            // setOnMouseDragOver(e ->open());
        }

    }

    public void printscoreboard(ScoreBoard[] scorboard) {

        if (scorboard.length >= 1) {
            idlabel1.setText("" + scorboard[0].ID);
            StartDatelabel1.setText(scorboard[0].DateStart.toString()+"||");
            firstplayernamelabel1.setText(scorboard[0].name1);
            endDatelabel1.setText(scorboard[0].DateEnd.toString());
            secundplayernamelabel1.setText(""+scorboard[0].playerwin.currentScoure);
            ExplorecoustomGame1.setVisible(true);
        }

        if (scorboard.length >= 2) {
            idlabel2.setText("" + scorboard[1].ID);
            StartDatelabel2.setText(scorboard[1].DateStart.toString()+"||");
            firstplayernamelabel2.setText(scorboard[1].name1);
            endDatelabel2.setText(scorboard[1].DateEnd.toString());
            secundplayernamelabel2.setText(""+scorboard[1].playerwin.currentScoure);
            ExplorecoustomGame2.setVisible(true);
        }

        if (scorboard.length >= 3) {
            idlabel3.setText("" + scorboard[2].ID);
            StartDatelabel3.setText(scorboard[2].DateStart.toString()+"||");
            firstplayernamelabel3.setText(scorboard[2].name1);
            endDatelabel3.setText(scorboard[2].DateEnd.toString());
            secundplayernamelabel3.setText(""+scorboard[2].playerwin.currentScoure);
            ExplorecoustomGame3.setVisible(true);
        }

        if (scorboard.length >= 4) {
            idlabel4.setText("" + scorboard[3].ID);
            StartDatelabel4.setText(scorboard[3].DateStart.toString()+"||");
            firstplayernamelabel4.setText(scorboard[3].name1);
            endDatelabel4.setText(scorboard[3].DateEnd.toString());
            secundplayernamelabel4.setText(""+scorboard[3].playerwin.currentScoure);
            ExplorecoustomGame4.setVisible(true);
        }

        if (scorboard.length >= 5) {
            idlabel5.setText("" + scorboard[4].ID);
            StartDatelabel5.setText(scorboard[4].DateStart.toString()+"||");
            firstplayernamelabel5.setText(scorboard[4].name1);
            endDatelabel5.setText(scorboard[4].DateEnd.toString());
            secundplayernamelabel5.setText(""+scorboard[4].playerwin.currentScoure);
            ExplorecoustomGame5.setVisible(true);
        }

    }

    @Override
    public void start(Stage stage) throws Exception {
        ExplorecoustomGame1.setVisible(false);
        ExplorecoustomGame2.setVisible(false);
        ExplorecoustomGame3.setVisible(false);
        ExplorecoustomGame4.setVisible(false);
        ExplorecoustomGame5.setVisible(false);
        MusicCheck.setSelected(true);
        TextFieldShield1.setVisible(true);
        TextFieldShield2.setVisible(true);
        scoreMinus.setVisible(false);
        TextFieldMarkedMinosScore.setVisible(false);
        TextFieldMarkedPlusScore.setVisible(false);
        TextFieldOpenedEmptyScore.setVisible(false);
        TextFieldOpenedMineScore.setVisible(false);
        TextFieldbounsLevel.setVisible(false);
        currentPlayer.setPadding(new Insets(15, 15, 15, 15));
        currentPlayer.add(titlLabe2, 1, 0);
        currentPlayer.add(timerlabel, 0, 0);
        currentPlayer.add(name, 0, 1);
        currentPlayer.add(CurrentPlayer, 1, 1);
        currentPlayer.add(spaselabel, 1, 5);//currentPlayer.add(spaselabel, 1, 2);
        currentPlayer.add(Score, 0, 2);
        currentPlayer.add(ScorePlayer, 1, 2);
        currentPlayer.add(shieldplayer, 0, 3);
        currentPlayer.add(shieldplayer1, 1, 3);
        currentPlayer.add(spaselabel1, 1, 5);
        currentPlayer.add(MarkCheck, 4, 2);
        currentPlayer.add(MusicCheck, 4, 1);
       // currentPlayer.add(Reset, 3, 4);
        currentPlayer.add(save, 3, 1);
        currentPlayer.add(Exit, 3, 2);
        currentPlayer.add(saveTextField, 2, 4);
        
        ///////////////////////////////////////////////////////////////////
        filtername.setToggleGroup(filterGroup);
        filterstartdate.setToggleGroup(filterGroup);
        filterenddate.setToggleGroup(filterGroup);
//        filtername.setSelected(true);
        scoreboardgrid.add(ScoreboardLabel, 2, 0);
        scoreboardgrid.add(filtername, 7, 1);
        scoreboardgrid.add(filterstartdate, 7, 2);
        scoreboardgrid.add(filterenddate, 7, 3);
        scoreboardgrid.add(idlabel1, 1, 1 + 5);
        scoreboardgrid.add(idlabel, 1, 5);
        scoreboardgrid.add(idlabel2, 1, 2 + 5);
        scoreboardgrid.add(idlabel3, 1, 3 + 5);
        scoreboardgrid.add(idlabel4, 1, 4 + 5);
        scoreboardgrid.add(idlabel5, 1, 5 + 5);
        scoreboardgrid.add(firstplayernamelabel, 2, 5);
        scoreboardgrid.add(firstplayernamelabel1, 2, 1 + 5);
        scoreboardgrid.add(firstplayernamelabel2, 2, 2 + 5);
        scoreboardgrid.add(firstplayernamelabel3, 2, 3 + 5);
        scoreboardgrid.add(firstplayernamelabel4, 2, 4 + 5);
        scoreboardgrid.add(firstplayernamelabel5, 2, 5 + 5);
        scoreboardgrid.add(secundplayernamelabel, 3, 5);
        scoreboardgrid.add(secundplayernamelabel1, 3, 1 + 5);
        scoreboardgrid.add(secundplayernamelabel2, 3, 2 + 5);
        scoreboardgrid.add(secundplayernamelabel3, 3, 3 + 5);
        scoreboardgrid.add(secundplayernamelabel4, 3, 4 + 5);
        scoreboardgrid.add(secundplayernamelabel5, 3, 5 + 5);
        scoreboardgrid.add(StartDatelabel, 4, 5);
        scoreboardgrid.add(StartDatelabel1, 4, 1 + 5);
        scoreboardgrid.add(StartDatelabel2, 4, 2 + 5);
        scoreboardgrid.add(StartDatelabel3, 4, 3 + 5);
        scoreboardgrid.add(StartDatelabel4, 4, 4 + 5);
        scoreboardgrid.add(StartDatelabel5, 4, 5 + 5);
        scoreboardgrid.add(endDatelabel, 5, 5);
        scoreboardgrid.add(endDatelabel1, 5, 1 + 5);
        scoreboardgrid.add(endDatelabel2, 5, 2 + 5);
        scoreboardgrid.add(endDatelabel3, 5, 3 + 5);
        scoreboardgrid.add(endDatelabel4, 5, 4 + 5);
        scoreboardgrid.add(endDatelabel5, 5, 5 + 5);

        scoreboardgrid.add(ExplorecoustomGamelabel5, 7, 5);
        scoreboardgrid.add(ExplorecoustomGame1, 7, 1 + 5);
        scoreboardgrid.add(ExplorecoustomGame2, 7, 2 + 5);
        scoreboardgrid.add(ExplorecoustomGame3, 7, 3 + 5);
        scoreboardgrid.add(ExplorecoustomGame4, 7, 4 + 5);
        scoreboardgrid.add(ExplorecoustomGame5, 7, 5 + 5);

//           
//            scoreboardgrid.add(firstplayernamelabel[x],2,x+5);
//            scoreboardgrid.add(secundplayernamelabel[x],3,x+5);
//            scoreboardgrid.add(StartDatelabel[x],4,x+5);
//            scoreboardgrid.add(endDatelabel[x],5,x+5);
//        
        for (int x = 0; x < 5; x++) {

            // scoreboardgrid.add(idlabel[x],1,x+5);
/*            scoreboardgrid.add(firstplayernamelabel[x],2,x+5);
             scoreboardgrid.add(secundplayernamelabel[x],3,x+5);
             scoreboardgrid.add(StartDatelabel[x],4,x+5);
             scoreboardgrid.add(endDatelabel[x],5,x+5);*/
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        shieldplayer.setTextFill(Color.rgb(255, 255, 255));///////////////////////////////set text color
        shieldplayer1.setTextFill(Color.rgb(255, 255, 255));///////////////////////////////set text color
        humanpleyar.setTextFill(Color.rgb(255, 255, 255));///////////////////////////////set text color
        randompleyar.setTextFill(Color.rgb(255, 255, 255));///////////////////////////////set text color
        consolGame.setTextFill(Color.rgb(255, 255, 255));///////////////////////////////set text color
        AIpleyar.setTextFill(Color.rgb(255, 255, 255));///////////////////////////////set text color
        GUIGame.setTextFill(Color.rgb(255, 255, 255));///////////////////////////////set text color
        costom.setTextFill(Color.rgb(255, 255, 255));///////////////////////////////set text color
        Score.setTextFill(Color.rgb(255, 255, 255));///////////////////////////////set text color
        name.setTextFill(Color.rgb(255, 255, 255));///////////////////////////////set text color
        scoreCheck.setTextFill(Color.rgb(255, 255, 255));///////////////////////////////set text color
        MarkCheck.setTextFill(Color.rgb(255, 255, 255));///////////////////////////////set text color
        MusicCheck.setTextFill(Color.rgb(255, 255, 255));///////////////////////////////set text color     
        titlLabel1.setTextFill(Color.rgb(155, 13, 5));///////////////////////////////set text color
        SubmitMain.setTextFill(Color.rgb(255, 255, 255));///////////////////////////////set text color
        Explore.setTextFill(Color.rgb(255, 255, 255));///////////////////////////////set text color
        score.setTextFill(Color.rgb(255, 255, 255));///////////////////////////////set text color
        Load.setTextFill(Color.rgb(255, 255, 255));///////////////////////////////set text color
        singlepleyar.setTextFill(Color.rgb(255, 255, 255));///////////////////////////////       set text color
        titlLabel.setTextFill(Color.rgb(155, 13, 5));///////////////////////////////       set text color
        titlLabe2.setTextFill(Color.rgb(155, 13, 5));///////////////////////////////       set text color
        titlLabe3.setTextFill(Color.rgb(155, 13, 5));///////////////////////////////       set text color
        titlLabe4.setTextFill(Color.rgb(155, 13, 5));///////////////////////////////       set text color
        titlLabelplayer1.setTextFill(Color.rgb(255, 255, 255));///////////////////////////////       set text color
        titlLabelplayer2.setTextFill(Color.rgb(255, 255, 255));///////////////////////////////       set text color
        titlLabeMarkedMinosScore.setTextFill(Color.rgb(255, 255, 255));///////////////////////////////       set text color
        titlLabeMarkedPlusScore.setTextFill(Color.rgb(255, 255, 255));///////////////////////////////       set text color
        titlLabeOpenedEmptyScore.setTextFill(Color.rgb(255, 255, 255));///////////////////////////////       set text color
        titlLabeOpenedMineScore.setTextFill(Color.rgb(255, 255, 255));///////////////////////////////       set text color
        titlLabebounsLevel.setTextFill(Color.rgb(255, 255, 255));///////////////////////////////       set text color
        titlLabelplayer.setTextFill(Color.rgb(255, 255, 255));///////////////////////////////       set text color
        miniLabel.setTextFill(Color.rgb(255, 255, 255));///////////////////////////////       set text color
        RrowsLabel.setTextFill(Color.rgb(255, 255, 255));///////////////////////////////       set text color
        collLabel.setTextFill(Color.rgb(255, 255, 255));///////////////////////////////       set text color
        scoreMinus.setTextFill(Color.rgb(50, 50, 207));///////////////////////////////       set text color
        titlLabelparameters.setTextFill(Color.rgb(155, 13, 5));///////////////////////////////       set text color
        titlLabelplayer.setTextFill(Color.rgb(155, 13, 5));
        timerlabel.setTextFill(Color.rgb(255,255,255));
        ///////////////////////////////       set text color
        titlLabel.setUnderline(true);//////////////////////////////       set text color
        titlLabe2.setUnderline(true);//////////////////////////////       set text color
        titlLabe3.setUnderline(true);//////////////////////////////       set text color
        titlLabe4.setUnderline(true);//////////////////////////////       set text color
        ////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////ids css        
        Score.setId("Score");
        shieldplayer.setId("shieldplayer");
        shieldplayer1.setId("shieldplayer1");
        name.setId("name");
        score.setId("score");
        titlLabelplayer.setId("titlLabelplayer");
        singlepleyar.setId("singlepleyar");
        humanpleyar.setId("humanpleyar");
        randompleyar.setId("randompleyar");
        consolGame.setId("consolGame");
        AIpleyar.setId("AIpleyar");
        GUIGame.setId("GUIGame");
        costom.setId("costom");
        titlLabel1.setId("titlLabel1");
        titlLabel.setId("titlLabel");
        titlLabe2.setId("titlLabe2");
        titlLabe3.setId("titlLabe3");
        saveTextField.setId("saveTextField");
        
        Explore.setId("Explore");
        titlLabe4.setId("titlLabe4");
        SubmitMain.setId("SubmitMain");
        Load.setId("Load");
        mainMnue.setId("mainMnue");
        enterplayergrid.setId("enterplayergrid");
        costomgrid.setId("costomgrid");
        currentPlayer.setId("currentPlayer");
        titlLabelplayer1.setId("titlLabelplayer1");
        titlLabelplayer2.setId("titlLabelplayer2");
        scoreCheck.setId("scoreCheck");
        MarkCheck.setId("MarkCheck");
        MusicCheck.setId("MusicCheck");
        scoreMinus.setId("scoreMinus");
        SubmitPlayer.setId("SubmitPlayer");
        SubmitCostom.setId("SubmitCostom");
        Reset.setId("Reset");
        Exit.setId("Exit");
        userTextField1.setId("userTextField1");
        collLabel.setId("userTextField2");
        RrowsLabel.setId("userTextField2");
        miniLabel.setId("userTextField2");
        titlLabeMarkedMinosScore.setId("userTextField2");
        titlLabeMarkedPlusScore.setId("userTextField2");
        titlLabeOpenedEmptyScore.setId("userTextField2");
        titlLabeOpenedMineScore.setId("userTextField2");
        titlLabebounsLevel.setId("userTextField2");
        titlLabelplayer.setId("userTextField2");
//        scoreMinus.setId("userTextField2");
        titlLabelparameters.setId("userTextField2");
        scoreboardgrid.setId("scoreboardgrid");

        Scene ScorePlayerscene = new Scene(scoreboardgrid, 1000, 600);
        Stage scoregridStage = new Stage();
        scoregridStage.setScene(ScorePlayerscene);

        Scene currentPlayerscene = new Scene(currentPlayer, 1000,600);
        Stage costomgridStage = new Stage();
        costomgridStage.setScene(currentPlayerscene);
        costomgridStage.setX(1000);
        costomgridStage.setY(10);
        currentPlayer.setHgap(5);
        // 
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
        mainMnue.add(singlepleyar, 1, 3);
        mainMnue.add(humanpleyar, 1, 4);
        mainMnue.add(randompleyar, 1, 5);
        mainMnue.add(AIpleyar, 1, 6);
        mainMnue.add(GUIGame, 3, 4);
        mainMnue.add(consolGame, 3, 5);
        mainMnue.add(costom, 3, 6);
        mainMnue.add(SubmitMain, 1, 7);
        mainMnue.add(Explore, 2, 7);
        mainMnue.add(Load, 3, 7);
        mainMnue.add(score, 4, 7);
        SubmitMain.setAlignment(Pos.BOTTOM_RIGHT);
        mainMnue.setAlignment(Pos.CENTER);
        ///////////////////////////////// ///////////////////////
        mainMnue.getStylesheets().add(getClass().getResource("style.css").toExternalForm());/////////////////////////////////////////
        currentPlayer.getStylesheets().add(getClass().getResource("style.css").toExternalForm());/////////////////////////////////////////
        SubmitMain.getStylesheets().add(getClass().getResource("style.css").toExternalForm());/////////////////////////////////////////
        titlLabelplayer.getStylesheets().add(getClass().getResource("style.css").toExternalForm());/////////////////////////////////////////
        titlLabelplayer1.getStylesheets().add(getClass().getResource("style.css").toExternalForm());/////////////////////////////////////////
        enterplayergrid.getStylesheets().add(getClass().getResource("style.css").toExternalForm());/////////////////////////////////////////
        costomgrid.getStylesheets().add(getClass().getResource("style.css").toExternalForm());/////////////////////////////////////////

        //  Scene costomgridScens=new Scene(mainMnue,200,200);
        /**
         * ******************************************
         */
        enterplayergrid.add(titlLabe3, 0, 0);
        enterplayergrid.add(titlLabelplayer, 1, 1);
        enterplayergrid.add(titlLabelplayer1, 0, 2);
        enterplayergrid.add(userTextField1, 1, 2);
        enterplayergrid.add(titlLabelplayer2, 0, 3);
        enterplayergrid.add(userTextField2, 1, 3);
        enterplayergrid.add(priventshie1d1, 4, 2);
        enterplayergrid.add(priventshie1d2, 4, 3);

        enterplayergrid.add(TextFieldShield1, 5, 2);
        enterplayergrid.add(TextFieldShield2, 5, 3);

        enterplayergrid.add(SubmitPlayer, 2, 5);
        /**
         * *******************************************
         */
        costomgrid.add(titlLabe4, 0, 0);
        costomgrid.add(titlLabelparameters, 2, 1);
        costomgrid.add(collLabel, 1, 2);
        costomgrid.add(RrowsLabel, 1, 3);
        costomgrid.add(miniLabel, 1, 4);
        costomgrid.add(shieldcountLabel, 1, 5);
        costomgrid.add(colluserTextField, 2, 2);
        costomgrid.add(RowsTextField, 2, 3);
        costomgrid.add(miniTextField, 2, 4);
        costomgrid.add(TextFieldShieldcount, 2, 5);
        costomgrid.add(scoreCheck, 1, 7);
        costomgrid.add(scoreMinus, 1, 8);

        costomgrid.add(titlLabelTimerenter, 1, 6);
        costomgrid.add(TimerTextField, 2, 6);

        costomgrid.add(titlLabeMarkedMinosScore, 1, 9);
        costomgrid.add(TextFieldMarkedMinosScore, 2, 9);

        costomgrid.add(titlLabeMarkedPlusScore, 1, 10);
        costomgrid.add(TextFieldMarkedPlusScore, 2, 10);

        costomgrid.add(titlLabeOpenedMineScore, 1, 11);
        costomgrid.add(TextFieldOpenedMineScore, 2, 11);

        costomgrid.add(titlLabeOpenedEmptyScore, 1, 12);
        costomgrid.add(TextFieldOpenedEmptyScore, 2, 12);

        costomgrid.add(titlLabebounsLevel, 1, 13);
        costomgrid.add(TextFieldbounsLevel, 2, 13);

        costomgrid.add(SubmitCostom, 2, 14);
        costomgrid.setId("costomgrid");
        //}
        Scene enterplayerscena = new Scene(enterplayergrid, 1200, 768);
        Stage enterplayerstage = new Stage();
        enterplayerstage.setTitle("Enter Player");
        enterplayerstage.setScene(enterplayerscena);
        Scene mainMnuescena = new Scene(mainMnue, 1400, 768);
        Stage mainMnuestage = new Stage();
        mainMnuestage.setTitle("main Mnue");
        mainMnuestage.setScene(mainMnuescena);
        mainMnuestage.show();
        Scene costomGrid = new Scene(costomgrid, 1200, 768);
        Stage Stagecostom = new Stage();
        Stagecostom.setTitle("Costom Parameter");
        Stagecostom.setScene(costomGrid);
        scene = new Scene(createContent());
        singlepleyar.setSelected(true);
        GUIGame.setSelected(true);

        MusicCheck.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                if (MusicCheck.isSelected()) {
                    mediaplayer.play();
                } else {
                    mediaplayer.pause();
                }
            }
        });
        filtername.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                //add fillter
                List<ScoreBoard> scoree = new ArrayList<>();
                FileChooser chooser = new FileChooser();
                ObjectInputStream input;
                try {
                    File sel = new File(" ScoreBoard.bin");
                    if (sel == null||!sel.exists()) {
                        return;
                    }
                    input = new ObjectInputStream(new FileInputStream(sel));
                    Object b = input.readObject();
                    scoree = (List<ScoreBoard>) b;
                } catch (IOException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                }
                ScoreBoard[] temp = new ScoreBoard[scoree.size()];
                for (int i = 0; i < scoree.size(); i++) {
                    temp[i] = scoree.get(i);
                }

                for (int i = 0; i < scoree.size(); i++) {
                    for (int j = i + 1; j < scoree.size(); j++) {
                        if (temp[i].name1.charAt(0) >= temp[j].name1.charAt(0)) {
                            ScoreBoard tempp = temp[j];
                            temp[j] = temp[i];
                            temp[i] = tempp;
                        }
                    }
                }
                printscoreboard(temp);
                ObjectOutput output;
                String e = " ScoreBoard1.bin";
                try {
                    output = new ObjectOutputStream(new FileOutputStream(e));
                    output.writeObject(temp);
                    output.close();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });
        filterstartdate.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                //add fillter
                List<ScoreBoard> scoree = new ArrayList<>();
                FileChooser chooser = new FileChooser();
                ObjectInputStream input;
                try {
                    File sel = new File(" ScoreBoard.bin");
                    if (sel == null||!sel.exists()) {
                        return;
                    }
                    input = new ObjectInputStream(new FileInputStream(sel));
                    Object b = input.readObject();
                    scoree = (List<ScoreBoard>) b;
                } catch (IOException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                }
                ScoreBoard[] temp = new ScoreBoard[scoree.size()];
                for (int i = 0; i < scoree.size(); i++) {
                    temp[i] = scoree.get(i);
                }

                for (int i = 0; i < scoree.size(); i++) {
                    for (int j = i + 1; j < scoree.size(); j++) {
                        if (temp[i].DateStart.after(temp[j].DateEnd)) {
                            ScoreBoard tempp = temp[j];
                            temp[j] = temp[i];
                            temp[i] = tempp;
                        }
                    }
                }

                printscoreboard(temp);
                ObjectOutput output;
                String e = " ScoreBoard1.bin";
                try {
                    output = new ObjectOutputStream(new FileOutputStream(e));
                    output.writeObject(temp);
                    output.close();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        filterenddate.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                //add fillter
                List<ScoreBoard> scoree = new ArrayList<>();
                FileChooser chooser = new FileChooser();
                ObjectInputStream input;
                try {
                    File sel = new File("ScoreBoard.bin");
                    if (sel == null||!sel.exists()) {
                        return;
                    }
                    input = new ObjectInputStream(new FileInputStream(sel));
                    Object b = input.readObject();
                    scoree = (List<ScoreBoard>) b;
                } catch (IOException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                }
                ScoreBoard[] temp = new ScoreBoard[scoree.size()];
                for (int i = 0; i < scoree.size(); i++) {
                    temp[i] = scoree.get(i);
                }

                for (int i = 0; i < scoree.size(); i++) {
                    for (int j = i + 1; j < scoree.size(); j++) {
                        if (temp[i].DateStart.before(temp[j].DateEnd)) {
                            ScoreBoard tempp = temp[j];
                            temp[j] = temp[i];
                            temp[i] = tempp;
                        }
                    }
                }

                printscoreboard(temp);
                ObjectOutput output;
                String e = "ScoreBoard1.bin";
                try {
                    output = new ObjectOutputStream(new FileOutputStream(e));
                    output.writeObject(temp);
                    output.close();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        stage.setResizable(false);
        costomgridStage.setResizable(false);
        mainMnuestage.setResizable(false);
        Stagecostom.setResizable(false);
        Stagecostom.setResizable(false);
        scoregridStage.setResizable(false);
/////////////////////////////////////////////////// 
        scoreCheck.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                if (!scoreCheck.isSelected()) {
                    scoreMinus.setVisible(false);
                    TextFieldMarkedMinosScore.setVisible(false);
                    TextFieldMarkedPlusScore.setVisible(false);
                    TextFieldOpenedEmptyScore.setVisible(false);
                    TextFieldOpenedMineScore.setVisible(false);
                    TextFieldbounsLevel.setVisible(false);

                } else {
                    scoreMinus.setVisible(true);
                    TextFieldMarkedMinosScore.setVisible(true);
                    TextFieldMarkedPlusScore.setVisible(true);
                    TextFieldOpenedEmptyScore.setVisible(true);
                    TextFieldOpenedMineScore.setVisible(true);
                    TextFieldbounsLevel.setVisible(true);
                }
            }
        });
        ExplorecoustomGame1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                ScoreBoard[] scoree = null;
                ObjectInputStream input;
                try {
                    File sel = new File("ScoreBoard1.bin");
                    if (sel == null||!sel.exists()) {
                        return;
                    }
                    input = new ObjectInputStream(new FileInputStream(sel));
                    scoree = (ScoreBoard[]) input.readObject();

                } catch (IOException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                }

                ObjectInputStream input1;
                try {
                    File sel1 = new File(scoree[0].path);
                    if (sel1 == null||!sel1.exists()) {
                        System.out.println("ASASAWDSDD");
                        return;
                    }
                    input1 = new ObjectInputStream(new FileInputStream(sel1));
                    Object b = input1.readObject();
                    List<PlayerMove> movee = (List<PlayerMove>) b;

                    mainMnuestage.close();
                    X_TILES = movee.get(0).coll;
                    Y_TILES = movee.get(0).row;
                    H = TILE_SIZE * Y_TILES - 10;
                    W = TILE_SIZE * X_TILES - 10;
                    grid = null;
                    grid1 = new Tile1[X_TILES][Y_TILES];

                    scene.setRoot(createContent1());
                    //  mediaplayer.play();
                    costomgridStage.setX(500);
                    costomgridStage.setY(20);
                    costomgridStage.show();
                    stage.setScene(scene);
                    stage.setX(300);
                    stage.setY(300);
                    stage.show();
                    Thread soso = new ExploreGame(movee);
                    soso.start();

                    System.out.println("ccccccccccccccccccccccc");
                } catch (IOException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                }
                scoregridStage.close();
            }
        });
        ExplorecoustomGame2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                ScoreBoard[] scoree = null;
                ObjectInputStream input;
                try {
                    File sel = new File("ScoreBoard1.bin");
                    if (sel == null||!sel.exists()) {
                        return;
                    }
                    input = new ObjectInputStream(new FileInputStream(sel));
                    scoree = (ScoreBoard[]) input.readObject();

                } catch (IOException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                }

                ObjectInputStream input1;
                try {
                    File sel1 = new File(scoree[1].path);
                    if (sel1 == null||!sel1.exists()) {
                        return;
                    }
                    input1 = new ObjectInputStream(new FileInputStream(sel1));
                    Object b = input1.readObject();
                    List<PlayerMove> movee = (List<PlayerMove>) b;

                    mainMnuestage.close();
                    X_TILES = movee.get(0).coll;
                    Y_TILES = movee.get(0).row;
                    H = TILE_SIZE * Y_TILES - 10;
                    W = TILE_SIZE * X_TILES - 10;
                    grid = null;
                    grid1 = new Tile1[X_TILES][Y_TILES];

                    scene.setRoot(createContent1());
                    //  mediaplayer.play();
                    costomgridStage.setX(500);
                    costomgridStage.setY(20);
                    costomgridStage.show();
                    stage.setScene(scene);
                    stage.setX(300);
                    stage.setY(300);
                    stage.show();
                    Thread soso = new ExploreGame(movee);
                    soso.start();

                    System.out.println("ccccccccccccccccccccccc");
                } catch (IOException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                }
                scoregridStage.close();
            }
        });
        ExplorecoustomGame3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                ScoreBoard[] scoree = null;
                ObjectInputStream input;
                try {
                    File sel = new File("ScoreBoard1.bin");
                    if (sel == null||!sel.exists()) {
                        return;
                    }
                    input = new ObjectInputStream(new FileInputStream(sel));
                    scoree = (ScoreBoard[]) input.readObject();

                } catch (IOException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                }

                ObjectInputStream input1;
                try {
                    File sel1 = new File(scoree[2].path);
                    if (sel1 == null||!sel1.exists()) {
                        return;
                    }
                    input1 = new ObjectInputStream(new FileInputStream(sel1));
                    Object b = input1.readObject();
                    List<PlayerMove> movee = (List<PlayerMove>) b;

                    mainMnuestage.close();
                    X_TILES = movee.get(0).coll;
                    Y_TILES = movee.get(0).row;
                    H = TILE_SIZE * Y_TILES - 10;
                    W = TILE_SIZE * X_TILES - 10;
                    grid = null;
                    grid1 = new Tile1[X_TILES][Y_TILES];

                    scene.setRoot(createContent1());
                    //  mediaplayer.play();
                    costomgridStage.setX(500);
                    costomgridStage.setY(20);
                    costomgridStage.show();
                    stage.setScene(scene);
                    stage.setX(300);
                    stage.setY(300);
                    stage.show();
                    Thread soso = new ExploreGame(movee);
                    soso.start();

                    System.out.println("ccccccccccccccccccccccc");
                } catch (IOException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                }
                 scoregridStage.close();
            }
            
        });
        ExplorecoustomGame4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                ScoreBoard[] scoree = null;
                ObjectInputStream input;
                try {
                    File sel = new File("ScoreBoard1.bin");
                    if (sel == null||sel.exists()) {
                        System.out.println("ERROR");
                        return;
                    }
                    input = new ObjectInputStream(new FileInputStream(sel));
                    scoree = (ScoreBoard[]) input.readObject();

                } catch (IOException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                }

                ObjectInputStream input1;
                try {
                    File sel1 = new File(scoree[3].path);
                    if (sel1 == null||!sel1.exists()) {
                        return;
                    }
                    input1 = new ObjectInputStream(new FileInputStream(sel1));
                    Object b = input1.readObject();
                    List<PlayerMove> movee = (List<PlayerMove>) b;

                    mainMnuestage.close();
                    X_TILES = movee.get(0).coll;
                    Y_TILES = movee.get(0).row;
                    H = TILE_SIZE * Y_TILES - 10;
                    W = TILE_SIZE * X_TILES - 10;
                    grid = null;
                    grid1 = new Tile1[X_TILES][Y_TILES];

                    scene.setRoot(createContent1());
                    //  mediaplayer.play();
                    costomgridStage.setX(500);
                    costomgridStage.setY(20);
                    costomgridStage.show();
                    stage.setScene(scene);
                    stage.setX(300);
                    stage.setY(300);
                    stage.show();
                    Thread soso = new ExploreGame(movee);
                    soso.start();

                    System.out.println("ccccccccccccccccccccccc");
                } catch (IOException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                }
                scoregridStage.close();
            }
           
      });
        ExplorecoustomGame5.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                
                ScoreBoard[] scoree = null;
                ObjectInputStream input;
                try {
                    File sel = new File("ScoreBoard1.bin");
                    if (sel == null||!sel.exists()) {
                        return;
                    }
                    input = new ObjectInputStream(new FileInputStream(sel));
                    scoree = (ScoreBoard[]) input.readObject();

                } catch (IOException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                }

                ObjectInputStream input1;
                try {
                    File sel1 = new File(scoree[4].path);
                    if (sel1 == null||!sel1.exists()) {
                        return;
                    }
                    input1 = new ObjectInputStream(new FileInputStream(sel1));
                    Object b = input1.readObject();
                    List<PlayerMove> movee = (List<PlayerMove>) b;

                    mainMnuestage.close();
                    X_TILES = movee.get(0).coll;
                    Y_TILES = movee.get(0).row;
                    H = TILE_SIZE * Y_TILES - 10;
                    W = TILE_SIZE * X_TILES - 10;
                    grid = null;
                    grid1 = new Tile1[X_TILES][Y_TILES];

                    scene.setRoot(createContent1());
                    //  mediaplayer.play();
                    costomgridStage.setX(500);
                    costomgridStage.setY(20);
                    costomgridStage.show();
                    stage.setScene(scene);
                    stage.setX(300);
                    stage.setY(300);
                    stage.show();
                    Thread soso = new ExploreGame(movee);
                    soso.start();

                    System.out.println("ccccccccccccccccccccccc");
                } catch (IOException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                }
                scoregridStage.close();
            }
        });
        priventshie1d1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                if (priventshie1d1.isSelected()) {
                    TextFieldShield1.setVisible(false);
                } else {
                    TextFieldShield1.setVisible(true);
                }
            }
        });
        priventshie1d2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                if (priventshie1d2.isSelected()) {
                    TextFieldShield2.setVisible(false);
                } else {
                    TextFieldShield2.setVisible(true);
                }

            }
        });
        SubmitMain.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                Minesweeper.SetGrid(10, 10, 15, countshieldGrid);

                if (singlepleyar.isSelected()) {

                    titlLabelplayer2.setVisible(false);
                    priventshie1d2.setVisible(false);
                    userTextField2.setVisible(false);
                    TextFieldShield2.setVisible(false);
                    enterplayerstage.show();
                }
                if (humanpleyar.isSelected()) {
                    titlLabelplayer2.setVisible(true);
                    userTextField2.setVisible(true);

                    enterplayerstage.show();
                }
                if (randompleyar.isSelected()) {
                    titlLabelplayer2.setVisible(true);
                    userTextField2.setVisible(true);
                    enterplayerstage.show();
                }
                if (AIpleyar.isSelected()) {
                    titlLabelplayer2.setVisible(true);
                    userTextField2.setVisible(true);
                    enterplayerstage.show();
                }
                if (costom.isSelected()) {
                    Stagecostom.show();
                }
                if (GUIGame.isSelected()) {
                    Minesweeper.currentGame = new GuiGame();

                }
                if (consolGame.isSelected()) {
                    Minesweeper.currentGame = new ConsoleGame();
                }

                mainMnuestage.close();

            }
        });
        SubmitCostom.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                boolean ex = false;
                try {
                    row = Integer.parseInt(RowsTextField.getText());
                    coll = Integer.parseInt(colluserTextField.getText());
                    mine = Integer.parseInt(miniTextField.getText());
                    delay = Integer.parseInt(TimerTextField.getText());
                    System.out.println(sheild);
                    countshieldGrid = Integer.parseInt(TextFieldShieldcount.getText());
                    if (row < 0 || row > 26 || coll < 0 || coll > 26 || mine < 0 || mine > coll * row) {
                        throw new IllegalInput("ERROR The Number Not Allowed");
                    }
                    ex = true;
                } catch (IllegalInput exp) {
                    alert.setHeaderText("ERROR");
                    alert.setContentText(exp.getMessage());
                    alert.show();
                } catch (NumberFormatException exp1) {
                    alert.setHeaderText("ERORR");
                    alert.setContentText(exp1.getMessage());
                    alert.show();
                }

                if (ex) {
                    Minesweeper.SetGrid(row, coll, mine, countshieldGrid);
                    boolean ex1 = false;
                    if (scoreCheck.isSelected())//dimit the score
                    {
                        Minesweeper.currentGame.checkTypeCollecting = true;
                    }
                    try {
                        MarkedMinosScore = Integer.parseInt(TextFieldMarkedMinosScore.getText());
                        MarkedPlusScore = Integer.parseInt(TextFieldMarkedPlusScore.getText());
                        OpenedEmptyScore = Integer.parseInt(TextFieldOpenedEmptyScore.getText());
                        OpenedMineScore = Integer.parseInt(TextFieldOpenedMineScore.getText());
                        bounsLevel = Integer.parseInt(TextFieldbounsLevel.getText());
                        if (MarkedMinosScore < 0 || MarkedPlusScore < 0 || OpenedEmptyScore < 0 || OpenedMineScore < 0 || bounsLevel < 0) {
                            throw new IllegalInput("ERROR Dont Enter Nigative values");
                        }
                        ex1 = true;

                    } catch (IllegalInput exp4) {
                        alert.setHeaderText("ERORR");
                        alert.setContentText(exp4.getMessage());
                        alert.show();
                    } catch (NumberFormatException exp3) {
                        alert.setHeaderText("ERORR");
                        alert.setContentText(exp3.getMessage());
                        alert.show();
                    }
                    if (ex && ex1) {
                        Stagecostom.close();
                    }

                    if (scoreCheck.isSelected()) {
                        Minesweeper.currentGame.setTypeCollecting(true);
                    }
                    if (scoreMinus.isSelected()) {
                        Minesweeper.setMinosScore(true);
                    }
                    Minesweeper.setParameterScore(-MarkedMinosScore, MarkedPlusScore, OpenedEmptyScore, -OpenedMineScore, bounsLevel);
                }
                /*    
                 */
            }
        });
        SubmitPlayer.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                boolean ex1 = false;

                try {
                    name1 = userTextField1.getText();
                    name2 = userTextField2.getText();
                    countStartShield1 = Integer.parseInt(TextFieldShield1.getText());
                    countStartShield2 = Integer.parseInt(TextFieldShield2.getText());
                    Minesweeper.n1 = name1;
                    Minesweeper.n2 = name2;
                    if (name1.contentEquals(name2) || name1.contentEquals("") || name2.contentEquals("")) {
                        throw new IllegalInput("ERROR : You cant Add the same name for two players");
                    }
                    ex1 = true;
                } catch (IllegalInput exp2) {
                    alert.setHeaderText("ERROR");
                    alert.setContentText(exp2.getMessage());
                    alert.show();
                } catch (NumberFormatException exp4) {
                }

                if (ex1) {

                    if (singlepleyar.isSelected()) {
                        Minesweeper.n2 = "";
                        if (priventshie1d1.isSelected()) {
                            startShield = true;

                        }
                        Minesweeper.currentGame.addPlyar(1, name1, startShield, countStartShield1);
                        name2 = "";
                    }
                    if (humanpleyar.isSelected()) {
                        if (priventshie1d1.isSelected()) {
                            startShield = true;
                        }
                        Minesweeper.currentGame.addPlyar(1, name1, startShield, countStartShield1);
                        startShield = false;
                        if (priventshie1d2.isSelected()) {
                            startShield = true;
                        }
                        Minesweeper.currentGame.addPlyar(1, name2, startShield, countStartShield2);
                    }
                    if (AIpleyar.isSelected()) {
                        if (priventshie1d1.isSelected()) {
                            startShield = true;
                        }
                        Minesweeper.currentGame.addPlyar(1, name1, startShield, countStartShield1);
                        startShield = false;
                        if (priventshie1d2.isSelected()) {
                            startShield = true;
                        }

                        Minesweeper.currentGame.addPlyar(3, name2, startShield, countStartShield2);
                    }
                    if (randompleyar.isSelected()) {
                        if (priventshie1d1.isSelected()) {
                            startShield = true;
                        }
                        Minesweeper.currentGame.addPlyar(1, name1, startShield, countStartShield1);
                        startShield = false;
                        if (priventshie1d2.isSelected()) {
                            startShield = true;
                        }
                        Minesweeper.currentGame.addPlyar(2, name2, startShield, countStartShield2);
                    }
                    if (GUIGame.isSelected()) {
                        //  Minesweeper.currentGame = new GuiGame();

                        X_TILES = coll;
                        Y_TILES = row;
                        H = TILE_SIZE * Y_TILES - 10;
                        W = TILE_SIZE * X_TILES - 10;
                        grid = null;
                        grid = new Tile[X_TILES][Y_TILES];
                        scene.setRoot(createContent());
                        mediaplayer.play();
                        stage.setScene(scene);
                        CurrentPlayer.setText(Minesweeper.NextPlayer(Minesweeper.currentGame.players).getNamee());
                        if (Minesweeper.NextPlayer(Minesweeper.currentGame.players).colorPlayer == "LIGHTPINK") {
                            CurrentPlayer.setTextFill(Color.LIGHTPINK);
                        } else {
                            CurrentPlayer.setTextFill(Color.TURQUOISE);
                        }
                        stage.setX(50);
                        stage.setY(20);
                        stage.show();
                        Printwindow p = new Printwindow();
                        p.start();
                        Thread t = new Timer();
                        t.start();
                        costomgridStage.setX(500);
                        costomgridStage.setY(20);
                        costomgridStage.show();
// costomgridStage.show();//the stage score
                    }
                    /*if if (consolGame.isSelected()) {
                     Minesweeper.currentGame = new ConsoleGame();
                     }*/
                    enterplayerstage.close();

                    // Minesweeper.SetGrid(row, coll, mine);
                    if (consolGame.isSelected()) {
//                        Minesweeper.currentGame.setTypeCollecting(true);
//                        Minesweeper.setMinosScore(true);
                        Thread t = new Timer();
                        t.start();
                        Minesweeper.StartGame();
                    }

                }
            }
        });
        Exit.setOnAction(new EventHandler<ActionEvent>() {

            @Override

            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });
        score.setOnAction(new EventHandler<ActionEvent>() {

            @Override

            public void handle(ActionEvent event) {
                scoregridStage.show();
            }
        });
        Reset.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                Minesweeper = null;
                Minesweeper = new Grid();
                stage.close();

                costomgridStage.close();
                scene = new Scene(createContent());
                mainMnuestage.show();
            }
        });
        Explore.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ObjectInputStream input;
                Minesweeper = new Grid();
                try {
                    //  java.awt.Desktop.getDesktop().browse(new URI("E:last1"));
                    FileChooser chooser = new FileChooser();
                    chooser.setTitle("Select Binary File");
                    chooser.setInitialDirectory(new File("Explore Game"));
                    File sel = chooser.showOpenDialog(null);
                    chooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Binary File", "*.BIN"));
                    if (sel == null) {
                        return;
                    }
                    input = new ObjectInputStream(new FileInputStream(sel));
                    Object b = input.readObject();
                    List<PlayerMove> movee = (List<PlayerMove>) b;

                    mainMnuestage.close();
                    X_TILES = movee.get(0).coll;
                    Y_TILES = movee.get(0).row;
                    H = TILE_SIZE * Y_TILES - 10;
                    W = TILE_SIZE * X_TILES - 10;
                    grid = null;
                    grid1 = new Tile1[X_TILES][Y_TILES];

                    scene.setRoot(createContent1());
                    //  mediaplayer.play();
                    costomgridStage.setX(500);
                    costomgridStage.setY(20);
                    costomgridStage.show();
                    stage.setScene(scene);
                    stage.setX(300);
                    stage.setY(300);
                    stage.show();
                    Thread soso = new ExploreGame(movee);
                    soso.start();
                } catch (IOException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        save.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                class saveGame extends Thread {

                    @Override
                    public void run() {
                        String sese=saveTextField.getText();
                        if(sese=="")
                            sese="temp";
                        ObjectOutput output;
                        Date o = new Date();
                        System.out.println(o.toString());
//                         String g=o.toString();
                        String s = "Game Save\\" +sese + ".bin";
                        try {

                            output = new ObjectOutputStream(new FileOutputStream(s));
                            output.writeObject(Minesweeper);
                            output.close();
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) {
                            Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                }
                Thread tSave = new saveGame();
                tSave.start();
//                System.exit(0);

            }
        });
        Load.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                // load
                ObjectInputStream input;

                try {
                    //  java.awt.Desktop.getDesktop().browse(new URI("E:last1"));
                    FileChooser chooser = new FileChooser();
                    chooser.setTitle("Select Binary File");
                    chooser.setInitialDirectory(new File("Game Save"));
                    File sel = chooser.showOpenDialog(null);

                    chooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Binary File", "*.BIN"));
                    if (sel == null) {
                        return;
                    }
                    input = new ObjectInputStream(new FileInputStream(sel));
                    Object b = input.readObject();
                    Minesweeper = (Grid) b;
                } catch (IOException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
                }
                mainMnuestage.close();
                X_TILES = coll;
                Y_TILES = row;
                H = TILE_SIZE * Y_TILES - 10;
                W = TILE_SIZE * X_TILES - 10;
                grid = null;
                grid = new Tile[X_TILES][Y_TILES];
                scene.setRoot(createContent());
                //  mediaplayer.play();
                stage.setScene(scene);
                /*CurrentPlayer.setText(Minesweeper.NextPlayer(Minesweeper.currentGame.players).getNamee());
                 if (Minesweeper.NextPlayer(Minesweeper.currentGame.players).colorPlayer == "LIGHTPINK") {
                 CurrentPlayer.setTextFill(Color.LIGHTPINK);
                 } else {
                 CurrentPlayer.setTextFill(Color.TURQUOISE);
                 }*/
                stage.setX(50);
                stage.setY(20);
                stage.show();
                Printwindow p = new Printwindow();
                p.start();
                Thread t = new Timer();
                t.start();
                costomgridStage.setX(500);
                costomgridStage.setY(20);
                costomgridStage.show();
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
