package com.app.sandbox;


import com.app.Layer;
import com.app.events.Dispatcher;
import com.app.events.Event;
import com.app.events.types.MouseMotionEvent;
import com.app.events.types.MousePressedEvent;
import com.app.events.types.MouseReleasedEvent;

public class Example  extends Layer
{


    public void onEvent(Event event)
    {
        Dispatcher dispatcher = new Dispatcher(event);
        dispatcher.dispatch(Event.Type.MOUSE_PRESSED,(Event e) -> onPressed( (MousePressedEvent) e ));
        dispatcher.dispatch(Event.Type.MOUSE_MOVED,(Event e) -> onMoved( (MouseMotionEvent) e ));
        dispatcher.dispatch(Event.Type.MOUSE_RELEASED,(Event e) -> onReleased( (MouseReleasedEvent) e ));

    }



    private Boolean onPressed(MousePressedEvent event)
    {
        System.out.println("Mouse Pressed" + event.getKeyCode());
        return false;
    }

    private Boolean onReleased(MouseReleasedEvent event)
    {
        System.out.println("Mouse released");
        return false;
    }

    private Boolean onMoved(MouseMotionEvent event)
    {
        System.out.println("Mouse moved: " + event.getX() + " | " + event.getY());
        return false;
    }
}
