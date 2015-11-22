package de.kraft.games.pingnpong.menu;

import de.kraft.games.pingnpong.GamePanel;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by al9kr5 on 31.08.2015.
 */
public class MainMenu extends JFrame
{
    private final JButton play;
    private final JButton settings;
    private final JButton close;

    public MainMenu( final String title ) throws java.awt.HeadlessException
    {
        super( title );
        play = new javax.swing.JButton( "Play" );
        settings = new javax.swing.JButton( "Settings" );
        close = new javax.swing.JButton( "Close" );

        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setSize( 400, 400 );

        setLayout( null );
        setVisible( true );

        setTitle( title );

        initButtons();
    }

    private void initButtons()
    {
        play.addActionListener( new ActionListener()
        {

            public void actionPerformed( final ActionEvent e )
            {
                JFrame gameFrame = new JFrame( "Ping 'N Pong" );
                gameFrame.setDefaultCloseOperation( EXIT_ON_CLOSE );
                gameFrame.setSize( 1000, 800 );
                gameFrame.setVisible( true );
                gameFrame.setContentPane( new GamePanel() );
            }
        } );
        play.setBounds( 120, 40, 160, 40 );
        add( play );

        settings.addActionListener( new ActionListener()
        {
            public void actionPerformed( final java.awt.event.ActionEvent e )
            {

            }
        } );
        settings.setBounds( 120, 100, 160, 40 );
        add( settings );

        close.addActionListener( new ActionListener()
        {
            public void actionPerformed( final java.awt.event.ActionEvent e )
            {
                System.exit( 0 );
            }
        } );
        close.setBounds( 120, 160, 160, 40 );
        add( close );
    }
}
