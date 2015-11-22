package de.kraft.games.pingnpong;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel
{
    private final Image backgroundImage;
    private final JLabel homePoints;
    private final JLabel visitorPoints;

    public GamePanel()
    {
        setFocusable( true );

        ClassLoader classLoader = getClass().getClassLoader();
        ImageIcon imageIcon = new ImageIcon( classLoader.getResource( "backgrounds/gamePanelBackground.jpg" ).getPath() );
        backgroundImage = imageIcon.getImage();
        setSize( imageIcon.getIconWidth(), imageIcon.getIconHeight() );


        Font font = new Font( "Verdana", Font.BOLD, 40 );

        homePoints = new JLabel( "0" );
        homePoints.setVisible( true );
        homePoints.setFont( font );
        homePoints.setForeground( java.awt.Color.WHITE );
        homePoints.setBackground( java.awt.Color.WHITE );
        homePoints.setBounds( 300, 10, 100, 100 );
        homePoints.setBorder( javax.swing.BorderFactory.createLineBorder( java.awt.Color.ORANGE, 1 ) );

        visitorPoints = new JLabel( "0" );
        visitorPoints.setVisible( true );
        visitorPoints.setFont( font );
        visitorPoints.setForeground( java.awt.Color.WHITE );
        visitorPoints.setBackground( java.awt.Color.WHITE );
        visitorPoints.setBounds( 400, 10, 100, 100 );
        visitorPoints.setBorder( javax.swing.BorderFactory.createLineBorder( java.awt.Color.ORANGE, 1 ) );

        add( homePoints );
        add( visitorPoints );
    }

    @Override
    protected void paintComponent( Graphics g )
    {
        super.paintComponent( g );
        ((Graphics2D) g).drawImage( backgroundImage, 0, 0, null );
    }

}
