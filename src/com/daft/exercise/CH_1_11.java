package com.daft.exercise;

public class CH_1_11 {
    public static void main(String[] args) {
        double tot_time = 5 * 365 * 24 * 3600;
        double tot_birth = tot_time / 7;
        double tot_death = tot_time / 13;
        double tot_immigrant = tot_time / 45;
        int change = (int)(tot_birth + tot_immigrant - tot_death);
        System.out.println( change + 312032486 );
    }
}
