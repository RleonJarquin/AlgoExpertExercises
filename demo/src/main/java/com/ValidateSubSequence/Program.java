package com.ValidateSubSequence;

import java.util.*;

class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    // Write your code here. 
    int seqIdx = 0;

    // Loop through the array and if the value is in the array traverse through the sequence by one
    for(int x = 0; x < array.size(); x++){
        if(array.get(x) == sequence.get(seqIdx)){
            x++;
        }
        if(seqIdx ==  sequence.size()){
            return true;
        }


    }

    
    return false;
  }
}


 
    


