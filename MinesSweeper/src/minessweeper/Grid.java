/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minessweeper;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import javax.sound.midi.Soundbank;

/**
 * Created by IntelliJ IDEA.
 * User: Alaa Alkheder
 * Email:alaa-alkheder@outlook.com
 * Github:alaa-alkheder
 */
public class Grid implements Serializable {

    public Square[][] Squares;
    Mine[] mines;
    int countMine;
    Game currentGame;
    int x, y;
    boolean visited[][];
    int countSquareClosed;
    boolean minosScore = false;
    Score playeScore = new Score();
    int firstClic = 0;
    int shieldGrid;
    //Alert alert1 = new Alert(Alert.AlertType.CONFIRMATION.CONFIRMATION);
    public String n1, n2;
    public int t;
    int ID;
    Date DateStart, DateEnd;
    Player playerWin;

    public Grid() {
        this.shieldGrid = 0;
        Date o = new Date();
        DateStart = o;
    }

    public void SetGrid(int X, int Y, int Z, int countShield) {
        this.minosScore = false;
        this.shieldGrid = countShield;
        this.countSquareClosed = X * Y;
        this.x = X;
        this.y = Y;
        Squares = new Square[X][Y];
        mines = new Mine[Z];
        for (int i = 0; i < Z; i++) {
            this.mines[i] = new Mine();
        }
        int x1, x2;

        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                Squares[i][j] = new Square();
            }
        }

        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                Squares[i][j].set(i, j);
            }
        }

        int a[][] = new int[X][Y], c;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                a[i][j] = -1;
            }
        }

        for (int i = 0; i < Z; i++) {
            do {
                c = 0;
                x1 = ((int) (Math.random() * X) + 0);
                x2 = ((int) (Math.random() * Y) + 0);
                if (a[x1][x2] == -1) {
                    c = 1;
                }
            } while (c == 0);
            Squares[x1][x2].mine.ID = "1";
            a[x1][x2] = 0;
        }

        int b[][] = new int[X][Y], c1, count = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                b[i][j] = -1;
            }
        }

        for (int i = 0; i < countShield; i++) {
            do {
                c1 = 0;
                x1 = ((int) (Math.random() * X) + 0);
                x2 = ((int) (Math.random() * Y) + 0);
                if (b[x1][x2] == -1 && (!Squares[x1][x2].IsMine())) {
                    c1 = 1;
                }
            } while (c1 == 0);
            Squares[x1][x2].shielded.SetShield(true);
            b[x1][x2] = 0;
            count++;
        }

        this.countMine = mines.length;
        visited = new boolean[X][Y];
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                visited[i][j] = false;
            }
        }

    }

    public void initGrid() {
    }

    public void setScore(Score scoreobj) {
        this.playeScore = scoreobj;
    }

    public void StartGame() {
        PlayerMove move = new PlayerMove();
        Thread th = new RandomPlayer();
        System.out.println("count shield : " + shieldGrid);
        NormalGame c = new NormalGame();
        NormalGame.GameRules e = c.new DefaultRules();
        move.Time = t;
        move.coll = y;
        move.row = x;
        if (!currentGame.players.isEmpty()) {

            currentGame.printt(this.x, this.y, this.Squares);
            currentGame.currentPlayer = e.DecideNextPlayer(currentGame.players);
            currentGame.currentPlayer.run();
//                     currentGame.currentPlayer.run();

            Indexes obj = new Indexes();
            if (currentGame instanceof ConsoleGame) {
                System.out.println(currentGame.currentPlayer.getNamee() + " Turn");
                System.out.println("count shield : " + currentGame.currentPlayer.shieldPlayer);
                if (currentGame.checkTypeCollecting) {
                    if (currentGame.currentPlayer.getScore() < 10) {
                        System.out.println("Player Score : " + currentGame.currentPlayer.getScore());
                    }
                }
            }
            int p = 0;
            do {
                try {
                    p = 1;
                    obj = currentGame.currentPlayer.enterIndex(this.Squares, this.x, this.y);
                    if (obj.x == -1) {
                        return;
                    }
                    move.player = currentGame.currentPlayer;
                    move.square.x = obj.x;
                    move.square.y = obj.y;
                    move.type = obj.typemove;
                    if (firstClic == 0) {
                        changeFirstClic(obj);
                        this.firstClic++;
                    }
                    move.square.mine.setMiniID(Squares[move.square.x][move.square.y].GetMiniID());
                    if (checkAcceptMove(move.square.x, move.square.y, move.type)) {
                        throw new IllegalGameMove("error");
                    }
                } catch (ArrayIndexOutOfBoundsException exp) {
                    if (currentGame instanceof ConsoleGame) {
                        System.out.println("error : index out of array");
                    }
                    p = 0;
                } catch (IllegalGameMove exp) {
                    if (currentGame instanceof ConsoleGame) {
                        System.out.println("error : index out of array");
                    }
                    p = 0;
                }
            } while (p == 0);
            t = 0;
            move.curentShield = currentGame.currentPlayer.shieldPlayer;
            move.currentscore = currentGame.currentPlayer.currentScoure;
            AcceptMove(move);
            ObjectOutput output;
            Date o = new Date();
            System.out.println(o.toString());
//             String g=o.toString();

            String s = "Explore Game\\" + n1 + " && " + n2 + ".bin";
            try {

                output = new ObjectOutputStream(new FileOutputStream(s));
                output.writeObject(currentGame.moves);
                output.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public void AcceptMove(PlayerMove move) //the squere is close must be closed
    {

        if (move.type == MoveType.Mark) {
            Squares[move.square.x][move.square.y].squareColor = currentGame.currentPlayer.colorPlayer;
            if (Squares[move.square.x][move.square.y].status == SquareStatus.Marked) {
                Squares[move.square.x][move.square.y].status = SquareStatus.Closed;
                Squares[move.square.x][move.square.y].value = "O";
                move.square.status = SquareStatus.Closed;
                Squares[move.square.x][move.square.y].squareColor = " ";
                Squares[move.square.x][move.square.y].PlayersMoves.add(currentGame.currentPlayer);

            } else {
                move.square.status = SquareStatus.Marked;         //mark square           
                move.square.value = "!";
                Squares[move.square.x][move.square.y].status = SquareStatus.Marked;
                Squares[move.square.x][move.square.y].value = "P";
                Squares[move.square.x][move.square.y].PlayersMoves.add(currentGame.currentPlayer);
                currentGame.currentPlayer.currentScoure += playeScore.calcScore(move.square);                   //calc score
                currentGame.players.set(currentGame.players.size() - 1, currentGame.currentPlayer);
                //change player score 
            }
            move.square.squareColor = currentGame.currentPlayer.colorPlayer;
            move.player = currentGame.currentPlayer;
            move.square.shielded.shield = Squares[move.square.x][move.square.y].shielded.shield;
            move.curentShield = currentGame.currentPlayer.shieldPlayer;
            move.currentscore = currentGame.currentPlayer.currentScoure;
            currentGame.moves.add(move);
        } else {/// reveal square
            if (Squares[move.square.x][move.square.y].status != SquareStatus.Marked) {  // throw exeption
                if (Squares[move.square.x][move.square.y].IsMine()) //mine square
                {
                    move.square.status = SquareStatus.OpenedMine;
                    move.square.value = "B";
                    Squares[move.square.x][move.square.y].status = SquareStatus.OpenedMine;
                    Squares[move.square.x][move.square.y].value = "B";
                    Squares[move.square.x][move.square.y].squareColor = currentGame.currentPlayer.colorPlayer;
                    move.square.squareColor = currentGame.currentPlayer.colorPlayer;
                    move.player = currentGame.currentPlayer;
                    move.square.shielded.shield = Squares[move.square.x][move.square.y].shielded.shield;
                    move.curentShield = currentGame.currentPlayer.shieldPlayer;
            move.currentscore = currentGame.currentPlayer.currentScoure;
                    currentGame.moves.add(move);
                    if (currentGame.currentPlayer.shieldPlayer <= 0) {
                        if (currentGame.checkTypeCollecting) {
                            currentGame.currentPlayer.currentScoure += playeScore.calcScore(move.square);                   //calc score
                            currentGame.players.set(currentGame.players.size() - 1, currentGame.currentPlayer);            //change player score    
                        } else {
                            currentGame.currentPlayer.pStatus = PlayerStatus.Lose;
                            currentGame.players.remove(currentGame.players.size() - 1);
                            currentGame.currentPlayer.printStatus();
                        }
                    } else {
                        currentGame.currentPlayer.diccreasShield();
                    }
                    this.countSquareClosed--;
                    this.countMine--;
                    Squares[move.square.x][move.square.y].PlayersMoves.add(currentGame.currentPlayer);
                } else {
                    DFS(move);
                }
            }
        }

        if (currentGame.checkTypeCollecting) {
            if (this.minosScore) {
                if (currentGame.currentPlayer.currentScoure < 0) {
                    currentGame.currentPlayer.pStatus = PlayerStatus.Lose;
                    currentGame.players.remove(currentGame.players.size() - 1);
                    currentGame.currentPlayer.printStatus();
                }
            }
        }

        if (countSquareClosed == this.countMine || this.countMine == 0) {
            currentGame.printt(this.x, this.y, this.Squares);
            currentGame.currentPlayer.currentScoure += playeScore.bounsLevel;
            currentGame.currentPlayer.pStatus = PlayerStatus.Win;
            playerWin = currentGame.currentPlayer;
            for (int i = 0; i < currentGame.currentPlayer.shieldPlayer; i++) {
                currentGame.currentPlayer.currentScoure += 50;
            }
            currentGame.players.set(0, currentGame.currentPlayer);

            /*  alert1.setHeaderText("Win");
             alert1.setContentText(currentGame.currentPlayer.getNamee()+" WIN");
             alert1.show();*/
            if (currentGame instanceof ConsoleGame) {
                currentGame.currentPlayer.printStatus();
            }
            currentGame.players.clear();
        }

        if ((NextPlayer(currentGame.players) instanceof ConsolPlayer)) {
            StartGame();
        }

    }

    public void DFS(PlayerMove move) {//calling acceptmove
        int rowNbr[] = {-1, -1, -1, 0, 0, 1, 1, 1};
        int colNbr[] = {-1, 0, 1, -1, 1, -1, 0, 1};

        int count_mine = 0;
        for (int i = 0; i < 8; ++i) {
            {
                if (IsSafe(Squares, move.square.x + rowNbr[i], move.square.y + colNbr[i], visited, 1)) {
                    if ((this.Squares[(move.square.x) + rowNbr[i]][(move.square.y) + colNbr[i]]).IsMine()) {
                        count_mine++;
                    }
                }
            }
        }

        visited[move.square.x][move.square.y] = true;
        if (count_mine == 0) {
            if (move.square.status != SquareStatus.Marked) {
                move.square.status = SquareStatus.OpenedEmpty;
                if (Squares[move.square.x][move.square.y].shielded.IsShield()) {
                    currentGame.currentPlayer.increasShield();
                    this.shieldGrid--;
                }
                move.square.value = "E";
                Squares[move.square.x][move.square.y].status = SquareStatus.OpenedEmpty;
                Squares[move.square.x][move.square.y].value = "E";
                Squares[move.square.x][move.square.y].squareColor = currentGame.currentPlayer.colorPlayer;
                this.countSquareClosed--;
                Squares[move.square.x][move.square.y].PlayersMoves.add(currentGame.currentPlayer);
                currentGame.currentPlayer.currentScoure += playeScore.calcScore(move.square);
                currentGame.players.set(currentGame.players.size() - 1, currentGame.currentPlayer);
                move.square.squareColor = currentGame.currentPlayer.colorPlayer;
                move.player = currentGame.currentPlayer;
                move.square.shielded.shield = Squares[move.square.x][move.square.y].shielded.shield;
                 move.curentShield = currentGame.currentPlayer.shieldPlayer;
            move.currentscore = currentGame.currentPlayer.currentScoure;
                currentGame.moves.add(move);
            }
            for (int i = 0; i < 8; ++i) {
                PlayerMove temp = new PlayerMove();
                temp.Time = t;
                temp.square.PlayersMoves = move.square.PlayersMoves;
                temp.square.mine = move.square.mine;
                temp.square.status = move.square.status;
                temp.square.x = move.square.x + rowNbr[i];
                temp.square.y = move.square.y + colNbr[i];
                temp.square.squareColor = currentGame.currentPlayer.colorPlayer;
                if (IsSafe(Squares, move.square.x + rowNbr[i], move.square.y + colNbr[i], visited, 2)) {
                    DFS(temp);
                }
            }
        } else {
            String s = "";
            s += count_mine;
            move.square.value = s;
            move.square.status = SquareStatus.OpenedNumber;
            if (Squares[move.square.x][move.square.y].shielded.IsShield()) {
                currentGame.currentPlayer.increasShield();
                this.shieldGrid--;
            }
            currentGame.currentPlayer.currentScoure += playeScore.calcScore(move.square);
            currentGame.players.set(currentGame.players.size() - 1, currentGame.currentPlayer);
            Squares[move.square.x][move.square.y].status = SquareStatus.OpenedNumber;
            Squares[move.square.x][move.square.y].value = s;
            Squares[move.square.x][move.square.y].squareColor = currentGame.currentPlayer.colorPlayer;
            this.countSquareClosed--;
            Squares[move.square.x][move.square.y].PlayersMoves.add(currentGame.currentPlayer);
            move.square.squareColor = currentGame.currentPlayer.colorPlayer;
            move.player = currentGame.currentPlayer;
            move.square.shielded.shield = Squares[move.square.x][move.square.y].shielded.shield;
            move.curentShield = currentGame.currentPlayer.shieldPlayer;
            move.currentscore = currentGame.currentPlayer.currentScoure;
            currentGame.moves.add(move);
        }
    }

    public boolean IsSafe(Square squares[][], int row, int col, boolean visited[][], int i) {
        if (i == 2) {
            return ((row >= 0) && (row < this.x) && (col >= 0) && (col < this.y) && !visited[row][col]);
        } else {
            return ((row >= 0) && (row < this.x) && (col >= 0) && (col < this.y));
        }

    } // check the square if it safe

    public void setParameterScore(int MarkedMinosScore, int MarkedPlusScore, int OpenedEmptyScore, int OpenedMineScore, int bounsLevel) {
        playeScore.setScore(MarkedMinosScore, MarkedPlusScore, OpenedEmptyScore, OpenedMineScore, bounsLevel);
    }

    public Player NextPlayer(LinkedList<Player> players) {
        return players.peek();
    }

    public boolean checkAcceptMove(int x, int y, MoveType typemove) {
        return (Squares[x][y].status == SquareStatus.OpenedEmpty || Squares[x][y].status == SquareStatus.OpenedNumber || Squares[x][y].status == SquareStatus.OpenedMine || (typemove == MoveType.Reveal && Squares[x][y].status == SquareStatus.Marked));
    }

    public void setMinosScore(boolean x) {
        this.minosScore = x;
    }

    public void changeFirstClic(Indexes obj) {
        if (obj.typemove == MoveType.Reveal && Squares[obj.x][obj.y].IsMine()) {

            for (int i = 0; i < this.x; i++) {
                for (int j = 0; j < this.y; j++) {
                    if (!this.Squares[i][j].IsMine()) {
                        Squares[i][j].SetMiniID("1");
                        this.Squares[obj.x][obj.y].SetMiniID("0");
                        return;
                    }
                }
            }

        }
    }

}
