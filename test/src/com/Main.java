package com;

import com.app.sandbox.Example;
import com.window.Window;

public class Main
{


    public static void main(String[] args) throws InterruptedException
    {
        Window window = new Window("Window", 960, 640);
        window.addLayer(new Example());
    }


}
