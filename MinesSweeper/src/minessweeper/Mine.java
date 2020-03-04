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
public class Mine implements Serializable{
String ID="0";    
public void setMiniID (String id)
{
    this.ID=id;
}
public String GetMiniID ()
{
    return this.ID;
}
}


