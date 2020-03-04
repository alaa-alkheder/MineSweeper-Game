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
public abstract class AutoPlayer extends Player implements Serializable{

    @Override
    public Indexes enterIndex(Square squares[][],int x,int y) {
        return null;
    }

    @Override
    public void printStatus() {
    }

   
   

   
}
