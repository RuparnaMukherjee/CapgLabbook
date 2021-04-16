package com.capg.Lab3;

import java.time.*;
import java.util.*;
public class Ex9DateDuration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        LocalDate pdate = LocalDate.of(2012, 01, 01);
        LocalDate now = LocalDate.now();
 
        Period diff = Period.between(pdate, now);
 
     System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
                    diff.getYears(), diff.getMonths(), diff.getDays());

	}

}
