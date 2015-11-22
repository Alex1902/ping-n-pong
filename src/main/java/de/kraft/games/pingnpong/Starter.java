package de.kraft.games.pingnpong;


import de.kraft.games.pingnpong.menu.MainMenu;

import javax.swing.*;

public class Starter extends JFrame
{

    public static void main( final String[] args )
    {
        new MainMenu( "pingNpong" );
    }

    private Starter( String title )
    {

    }
}
