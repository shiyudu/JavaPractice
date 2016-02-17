package com.sdu.lc;
import java.util.*;

public class NimGame {
    public static boolean canWinNim(int n) {
        HashMap<Integer, Boolean> winMap = new HashMap<Integer, Boolean>();
        winMap.put(1, true);
        winMap.put(2, true);
        winMap.put(3, true);
        winMap.put(4, false);
        
        boolean myTurn = true;
        return winThisRound(n, winMap, myTurn);
    }
    
    public static boolean winThisRound(int n, HashMap<Integer, Boolean> winMap, boolean myTurn) {
        boolean canWin = false;
        
        if (n <= 0) {
            canWin = false;
        } else if (winMap.get(n) != null) {
            canWin = winMap.get(n);
        } else {
        	boolean pick1 = winThisRound((n-1), winMap, !myTurn);
//        	System.out.println("n = " + n + ", pick1 = " + pick1);
        	
        	boolean pick2 = winThisRound((n-2), winMap, !myTurn);
//        	System.out.println("n = " + n + ", pick2 = " + pick2);
        	
        	boolean pick3 = winThisRound((n-3), winMap, !myTurn);     	
//        	System.out.println("n = " + n + ", pick3 = " + pick3);
        	
//            canWin = winThisRound((n-1), winMap, !myTurn) || winThisRound((n-2), winMap, !myTurn) || winThisRound((n-3), winMap, !myTurn);
        	if (myTurn) {
        		canWin = pick1 || pick2 || pick3;
        	} else {
        		canWin = !pick1 || !pick2 || !pick3;
        	}

            winMap.put(n, canWin);
        }
       

        if (myTurn) {
//        	System.out.println("myTurn = " + myTurn + ", n = " + n + ", canWin = " + canWin);
            return canWin;
        }
        else {
//        	System.out.println("myTurn = " + myTurn + ", n = " + n + ", canWin = " + canWin);
        	return !canWin;
        }
            
    }
    
    public static void main(String[] args) throws Exception{
    	for (int i = 1; i < 42; i++) {
//    	int i = 9;
    		System.out.println("n = " + i + ", canWin = " + canWinNim(i));
    	}
    	
    }

}
