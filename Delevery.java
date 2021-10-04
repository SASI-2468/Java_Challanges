package com.sasi;

public class Delevery {
    private float overs;
    private int balls;
    private int runs;

    public Delevery(){

    }
    public float getOvers() {
        return overs;
    }

    public void setOvers(float overs) {
        this.overs = overs;
    }

    public Delevery(int balls, int runs) {
        this.balls = balls;
        this.runs = runs;
    }
}
