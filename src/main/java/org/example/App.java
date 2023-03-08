package org.example;

import org.example.Task.TestVagrant;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        TestVagrant tv = new TestVagrant();
        System.out.println("Foreign players count: " + tv.getNumberOfForeignPlayersInTeam());
        System.out.println("Wicket-Keeper count : " + tv.getWicketKeeperCount());
    }
}
