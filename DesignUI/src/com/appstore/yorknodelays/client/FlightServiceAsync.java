package com.appstore.yorknodelays.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface FlightServiceAsync {

	void greetServer(String name, AsyncCallback<String> callback);

}
