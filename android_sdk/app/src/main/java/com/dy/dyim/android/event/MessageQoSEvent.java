
package com.dy.dyim.android.event;

import java.util.ArrayList;

import com.dy.zserver.protocal.Protocal;

public interface MessageQoSEvent
{
	void messagesLost(ArrayList<Protocal> lostMessages);
	void messagesBeReceived(String theFingerPrint);
}
