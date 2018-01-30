package com.events.types;

import com.events.Event;

public class MouseMotionEvent extends Event
{

    private int x, y;
    private boolean dragged;

    protected MouseMotionEvent(int x, int y, boolean dragged)
    {
        super(Type.MOUSE_MOVED);
        this.x = x;
        this.y = y;
        this.dragged = dragged;

    }

    public int getX() {return x;}
    public int getY() {return y;}
    public boolean isDragged() {return dragged;}

    /** https://youtu.be/OfbH8dJFz6M?t=1278 */
}
