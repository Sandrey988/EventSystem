package com.window;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;


@SuppressWarnings("serial")
public class Window extends Canvas
{
    private BufferStrategy bs;
    private Graphics g;
    private JFrame frame;

    public Window(String name, int width, int height)
    {
        setPreferredSize(new Dimension(width, height));
        init(name);

    }

    private void init(String name)
    {
        frame = new JFrame(name);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }

    private void render() throws InterruptedException
    {
        if (bs == null) createBufferStrategy(3);
        bs = getBufferStrategy();
        g = bs.getDrawGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(0,0,getWidth(), getHeight());
        onRender(g);
        g.dispose();
        bs.show();

        try
        {
            Thread.sleep(3);
        }
        catch (InterruptedException e)
        {

        }
        EventQueue.invokeLater( () ->
        {
            try
            {
                render();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        });
    }

    private void onRender(Graphics g)
    {

    }

}
