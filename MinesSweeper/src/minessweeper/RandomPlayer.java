/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minessweeper;

import java.io.Serializable;
import static java.lang.Thread.sleep;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Created by IntelliJ IDEA.
 * User: Alaa Alkheder
 * Email:alaa-alkheder@outlook.com
 * Github:alaa-alkheder
 */
public class RandomPlayer extends AutoPlayer implements Serializable{

    
            @Override
    public void run()
{
    
                try {
                    Thread.sleep(timedelay);
                } catch (InterruptedException ex) {
                    Logger.getLogger(RandomPlayer.class.getName()).log(Level.SEVERE, null, ex);
                }
}
    
    RandomPlayer() {
      this.setPlayerName("Player"+((int) (Math.random() * 10) + 0)); 
    }

    @Override
    public Indexes enterIndex(Square squares[][],int x,int y) {    
        Indexes obIndex = new Indexes();
        obIndex.x = ((int) (Math.random() * x) + 0);
        obIndex.y = ((int) (Math.random() * y) + 0);
        obIndex.typemove = MoveType.Reveal;
        return obIndex;
    }
    
    @Override
    public void printStatus() {
        if(this.pStatus == PlayerStatus.Win)
        System.out.println("\t\t< < < < < < < < < < < "+this.getNamee()+ " Win > > > > > > > > > > >");
        else
        System.out.println("\t\t< < < < < < < < < < < "+this.getNamee()+ " Lose > > > > > > > > > > >");
    }

    @Override
    public void SetIndexGUI(Indexes a) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
