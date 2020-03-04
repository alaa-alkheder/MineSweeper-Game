/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minessweeper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: Alaa Alkheder
 * Email:alaa-alkheder@outlook.com
 * Github:alaa-alkheder
 */
public class AIPlayer extends AutoPlayer implements Serializable {

    
               @Override
    public void run()
{
     try {
                    Thread.sleep(timedelay);
                } catch (InterruptedException ex) {
                    Logger.getLogger(RandomPlayer.class.getName()).log(Level.SEVERE, null, ex);
                }
}
    AIPlayer() {
        this.setPlayerName( "AIPlayer" + ((int) (Math.random() * 10) + 0));
    }

    @Override
    public Indexes enterIndex(Square squares[][], int x, int y) {

        List<Indexes> listIndexes = new ArrayList<>();
        int minNumber = 8;
        int optimal = 0;
        int count_closed2 = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (squares[i][j].status == SquareStatus.OpenedNumber) {
                    if (Integer.parseInt(squares[i][j].value) <= minNumber) {
                        count_closed2 = 0;
                        int rowNbr[] = {-1, -1, -1, 0, 0, 1, 1, 1};
                        int colNbr[] = {-1, 0, 1, -1, 1, -1, 0, 1};

                        for (int c = 0; c < 8; c++) {
                            if (IsSafe(squares, i + rowNbr[c], j + colNbr[c], x, y)) {
                                if ((squares[i + rowNbr[c]][j + colNbr[c]]).status == SquareStatus.Closed) {
                                    count_closed2++;
                                }
                            }
                        }

//                        int c = Integer.parseInt(squares[i][j].value);           for provide algrithim
//                            count_closed2 -= c;
                        if (count_closed2 >= optimal) {
                            optimal = count_closed2;
                            minNumber = Integer.parseInt(squares[i][j].value);
                            listIndexes.clear();
                            for (int u = 0; u < 8; u++) {
                                if (IsSafe(squares, i + rowNbr[u], j + colNbr[u], x, y)) {
                                    if ((squares[i + rowNbr[u]][j + colNbr[u]]).status == SquareStatus.Closed) {
                                        Indexes obIndex = new Indexes();
                                        obIndex.typemove = MoveType.Reveal;
                                        obIndex.x = (i) + rowNbr[u];
                                        obIndex.y = (j) + colNbr[u];
                                        listIndexes.add(obIndex);
                                    }
                                }
                            }

                        }
                    }
                }
            }
        }

        Indexes obIndex = new Indexes();
        if (!listIndexes.isEmpty()) {
            int random = (int) ((Math.random() * listIndexes.size()) + 0);
            obIndex = (listIndexes.get(random));
        } else {
            obIndex.x = ((int) (Math.random() * x) + 0);
            obIndex.y = ((int) (Math.random() * y) + 0);
            obIndex.typemove = MoveType.Reveal;
        }
        return obIndex;
    }

    public boolean IsSafe(Square squares[][], int row, int col, int x, int y) {
        return ((row >= 0) && (row < x) && (col >= 0) && (col < y));
    }

    @Override
    public void printStatus() {
        if (this.pStatus == PlayerStatus.Win) {
            System.out.println("\t\t< < < < < < < < < < < " + this.getNamee() + " Win > > > > > > > > > > >");
        } else {
            System.out.println("\t\t< < < < < < < < < < < " + this.getNamee()+ " Lose > > > > > > > > > > >");
        }
    }

    @Override
    public void SetIndexGUI(Indexes a) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
