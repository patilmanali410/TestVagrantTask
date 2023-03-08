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
        int count = tv.getNumberOfForeignPlayersInTeam();
        System.out.println("Foreign players : " + count);
    }
}
