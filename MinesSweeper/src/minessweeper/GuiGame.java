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
public class GuiGame extends NormalGame implements Serializable{

    @Override
    public void addPlyar(int x, String playerName,boolean prevent,int countShield) {
        Player ob = null;
        switch (x) {
            case 1:
                ob = new GuiPlayer();
                ob.setPlayerName(playerName);
                ob.colorPlayer = this.colorObj.getColor();
                 ob.setShieldPlayer(countShield);
                                if(prevent)
                    ob.preventShiled();
                break;
            case 2:
                ob = new RandomPlayer();
                ob.colorPlayer = this.colorObj.getColor();
                 ob.setShieldPlayer(countShield);
                                if(prevent)
                    ob.preventShiled();
                break;
            case 3:
                ob = new AIPlayer();
                ob.colorPlayer = this.colorObj.getColor();
                 ob.setShieldPlayer(countShield);
                                if(prevent)
                    ob.preventShiled();
                break;
        }
        players.add(ob);
    }

    @Override
    public void setTypeCollecting(boolean checkTypeCollecting) {      // decied type of playing with score or without
        this.checkTypeCollecting = checkTypeCollecting;
    }
}
