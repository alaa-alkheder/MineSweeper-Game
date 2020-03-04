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
public class GuiPlayer extends Player implements Serializable{
Indexes a=new Indexes();
    GuiPlayer() {
      a.x=0;
      a.y=0;
    }

    @Override
    public void printStatus() {
        
    }

    
    @Override
    public Indexes enterIndex(Square squares[][], int x, int y) {
        return this.a;
    }
    
    
    @Override
    public void SetIndexGUI(Indexes a)
         
 {
      this.a.x=a.x;
      this.a.y=a.y;
      this.a.typemove=a.typemove;
      System.out.println(a.x);
      System.out.println(a.y);
 }

  



    
}
