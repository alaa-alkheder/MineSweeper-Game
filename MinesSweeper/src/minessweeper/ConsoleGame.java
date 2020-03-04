/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minessweeper;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: Alaa Alkheder
 * Email:alaa-alkheder@outlook.com
 * Github:alaa-alkheder
 */
public class ConsoleGame extends NormalGame implements Serializable{

    @Override
    public boolean AcceptMove(PlayerMove move) {
        return super.AcceptMove(move); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addPlyar(int x, String playerName,boolean prevent,int countShield) {
        Player ob = null;
        switch (x) {
            case 1:
                ob = new ConsolPlayer();
                ob.setPlayerName(playerName);
                ob.colorPlayer = this.colorObj.getColor();
                ob.setShieldPlayer(countShield);
                if(prevent)
                    ob.preventShiled();
                break;
            case 2:
                ob = new RandomPlayer();
                ob.setPlayerName(playerName);
                ob.colorPlayer = this.colorObj.getColor();
                 ob.setShieldPlayer(countShield);
                                if(prevent)
                    ob.preventShiled();
                break;
            case 3:
                ob = new AIPlayer();
                ob.setPlayerName(playerName);
                ob.colorPlayer = this.colorObj.getColor();
                 ob.setShieldPlayer(countShield);
                                if(prevent)
                    ob.preventShiled();
                break;
        }
        players.add(ob);
    }

    @Override
    public void printt(int x, int y, Square squares[][]) //print the squaers
    {
        System.out.println("\n\n\n");
        for (int i = 0; i < x; i++) {
            System.out.print(" \t" + (char) (i + 65));
        }
        System.out.println("");

        for (int i = 0; i < x; i++) {
            System.out.print(i + " : ");
            for (int j = 0; j < y; j++) {
                System.out.print("\t" + squares[i][j].value + " " + squares[i][j].squareColor.charAt(0));
            }
            System.out.println("");
        }
        System.out.println("\n ----------------------------------------------------------------------------------------");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(" \t" + squares[i][j].mine.ID);
            }
            System.out.println();
        }
        
         System.out.println("\n ----------------------------------------------------------------------------------------");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if( squares[i][j].shielded.IsShield())
                System.out.print(" \t1");
                else
                    System.out.print(" \t0");
            }
            System.out.println();
        }

    }

    @Override
    public void setTypeCollecting(boolean checkTypeCollecting) {      // decied type of playing with score or without
        this.checkTypeCollecting = checkTypeCollecting;
    }

}
