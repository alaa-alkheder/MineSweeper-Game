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
public class PlayerMove implements Serializable{
        
  public Player player;
   Square square;
   MoveType type;
   MoveResult result;
   int coll,row;
  public int Time;
  int curentShield,currentscore;

    public PlayerMove() {
        square=new Square();
    }


    
   
   
   
}
