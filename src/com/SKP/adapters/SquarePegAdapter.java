package com.SKP.adapters;

import com.SKP.round.RoundPeg;
import com.SKP.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private final SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg){
        this.peg = peg;
    }

    @Override
    public double getRadius(){
        double result = peg.getWidth()*Math.sqrt(2)/2;
        return result;
    }
}
