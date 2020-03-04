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
 * Githup:alaa-alkheder
 */
public class IllegalGameMove extends MinesweeperGameExeption implements Serializable{

    public IllegalGameMove(String Message) {
        super(Message);
    }
 
    @Override
    public void printExeption() {
        System.out.println("error input");
    }
    
}
