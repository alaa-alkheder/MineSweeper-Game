/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minessweeper;

import java.io.Serializable;
import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 * User: Alaa Alkheder
 * Email:alaa-alkheder@outlook.com
 * Github:alaa-alkheder
 */
 public class Color implements Serializable{
     Stack<String> colorStack = new Stack<>();
     Color()
     {
         
         colorStack.push("Yellow");
         colorStack.push("Blue");
         colorStack.push("LIGHTPINK");
         colorStack.push("TURQUOISE");
     }
     
    
     
    public String getColor() {
      return colorStack.pop();
    }
  
}
