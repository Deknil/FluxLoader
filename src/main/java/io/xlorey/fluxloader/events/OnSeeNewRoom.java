package io.xlorey.fluxloader.events;

import zombie.iso.areas.IsoRoom;

/**
 * Author: Deknil
 * GitHub: <a href=https://github.com/Deknil>https://github.com/Deknil</a>
 * Date: 07.02.2024
 * Description: Triggered for each room about to get spawned, the first time a character gets close enough to the building where the room is located.
 * <p>FluxLoader © 2024. All rights reserved.</p>
 */
public abstract class OnSeeNewRoom extends Event {
    /**
     * Getting the event name
     * @return name of the event being implemented
     */
    @Override
    public String getEventName() { return "OnSeeNewRoom"; }
    
    /**
    * Called Event Handling Method
    * @param room The room about to get spawned.
    */
    public void handleEvent(IsoRoom room) {}
}
