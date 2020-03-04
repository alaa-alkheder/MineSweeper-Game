/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minessweeper;

import java.io.Serializable;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.objects.NativeString;

/**
 * Created by IntelliJ IDEA.
 * User: Alaa Alkheder
 * Email:alaa-alkheder@outlook.com
 * Github:alaa-alkheder
 */
public class ConsolPlayer extends Player implements Serializable{

    
    
               @Override
    public void run()
{
    

}
    ConsolPlayer() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Indexes enterIndex(Square squares[][], int x, int y) {
        Indexes obIndex = new Indexes();
        int c = 1;

        String squareIndex;
        System.out.println("Enter the square index : ");
        do {
            try {
                c = 1;
                Scanner input = new Scanner(System.in);
                squareIndex = input.nextLine();
                if (squareIndex.length() > 1) {
                    String cc = NativeString.substring(squareIndex, squareIndex.length() - 1, squareIndex.length());
                    if (cc.hashCode() < 65 || cc.hashCode() > 91) {
                        throw new IllegalSquareName("error");
                    }
                } else if (squareIndex.length() == 1) {
                    throw new IllegalSquareName("error");
                } else {
                    throw new IllegalSquareName("error");
                }

                if (squareIndex.charAt(0) == '-')//is mark
                {
                    obIndex.x = Integer.parseInt(squareIndex.substring(1, squareIndex.length() - 1));
                    obIndex.typemove = MoveType.Mark;

                } else {
                    obIndex.x = Integer.parseInt(squareIndex.substring(0, squareIndex.length() - 1));
                    obIndex.typemove = MoveType.Reveal;
                }
                String a = squareIndex.substring(squareIndex.length() - 1, squareIndex.length());
                obIndex.y = a.hashCode() - 65;

            } catch (IllegalSquareName e) {
                e.printExeption();
                c = 0;
            } catch (NumberFormatException exp) {
                System.out.println("inviled input");
                c = 0;
            }

        } while (c == 0);

        return obIndex;
    }

    @Override
    public void printStatus() {
        if (this.pStatus == PlayerStatus.Win) {
            System.out.println("\t\t< < < < < < < < < < < Player " + this.getNamee() + " Win > > > > > > > > > > >");
        } else {
            System.out.println("\t\t< < < < < < < < < < < Player " + this.getNamee() + " Lose > > > > > > > > > > >");
        }
    }

    @Override
    public void SetIndexGUI(Indexes a) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
   

}
