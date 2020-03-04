/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minessweeper;

import java.io.Serializable;
import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA.
 * User: Alaa Alkheder
 * Email:alaa-alkheder@outlook.com
 * Github:alaa-alkheder
 */
public class NormalGame extends Game implements Serializable{

    NormalGame() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean AcceptMove(PlayerMove move) {
        return true;
    }

    @Override
    public void addPlyar(int x, String playerName,boolean prevent,int countShield) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printt(int x, int y,Square squares[][]) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTypeCollecting(boolean checkTypeCollecting) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   


    public class DefaultRules extends GameRules {

        @Override
        public int GetScoreChange() {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return 0;
        }

        @Override
        public Player DecideNextPlayer(LinkedList<Player> players) {
            Player c = players.peek();
            players.remove();
            players.add(c);
            return c;
        }

    }

}
