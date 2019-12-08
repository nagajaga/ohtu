/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistics.matcher;

import statistics.Player;

/**
 *
 * @author joel
 */
public class HasFewerThan implements Matcher{
    
    Matcher hasAtLeast;
    Matcher not;

    public HasFewerThan(int i, String goals) {
        hasAtLeast = new HasAtLeast(i, goals);
        not = new Not(hasAtLeast);
    }

    @Override
    public boolean matches(Player p) {
        return not.matches(p);
    }

    
}