package com.snfc.adapter;

import com.snfc.connector.GermanPlugConnector;
import com.snfc.connector.UKPlugConnector;

public class PlugConnectorAdapter implements UKPlugConnector, GermanPlugConnector{
	
	private GermanPlugConnector dePlug;
	private UKPlugConnector ukPlug;

    public PlugConnectorAdapter (GermanPlugConnector plug) {
        this.dePlug = plug;
    }
    
    public PlugConnectorAdapter (UKPlugConnector plug) {
        this.ukPlug = plug;
    }

    @Override
    public void getElectricity() {
    	dePlug.consumeElectricity();
    }

	@Override
	public void consumeElectricity() {
		ukPlug.getElectricity();
		
	}


}
