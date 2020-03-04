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
public abstract class MinesweeperGameExeption extends Exception implements Serializable{

    public MinesweeperGameExeption( String Message) {
        super(Message);
    }
    
    
    public abstract void printExeption();
}
