package com.SKP;

import com.SKP.adapters.SquarePegAdapter;
import com.SKP.round.RoundHole;
import com.SKP.round.RoundPeg;
import com.SKP.square.SquarePeg;

public class Main {

    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        if(hole.fits(roundPeg)){
            System.out.println("Pasuje!!!");
        }

        SquarePeg squarePeg1 = new SquarePeg(2);
        SquarePeg squarePeg2 = new SquarePeg(20);

        SquarePegAdapter squarePegAdapter1 = new SquarePegAdapter(squarePeg1);
        SquarePegAdapter squarePegAdapter2 = new SquarePegAdapter(squarePeg2);

        if(hole.fits(squarePegAdapter1)){
            System.out.println("Pasuje!!!");
        }
        if(!hole.fits(squarePegAdapter2)){
            System.out.println("Ups!!!");
        }

    }
}
