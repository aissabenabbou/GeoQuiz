package com.example.engeneer0x0.geoquiz;

/**
 * Created by engeneer0x0 on 13/06/2016.
 */
public class Question {
    private int mtextResId;
    private boolean manswerTrue;

    public Question(int textResId, boolean answerTrue){
        mtextResId  = textResId ;
        manswerTrue = answerTrue ;

    }

    public void setMtextResId(int mtextResId) {
        this.mtextResId = mtextResId;
    }

    public void setManswerTrue(boolean manswerTrue) {
        this.manswerTrue = manswerTrue;
    }

    public int getMtextResId() {
        return mtextResId;
    }

    public boolean isManswerTrue() {
        return manswerTrue;
    }
}
