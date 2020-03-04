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
public class Indexes implements Serializable{
    public int x,y;
     MoveType typemove;

    public Indexes() { 
    }
    public void copyObject(Indexes obj)
    {
        this.x=obj.x;
        this.y=obj.y;
        this.typemove=obj.typemove;
    }
    
    
}
 