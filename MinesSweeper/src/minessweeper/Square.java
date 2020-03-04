package minessweeper;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

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
public class Square implements Serializable{

    int x, y;
    Mine mine;
    String squareColor;
    SquareStatus status;
    List<Player> PlayersMoves;
    String value;
    Shield shielded;

    Square() {
        shielded = new Shield();
        this.mine = new Mine();
        value="O";
        status=SquareStatus.Closed;
        this.PlayersMoves = new LinkedList<>();
        this.squareColor = " ";

    }

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

public String GetMiniID() {
        return mine.GetMiniID();
    }

 public void SetMiniID(String id) {
        mine.setMiniID(id);
    }

    public boolean IsMine() {
        return this.mine.ID.equals("1");
    }
    
    public Square copy(Square square)
    {
        square.PlayersMoves = this.PlayersMoves;
        square.mine = this.mine;
        square.squareColor = this.squareColor;
        square.status = this.status;
        square.value = this.value;
        square.x = this.x;
        square.y = this.y;
        return square;
    }

}
