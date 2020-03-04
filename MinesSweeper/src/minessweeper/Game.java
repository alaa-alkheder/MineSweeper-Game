/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minessweeper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Alaa Alkheder
 * Email:alaa-alkheder@outlook.com
 * Github:alaa-alkheder
 */
public abstract  class Game implements Serializable{

    LinkedList<Player> players;
   Player currentPlayer;
    List<PlayerMove> moves;
    GameRules currentRules;
    boolean checkTypeCollecting;
   public  Color colorObj;
    
    
 public Game() {
        players = new LinkedList<>();
        moves =new ArrayList<>();
        colorObj = new Color();
    } 
 
   abstract  class  GameRules 
    { 
       public abstract int GetScoreChange();
        public abstract Player DecideNextPlayer(LinkedList<Player> players);
    }
    
   public void initGame(PlayerMove move)
   {
       
   }
   
   public abstract boolean AcceptMove(PlayerMove move);  
   public void ApplyPlayerMove(PlayerMove move)
   {
       
   }

    public abstract void addPlyar(int x, String playerName,boolean prevent,int countShield);
    public abstract void printt(int x, int y,Square squares[][]);
    public abstract void setTypeCollecting(boolean checkTypeCollecting);
 
  
}
