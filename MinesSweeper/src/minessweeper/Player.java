package minessweeper;

import java.io.Serializable;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Created by IntelliJ IDEA.
 * User: Alaa Alkheder
 * Email:alaa-alkheder@outlook.com
 * Github:alaa-alkheder
 */
public abstract class Player extends Thread implements Serializable{

    Indexes a = new Indexes();
     String name;
    String colorPlayer;
    PlayerStatus pStatus;
    int currentScoure;
   public int shieldPlayer;
    boolean hasShiled;
    int timedelay;
    
    public Player() {
        a.x = 0;
        a.y = 0;
        currentScoure = 0;
        pStatus = PlayerStatus.Playing;
        colorPlayer = "";
        shieldPlayer = 0;
        hasShiled = true;
    }
    

    public abstract void printStatus();

    public int getScore() {
        return this.currentScoure;
    }

    public void setPlayerName(String name) {

        this.name = name;
    }

    public PlayerMove GetPlayerMove() {
        PlayerMove a = new PlayerMove();
        return a;
    }

    public String getNamee() {
        return this.name;
    }

    public abstract void SetIndexGUI(Indexes a);

    public Indexes enterIndex(Square squares[][], int x, int y) {
        return null;
    }

    public void increasShield() {
        if(hasShiled==true)
        this.shieldPlayer++;
    }

    public void diccreasShield() {
                if(hasShiled==true)
        this.shieldPlayer--;
    }

    public void preventShiled() {
       hasShiled=false;
    }
    public void setShieldPlayer(int sh)
    {
        this.shieldPlayer = sh;
    }
    @Override
    public void run()
{

}


}
