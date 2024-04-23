package io.xlorey.fluxloader.events;

/**
 * Author: Deknil
 * GitHub: <a href=https://github.com/Deknil>https://github.com/Deknil</a>
 * Date: 07.02.2024
 * Description: Triggered after a Steam workship item was successfully updated.
 * <p>FluxLoader © 2024. All rights reserved.</p>
 */
public abstract class OnSteamWorkshopItemUpdated extends Event {
    /**
     * Getting the event name
     * @return name of the event being implemented
     */
    @Override
    public String getEventName() { return "OnSteamWorkshopItemUpdated"; }
    
    /**
    * Called Event Handling Method
    * @param userNeedsToAcceptWorkshopLegalAgreement Whether the user has to accept the workshop legal agreement.
    */
    public void handleEvent(Boolean userNeedsToAcceptWorkshopLegalAgreement) {}
}
