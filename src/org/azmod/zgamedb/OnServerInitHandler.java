package org.azmod.zgamedb;

import com.avrix.events.OnServerInitializeEvent;

/**
 * Event handler'OnServerInitializeEvent'
 */
public class OnServerInitHandler extends OnServerInitializeEvent {

    public OnServerInitHandler(Main m) {
        super();
        main = m;
    }

    private Main main;
    /**
     * Called Event Handling Method
     */
    @Override
    public void handleEvent() {
        try {
            main.gameDBUtil.test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
