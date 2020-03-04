/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minessweeper;

import java.io.Serializable;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Alaa Alkheder
 * Email:alaa-alkheder@outlook.com
 * Github:alaa-alkheder
 */
public class IllegalSquareName extends MinesweeperGameExeption implements Serializable{

    public IllegalSquareName(String Message) {
        super(Message);
    }

     static void IsInputErro(int x) throws IllegalSquareName
    {
        if(x != 1 )
        {
            throw  new IllegalSquareName("error input from mazen ");
        }
    }
    @Override
    public void printExeption(){
        System.out.println("error input");
    }
    
}
