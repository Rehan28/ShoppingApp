package com.rehan.game.Chp7;

public class Dimension {
    private final int height;
    private final int length;
    private final int width;

    public Dimension(int height,int length,int width){
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public int getVolum(){
        return this.height*length*width;
        //this ar not this same
    }
}
