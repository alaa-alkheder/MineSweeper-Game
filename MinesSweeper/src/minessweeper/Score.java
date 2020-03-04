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
public class Score implements Serializable{

    int MarkedMinosScore = -1, MarkedPlusScore = 5, OpenedEmptyScore = 10, OpenedMineScore = -250, bounsLevel = 100;

    public Score() {
    }

    public Score(int MarkedMinosScore, int MarkedPlusScore, int OpenedEmptyScore, int OpenedMineScore) {
        this.MarkedMinosScore = MarkedMinosScore;
        this.MarkedPlusScore = MarkedPlusScore;
        this.OpenedEmptyScore = OpenedEmptyScore;
        this.OpenedMineScore = OpenedMineScore;
    }

    public void setScore(int MarkedMinosScore, int MarkedPlusScore, int OpenedEmptyScore, int OpenedMineScore,int bounsLevel) {
        this.MarkedMinosScore = MarkedMinosScore;
        this.MarkedPlusScore = MarkedPlusScore;
        this.OpenedEmptyScore = OpenedEmptyScore;
        this.OpenedMineScore = OpenedMineScore;
        this.bounsLevel = bounsLevel;
    }

    public int calcScore(Square selectionSquare) {
        switch (selectionSquare.status) {
            case Marked: {
                if (selectionSquare.IsMine()) {
                    return this.MarkedMinosScore;
                } else {
                    return this.MarkedPlusScore;
                }
            }

            case OpenedEmpty:
                return this.OpenedEmptyScore;
            case OpenedMine:
                return this.OpenedMineScore;
            case OpenedNumber:
                return Integer.parseInt(selectionSquare.value);
        }
        return 0;
    }
}
