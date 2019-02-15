package com.snfc.adapter;

import com.snfc.connector.GermanPlugConnector;
import com.snfc.connector.UKPlugConnector;
import com.snfc.device.Fan;
import com.snfc.device.Tv;
import com.snfc.socket.GermanElectricalSocket;
import com.snfc.socket.UKElectricalSocket;

public class Run {

	public static void main(String[] args) {
		// de to uk
		GermanPlugConnector dePlug = new Tv(); 
		UKPlugConnector ukPlug = new PlugConnectorAdapter(dePlug);
		UKElectricalSocket ukSocket = new UKElectricalSocket();
		ukSocket.plugIn(ukPlug);
		
		// uk to de
		UKPlugConnector ukPlug2 = new Fan();
		GermanPlugConnector dePlug2 = new PlugConnectorAdapter(ukPlug2);
		GermanElectricalSocket deSocket = new GermanElectricalSocket();
		deSocket.plugIn(dePlug2);

	}

}
