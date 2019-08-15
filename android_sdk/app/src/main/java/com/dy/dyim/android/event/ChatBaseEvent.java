package com.dy.dyim.android.event;

public interface ChatBaseEvent
{
    public void onLoginMessage(int dwErrorCode);
    public void onLinkCloseMessage(int dwErrorCode);	
}
