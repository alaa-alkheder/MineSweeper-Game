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
public class Shield implements Serializable{
    public boolean shield;

    public Shield() {
        this.shield = false;
    }
    
    public boolean IsShield() 
    {
        return this.shield;
    }
    public void SetShield(boolean sh){
        this.shield = sh;
    }
    
}
